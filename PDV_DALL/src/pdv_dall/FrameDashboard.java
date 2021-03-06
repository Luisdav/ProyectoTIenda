package pdv_dall;

import pdv_dall.Logica.Usuario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daniela
 */

  
public class FrameDashboard extends javax.swing.JFrame {

    /**
     * Creates new form FrameDashboard
     */
    FrameClientes frameClientes;
    Tabla_Movimientos tabla_Movimientos;
    FrameFactura frameFactura;
    JFrameProductos jframeProductos;
    Proveedores proveedores;
    FrameColaboradores frameColaboradores;
    FrameTienda frameTienda;
    FrameSolicitudProveedor frameSolicitudProveedor;
    FrameApartado frameApartado;
    FrameAbono frameAbono;
    Usuario usu;
    
    public FrameDashboard() {
        initComponents();
    this.frameClientes = new FrameClientes();
    this.tabla_Movimientos = new Tabla_Movimientos();
    this.frameFactura = new FrameFactura();
    this.jframeProductos = new JFrameProductos ();
    this.proveedores = new Proveedores();
    this.frameColaboradores = new FrameColaboradores();
    this.frameTienda = new FrameTienda();
    this.frameSolicitudProveedor = new FrameSolicitudProveedor ();
    this.frameApartado = new FrameApartado();
    this.frameAbono = new FrameAbono();
    }

    public void establecerUsuario(Usuario ingresado) {
        usu = ingresado;
        LabelUsuario.setText("Bienvenido " + usu.getNombre() + " " + usu.getPrimerApellido());
        int idRol = usu.getIdRol();
    }

