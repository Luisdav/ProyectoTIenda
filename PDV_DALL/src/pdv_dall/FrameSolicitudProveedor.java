/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdv_dall;

/**
 *
 * @author Daniela
 */
public class FrameSolicitudProveedor extends javax.swing.JFrame {

    /**
     * Creates new form FrameSolicitudProveedor
     */
    FrameDashboard frameDashboard;
    
    public FrameSolicitudProveedor() {
        initComponents();
    }

    
    public void setDashboardFrame(FrameDashboard frameDashboard){
        this.frameDashboard = frameDashboard;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelSolicitudProveedor = new javax.swing.JPanel();
        FrameSolicitudAProveedores = new javax.swing.JLabel();
        BotonDashboard = new javax.swing.JButton();
        BotonClientes = new javax.swing.JButton();
        BotonProveedores = new javax.swing.JButton();
        BotonColaboradores = new javax.swing.JButton();
        BotonProductos = new javax.swing.JButton();
        BotonFactura = new javax.swing.JButton();
        BotonTienda = new javax.swing.JButton();
        BotonPedido = new javax.swing.JButton();
        BotonPuntoContacto = new javax.swing.JButton();
        LabelIDSolicitudProveedor = new javax.swing.JLabel();
        LabelIDProveedor = new javax.swing.JLabel();
        LabelCantidadSolicitada = new javax.swing.JLabel();
        LabelIDProducto = new javax.swing.JLabel();
        LabelFecha = new javax.swing.JLabel();
        TextFieldIDSolicitudProveedor = new javax.swing.JTextField();
        TextFieldIDProveedor = new javax.swing.JTextField();
        TextFieldIDProducto = new javax.swing.JTextField();
        TextFieldCantidadSolicitada = new javax.swing.JTextField();
        TextFieldFecha = new javax.swing.JTextField();
        BotonAgregar = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        BotonImprimir = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();
        BotonSolicitudProveedores = new javax.swing.JButton();
        BotonApartados = new javax.swing.JButton();
        BotonAbono = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelSolicitudProveedor.setMinimumSize(new java.awt.Dimension(1150, 600));

        FrameSolicitudAProveedores.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FrameSolicitudAProveedores.setText("Solicitud a Proveedores");

        BotonDashboard.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonDashboard.setText("Dashboard");
        BotonDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDashboardActionPerformed(evt);
            }
        });

        BotonClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonClientes.setText("Clientes");

        BotonProveedores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonProveedores.setText("Proveedores");

        BotonColaboradores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonColaboradores.setText("Colaboradores");

        BotonProductos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonProductos.setText("Productos");

        BotonFactura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonFactura.setText("Factura");
        BotonFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFacturaActionPerformed(evt);
            }
        });

        BotonTienda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonTienda.setText("Tienda");
        BotonTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTiendaActionPerformed(evt);
            }
        });

        BotonPedido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonPedido.setText("Pedido entre Tiendas");
        BotonPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPedidoActionPerformed(evt);
            }
        });

        BotonPuntoContacto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonPuntoContacto.setText("Punto Contacto del Proveedor");

        LabelIDSolicitudProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelIDSolicitudProveedor.setText("ID Solicitud a Proveedor");

        LabelIDProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelIDProveedor.setText("ID Proveedor");

        LabelCantidadSolicitada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelCantidadSolicitada.setText("Cantidad Solicitada");

        LabelIDProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelIDProducto.setText("ID Producto");

        LabelFecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelFecha.setText("Fecha");

        TextFieldIDSolicitudProveedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextFieldIDSolicitudProveedor.setText("jTextField1");

        TextFieldIDProveedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextFieldIDProveedor.setText("jTextField1");

        TextFieldIDProducto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextFieldIDProducto.setText("jTextField1");

        TextFieldCantidadSolicitada.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextFieldCantidadSolicitada.setText("jTextField1");

        TextFieldFecha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TextFieldFecha.setText("jTextField1");

        BotonAgregar.setBackground(new java.awt.Color(51, 153, 0));
        BotonAgregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        BotonAgregar.setText("Agregar");

        BotonModificar.setBackground(new java.awt.Color(0, 51, 255));
        BotonModificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonModificar.setForeground(new java.awt.Color(255, 255, 255));
        BotonModificar.setText("Modificar");

        BotonEliminar.setBackground(new java.awt.Color(255, 0, 0));
        BotonEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BotonEliminar.setText("Eliminar");

        BotonImprimir.setBackground(new java.awt.Color(0, 153, 102));
        BotonImprimir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonImprimir.setForeground(new java.awt.Color(255, 255, 255));
        BotonImprimir.setText("Imprimir");

        BotonGuardar.setBackground(new java.awt.Color(255, 102, 0));
        BotonGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        BotonGuardar.setText("Guardar");

        BotonSolicitudProveedores.setBackground(new java.awt.Color(153, 153, 153));
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

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout PanelSolicitudProveedorLayout = new javax.swing.GroupLayout(PanelSolicitudProveedor);
        PanelSolicitudProveedor.setLayout(PanelSolicitudProveedorLayout);
        PanelSolicitudProveedorLayout.setHorizontalGroup(
            PanelSolicitudProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSolicitudProveedorLayout.createSequentialGroup()
                .addGroup(PanelSolicitudProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelSolicitudProveedorLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelSolicitudProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FrameSolicitudAProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelSolicitudProveedorLayout.createSequentialGroup()
                                .addComponent(BotonDashboard)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PanelSolicitudProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelSolicitudProveedorLayout.createSequentialGroup()
                                        .addComponent(BotonSolicitudProveedores)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotonApartados)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotonAbono))
                                    .addGroup(PanelSolicitudProveedorLayout.createSequentialGroup()
                                        .addComponent(BotonClientes)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BotonProveedores)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BotonColaboradores)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BotonProductos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BotonFactura)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BotonTienda)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BotonPedido)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BotonPuntoContacto))))))
                    .addGroup(PanelSolicitudProveedorLayout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addGroup(PanelSolicitudProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelSolicitudProveedorLayout.createSequentialGroup()
                                .addComponent(BotonAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonEliminar))
                            .addGroup(PanelSolicitudProveedorLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(PanelSolicitudProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelSolicitudProveedorLayout.createSequentialGroup()
                                        .addGroup(PanelSolicitudProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LabelIDSolicitudProveedor)
                                            .addComponent(LabelIDProveedor)
                                            .addComponent(LabelIDProducto)
                                            .addComponent(LabelCantidadSolicitada))
                                        .addGap(18, 18, 18)
                                        .addGroup(PanelSolicitudProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TextFieldCantidadSolicitada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TextFieldIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TextFieldIDProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TextFieldIDSolicitudProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(PanelSolicitudProveedorLayout.createSequentialGroup()
                                        .addComponent(BotonGuardar)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotonImprimir)))))))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSolicitudProveedorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LabelFecha)
                .addGap(18, 18, 18)
                .addComponent(TextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        PanelSolicitudProveedorLayout.setVerticalGroup(
            PanelSolicitudProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSolicitudProveedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FrameSolicitudAProveedores)
                .addGap(24, 24, 24)
                .addGroup(PanelSolicitudProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonDashboard)
                    .addComponent(BotonClientes)
                    .addComponent(BotonProveedores)
                    .addComponent(BotonColaboradores)
                    .addComponent(BotonProductos)
                    .addComponent(BotonFactura)
                    .addComponent(BotonTienda)
                    .addComponent(BotonPedido)
                    .addComponent(BotonPuntoContacto))
                .addGap(39, 39, 39)
                .addGroup(PanelSolicitudProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonSolicitudProveedores)
                    .addComponent(BotonApartados)
                    .addComponent(BotonAbono))
                .addGap(21, 21, 21)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelSolicitudProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelFecha)
                    .addComponent(TextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelSolicitudProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelIDSolicitudProveedor)
                    .addComponent(TextFieldIDSolicitudProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelSolicitudProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextFieldIDProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelIDProveedor))
                .addGap(18, 18, 18)
                .addGroup(PanelSolicitudProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextFieldIDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelIDProducto))
                .addGap(18, 18, 18)
                .addGroup(PanelSolicitudProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextFieldCantidadSolicitada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelCantidadSolicitada))
                .addGap(54, 54, 54)
                .addGroup(PanelSolicitudProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonGuardar)
                    .addComponent(BotonImprimir))
                .addGap(18, 18, 18)
                .addGroup(PanelSolicitudProveedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAgregar)
                    .addComponent(BotonModificar)
                    .addComponent(BotonEliminar))
                .addContainerGap(173, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelSolicitudProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelSolicitudProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDashboardActionPerformed
        this.frameDashboard.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonDashboardActionPerformed

    private void BotonFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonFacturaActionPerformed

    private void BotonTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTiendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonTiendaActionPerformed

    private void BotonPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonPedidoActionPerformed

    private void BotonSolicitudProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSolicitudProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonSolicitudProveedoresActionPerformed

    private void BotonApartadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonApartadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonApartadosActionPerformed

    private void BotonAbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAbonoActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(FrameSolicitudProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameSolicitudProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameSolicitudProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameSolicitudProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameSolicitudProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAbono;
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JButton BotonApartados;
    private javax.swing.JButton BotonClientes;
    private javax.swing.JButton BotonColaboradores;
    private javax.swing.JButton BotonDashboard;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonFactura;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonImprimir;
    private javax.swing.JButton BotonModificar;
    private javax.swing.JButton BotonPedido;
    private javax.swing.JButton BotonProductos;
    private javax.swing.JButton BotonProveedores;
    private javax.swing.JButton BotonPuntoContacto;
    private javax.swing.JButton BotonSolicitudProveedores;
    private javax.swing.JButton BotonTienda;
    private javax.swing.JLabel FrameSolicitudAProveedores;
    private javax.swing.JLabel LabelCantidadSolicitada;
    private javax.swing.JLabel LabelFecha;
    private javax.swing.JLabel LabelIDProducto;
    private javax.swing.JLabel LabelIDProveedor;
    private javax.swing.JLabel LabelIDSolicitudProveedor;
    private javax.swing.JPanel PanelSolicitudProveedor;
    private javax.swing.JTextField TextFieldCantidadSolicitada;
    private javax.swing.JTextField TextFieldFecha;
    private javax.swing.JTextField TextFieldIDProducto;
    private javax.swing.JTextField TextFieldIDProveedor;
    private javax.swing.JTextField TextFieldIDSolicitudProveedor;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
