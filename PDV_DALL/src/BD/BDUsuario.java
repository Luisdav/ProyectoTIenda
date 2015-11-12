/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import pdv_dall.Logica.Usuario;

/**
 *
 * @author Toshiba
 */
public class BDUsuario {

    private static final String servidor = "jdbc:mysql://sql5.freesqldatabase.com/sql594788";
    private static final String usuario = "sql594788";
    private static final String password = "mW2*jU8!";
    private Connection conexion;

    public BDUsuario() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(servidor, usuario, password);
        } catch (Exception ex) {
            System.out.println("Ha ocurrido un problema durante la conexion");
        }

    }

    public Usuario obtenerUsuario(String cedula) {
        Usuario usu = new Usuario();
        try {
            Statement comando = conexion.createStatement();
            ResultSet resultado = null;
            boolean consulta = comando.execute("Select * from Usuario where cedula='" + cedula + "';");
            if (consulta) {
                resultado = comando.getResultSet();
                while (resultado.next()) {
                    usu.setId(resultado.getInt("id"));
                    usu.setNombre(resultado.getString("nombre"));
                    usu.setCedula(cedula);
                    usu.setContrasena(resultado.getString("login"));
                    usu.setPrimerApellido(resultado.getString("apellido1"));
                    usu.setSegundoApellido(resultado.getString("apellido2"));
                    usu.setIdRol(resultado.getInt("idRol"));
                    usu.setTelefono(resultado.getString("telefono"));
                    int idDireccion = resultado.getInt("idDireccion");
                    obtenerDistrito(idDireccion, usu);
                }
            } else {
                usu = null;
            }

            
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener usuario");
        }
        return usu;
    }
    
    private void obtenerDistrito(int id,Usuario usu){     
        try {
            Statement comando = conexion.createStatement();
            ResultSet resultado = null;
            boolean consulta = comando.execute("Select * from Distrito where id='" + id + "';");
            if (consulta) {
                resultado = comando.getResultSet();
                while (resultado.next()) {
                   int idCanton = resultado.getInt("idCanton");
                   String distrito= resultado.getString("nombre");
                   usu.setDistrito(distrito);
                    obtenerCanton(idCanton, usu);
                }
            } else {
           
            }
            
        } catch (SQLException ex) {
            System.out.println("Error al obtener provincia del usuario");
        }
    }
    
     private void obtenerCanton(int id,Usuario usu){
        
        try {
            Statement comando = conexion.createStatement();
            ResultSet resultado = null;
            boolean consulta = comando.execute("Select * from Canton where id='" + id + "';");
            if (consulta) {
                resultado = comando.getResultSet();
                while (resultado.next()) {
                   int idProvincia = resultado.getInt("idProvincia");
                   String canton = resultado.getString("nombre");
                   usu.setCanton(canton);
                    obtenerProvincia(idProvincia, usu);
                }
            } else {
           
            }
           
        } catch (SQLException ex) {
            System.out.println("Error al obtener canton del usuario");
        }
    }

     private void obtenerProvincia(int id,Usuario usu){
        
        try {
            Statement comando = conexion.createStatement();
            ResultSet resultado = null;
            boolean consulta = comando.execute("Select * from Provincia where id='" + id + "';");
            if (consulta) {
                resultado = comando.getResultSet();
                while (resultado.next()) {
                   String provincia = resultado.getString("nombre");
                   usu.setProvincia(provincia);
                }
            } else {
           
            }
           
        } catch (SQLException ex) {
            System.out.println("Error al obtener provincia del usuario");
        }
    }
}
