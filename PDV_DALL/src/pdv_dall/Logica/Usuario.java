/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdv_dall.Logica;

import BD.BDUsuario;

/**
 *
 * @author Toshiba
 */
public class Usuario {
    private int id;
    private String cedula;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private int idRol;
    private String provincia;
    private String canton;
    private String distrito;
    private String fechaNacimiento;
    private String contrasena;
    private String telefono;
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getId() {
        return id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
   
    public int getIdRol() {
        return idRol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCanton() {
        return canton;
    }

    public String getDistrito() {
        return distrito;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    
    
    public void obtenerUsuario(){
        
    }
    
    public void Loging(){
        BDUsuario conexion = new BDUsuario();
        Usuario usu = conexion.obtenerUsuario(this.cedula);
        if (usu.getNombre() != null) {
            if (this.contrasena.equals(usu.getContrasena())) {
                this.nombre = usu.getNombre();
                this.canton = usu.getCanton();
                this.distrito = usu.getDistrito();
                this.id = usu.getId();
                this.idRol = usu.getIdRol();
                this.primerApellido = usu.getPrimerApellido();
                this.provincia = usu.getProvincia();
                this.segundoApellido = usu.getSegundoApellido();
                this.telefono = usu.getTelefono();
            } else {
                System.out.println("Contraseña incorrecta");
            }
        } else {
            System.out.println("Cedula incorrecta");
        }
    }
    
}