    private void esconderBotones() {
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelDashboard = new javax.swing.JPanel();
        ButtonDashboard = new javax.swing.JButton();
        ButtonClientes = new javax.swing.JButton();
        BotonProveedores = new javax.swing.JButton();
        BotonColaboradores = new javax.swing.JButton();
        BotonProductos = new javax.swing.JButton();
        BotonFacturas = new javax.swing.JButton();
        BotonTienda = new javax.swing.JButton();
        LabelUsuario = new javax.swing.JLabel();
        LabelPuntoVenta = new javax.swing.JLabel();
        LabelPuntodeVenta = new javax.swing.JLabel();
        BotonPedidos = new javax.swing.JButton();
        BotonSolicitudProveedores = new javax.swing.JButton();
        BotonApartados = new javax.swing.JButton();
        BotonAbono = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelDashboard.setPreferredSize(new java.awt.Dimension(1000, 600));

        ButtonDashboard.setBackground(new java.awt.Color(153, 153, 153));
        ButtonDashboard.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ButtonDashboard.setText("Dashboard");
        ButtonDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDashboardActionPerformed(evt);
            }
        });

        ButtonClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ButtonClientes.setText("Clientes");
        ButtonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClientesActionPerformed(evt);
            }
        });

        BotonProveedores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonProveedores.setText("Proveedores");
        BotonProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonProveedoresActionPerformed(evt);
            }
        });

        BotonColaboradores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonColaboradores.setText("Colaboradores");
        BotonColaboradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonColaboradoresActionPerformed(evt);
            }
        });

        BotonProductos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonProductos.setText("Productos");
        BotonProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonProductosActionPerformed(evt);
            }
        });

        BotonFacturas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonFacturas.setText("Facturas");
        BotonFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFacturasActionPerformed(evt);
            }
        });

        BotonTienda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonTienda.setText("Tienda");
        BotonTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTiendaActionPerformed(evt);
            }
        });

        LabelUsuario.setText("Usuario");

        LabelPuntoVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelPuntoVenta.setText("Dashboard");

        LabelPuntodeVenta.setText("Punto de Venta");

        BotonPedidos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonPedidos.setText("Pedidos entre tiendas");
        BotonPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPedidosActionPerformed(evt);
            }
        });

        BotonSolicitudProveedores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonSolicitudProveedores.setText("Solicitud a Proveedores");
        BotonSolicitudProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSolicitudProveedoresActionPerformed(evt);
            }
        });

        BotonApartados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonApartados.setText("Apartados");
        BotonApartados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonApartadosActionPerformed(evt);
            }
        });

        BotonAbono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonAbono.setText("Abonos");
        BotonAbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAbonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDashboardLayout = new javax.swing.GroupLayout(PanelDashboard);
        PanelDashboard.setLayout(PanelDashboardLayout);
        PanelDashboardLayout.setHorizontalGroup(
            PanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDashboardLayout.createSequentialGroup()
                .addGroup(PanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDashboardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelPuntoVenta)
                            .addGroup(PanelDashboardLayout.createSequentialGroup()
                                .addComponent(ButtonDashboard)
                                .addGap(18, 18, 18)
                                .addGroup(PanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BotonSolicitudProveedores)
                                    .addGroup(PanelDashboardLayout.createSequentialGroup()
                                        .addComponent(ButtonClientes)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotonProveedores)))
                                .addGap(18, 18, 18)
                                .addGroup(PanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelDashboardLayout.createSequentialGroup()
                                        .addComponent(BotonColaboradores)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotonProductos)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotonFacturas)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotonTienda)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotonPedidos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                                        .addComponent(LabelUsuario))
                                    .addGroup(PanelDashboardLayout.createSequentialGroup()
                                        .addComponent(BotonApartados)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotonAbono)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(PanelDashboardLayout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(LabelPuntodeVenta)))
                .addGap(45, 45, 45))
        );
        PanelDashboardLayout.setVerticalGroup(
            PanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDashboardLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(LabelPuntoVenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonDashboard)
                    .addComponent(ButtonClientes)
                    .addComponent(BotonProveedores)
                    .addComponent(BotonColaboradores)
                    .addComponent(BotonProductos)
                    .addComponent(BotonFacturas)
                    .addComponent(BotonTienda)
                    .addComponent(LabelUsuario)
                    .addComponent(BotonPedidos))
                .addGap(28, 28, 28)
                .addGroup(PanelDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonSolicitudProveedores)
                    .addComponent(BotonApartados)
                    .addComponent(BotonAbono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 410, Short.MAX_VALUE)
                .addComponent(LabelPuntodeVenta)
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 1150, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDashboardActionPerformed
         
    }//GEN-LAST:event_ButtonDashboardActionPerformed

    private void ButtonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonClientesActionPerformed
       this.frameClientes.setDashboardFrame(this);                             
        this.frameClientes.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ButtonClientesActionPerformed

    private void BotonProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonProveedoresActionPerformed
        this.proveedores.setDashboardFrame(this);                             
        this.proveedores.setVisible(true);
        this.setVisible(false);  
    }//GEN-LAST:event_BotonProveedoresActionPerformed

    private void BotonPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPedidosActionPerformed
        this.tabla_Movimientos.setDashboardFrame(this);                             
        this.tabla_Movimientos.setVisible(true);
        this.setVisible(false);       
    }//GEN-LAST:event_BotonPedidosActionPerformed

    private void BotonFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFacturasActionPerformed
        this.frameFactura.setDashboardFrame(this);                             
        this.frameFactura.setVisible(true);
        this.setVisible(false);        
    }//GEN-LAST:event_BotonFacturasActionPerformed

    private void BotonProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonProductosActionPerformed
        this.jframeProductos.setDashboardFrame(this);                             
        this.jframeProductos.setVisible(true);
        this.setVisible(false);     
    }//GEN-LAST:event_BotonProductosActionPerformed

    private void BotonColaboradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonColaboradoresActionPerformed
        this.frameColaboradores.setDashboardFrame(this);
        this.frameColaboradores.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonColaboradoresActionPerformed

    private void BotonTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTiendaActionPerformed
        this.frameTienda.setDashboardFrame(this);
        this.frameTienda.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonTiendaActionPerformed

    private void BotonSolicitudProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSolicitudProveedoresActionPerformed
        this.frameSolicitudProveedor.setDashboardFrame(this);
        this.frameSolicitudProveedor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonSolicitudProveedoresActionPerformed

    private void BotonApartadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonApartadosActionPerformed
        this.frameApartado.setDashboardFrame(this);
        this.frameApartado.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonApartadosActionPerformed

    private void BotonAbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAbonoActionPerformed
        this.frameAbono.setDashboardFrame(this);
        this.frameAbono.setVisible (true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonAbonoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAbono;
    private javax.swing.JButton BotonApartados;
    private javax.swing.JButton BotonColaboradores;
    private javax.swing.JButton BotonFacturas;
    private javax.swing.JButton BotonPedidos;
    private javax.swing.JButton BotonProductos;
    private javax.swing.JButton BotonProveedores;
    private javax.swing.JButton BotonSolicitudProveedores;
    private javax.swing.JButton BotonTienda;
    private javax.swing.JButton ButtonClientes;
    private javax.swing.JButton ButtonDashboard;
    private javax.swing.JLabel LabelPuntoVenta;
    private javax.swing.JLabel LabelPuntodeVenta;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JPanel PanelDashboard;
    // End of variables declaration//GEN-END:variables
}
