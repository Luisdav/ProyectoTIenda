package pdv_dall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luisƒernando
 */
public class Proveedores extends javax.swing.JFrame {

    /**
     * Creates new form Proveedores
     */
    FrameDashboard frameDashboard;
    
    public Proveedores() {
        initComponents();
    }

    public void setDashboardFrame(FrameDashboard frameDashboard){
        this.frameDashboard = frameDashboard;
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panelProveedores = new javax.swing.JPanel();
        FrameProveedores = new javax.swing.JLabel();
        LabelNombreProveedor = new javax.swing.JLabel();
        TextFieldNombreProveedor = new javax.swing.JTextField();
        LabelIDDireccion = new javax.swing.JLabel();
        TextFieldIDDireccion = new javax.swing.JTextField();
        LabelNombreContacto = new javax.swing.JLabel();
        TextFieldNombreContacto = new javax.swing.JTextField();
        LabelTelefonoProveedor = new javax.swing.JLabel();
        TextFieldTelefonoProveedor = new javax.swing.JTextField();
        LabelEmail = new javax.swing.JLabel();
        TextFieldEmail = new javax.swing.JTextField();
        BotonPuntoContacto = new javax.swing.JButton();
        LabelCedulaJuridica = new javax.swing.JLabel();
        TextFieldCedulaJuridica = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProveedores = new javax.swing.JTable();
        BotonDashboard = new javax.swing.JButton();
        BotonClientes = new javax.swing.JButton();
        BotonProveedores = new javax.swing.JButton();
        BotonColaboradores = new javax.swing.JButton();
        BotonProductos = new javax.swing.JButton();
        BotonFactura = new javax.swing.JButton();
        BotonTienda = new javax.swing.JButton();
        BotonPedido = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();
        BotonImprimir = new javax.swing.JButton();
        BotonAgregar = new javax.swing.JButton();
        BotonModificar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        LabelIDProveedor = new javax.swing.JLabel();
        TextFieldIDProveedor = new javax.swing.JTextField();
        LabelApellidoContacto = new javax.swing.JLabel();
        TextFieldApellidoContacto = new javax.swing.JTextField();
        BotonSolicitudProveedores = new javax.swing.JButton();
        BotonApartados = new javax.swing.JButton();
        BotonAbono = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelProveedores.setForeground(new java.awt.Color(204, 204, 204));
        panelProveedores.setPreferredSize(new java.awt.Dimension(1150, 600));

        FrameProveedores.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FrameProveedores.setText("Proveedores");

        LabelNombreProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelNombreProveedor.setText("Nombre de Proveedor");

        TextFieldNombreProveedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        LabelIDDireccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelIDDireccion.setText("ID Dirección");

        TextFieldIDDireccion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        LabelNombreContacto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelNombreContacto.setText("Nombre de Contacto");

        TextFieldNombreContacto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        LabelTelefonoProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelTelefonoProveedor.setText("Telefono de Proveedor");

        TextFieldTelefonoProveedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        LabelEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelEmail.setText("Email");

        TextFieldEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        BotonPuntoContacto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonPuntoContacto.setText("Punto Contacto del Proveedor");

        LabelCedulaJuridica.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelCedulaJuridica.setText("Cedula Juridica");

        TextFieldCedulaJuridica.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        TablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Pais", "Ciudad", "Telefono", "Correo Electronico", "Cedula Juridica"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaProveedores);

        BotonDashboard.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonDashboard.setText("Dashboard");
        BotonDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDashboardActionPerformed(evt);
            }
        });

        BotonClientes.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonClientes.setText("Clientes");

        BotonProveedores.setBackground(new java.awt.Color(153, 153, 153));
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

        BotonGuardar.setBackground(new java.awt.Color(255, 102, 0));
        BotonGuardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        BotonGuardar.setText("Guardar");

        BotonImprimir.setBackground(new java.awt.Color(0, 153, 102));
        BotonImprimir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BotonImprimir.setForeground(new java.awt.Color(255, 255, 255));
        BotonImprimir.setText("Imprimir");

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

        LabelIDProveedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelIDProveedor.setText("ID Proveedor");

        TextFieldIDProveedor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        LabelApellidoContacto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelApellidoContacto.setText("Apellido de Contacto");

        TextFieldApellidoContacto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

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

        javax.swing.GroupLayout panelProveedoresLayout = new javax.swing.GroupLayout(panelProveedores);
        panelProveedores.setLayout(panelProveedoresLayout);
        panelProveedoresLayout.setHorizontalGroup(
            panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProveedoresLayout.createSequentialGroup()
                .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProveedoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1130, Short.MAX_VALUE))
                    .addGroup(panelProveedoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FrameProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelProveedoresLayout.createSequentialGroup()
                                .addComponent(BotonDashboard)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelProveedoresLayout.createSequentialGroup()
                                        .addComponent(BotonSolicitudProveedores)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotonApartados)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotonAbono))
                                    .addGroup(panelProveedoresLayout.createSequentialGroup()
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
                    .addGroup(panelProveedoresLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProveedoresLayout.createSequentialGroup()
                                .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelNombreProveedor)
                                    .addComponent(LabelIDDireccion)
                                    .addComponent(LabelIDProveedor))
                                .addGap(33, 33, 33)
                                .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TextFieldIDDireccion)
                                        .addComponent(TextFieldIDProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(TextFieldNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelProveedoresLayout.createSequentialGroup()
                                .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(LabelNombreContacto)
                                        .addComponent(LabelTelefonoProveedor)
                                        .addComponent(LabelEmail)
                                        .addComponent(LabelCedulaJuridica))
                                    .addGroup(panelProveedoresLayout.createSequentialGroup()
                                        .addComponent(LabelApellidoContacto)
                                        .addGap(12, 12, 12)))
                                .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelProveedoresLayout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TextFieldTelefonoProveedor)
                                            .addComponent(TextFieldEmail)
                                            .addComponent(TextFieldCedulaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelProveedoresLayout.createSequentialGroup()
                                        .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TextFieldApellidoContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TextFieldNombreContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(1, 1, 1)))))
                        .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelProveedoresLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelProveedoresLayout.createSequentialGroup()
                                        .addComponent(BotonAgregar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BotonModificar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(BotonEliminar))
                                    .addGroup(panelProveedoresLayout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addComponent(BotonGuardar)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotonImprimir)))
                                .addGap(161, 161, 161))
                            .addGroup(panelProveedoresLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        panelProveedoresLayout.setVerticalGroup(
            panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FrameProveedores)
                .addGap(24, 24, 24)
                .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonDashboard)
                    .addComponent(BotonClientes)
                    .addComponent(BotonProveedores)
                    .addComponent(BotonColaboradores)
                    .addComponent(BotonProductos)
                    .addComponent(BotonFactura)
                    .addComponent(BotonTienda)
                    .addComponent(BotonPedido)
                    .addComponent(BotonPuntoContacto))
                .addGap(31, 31, 31)
                .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonSolicitudProveedores)
                    .addComponent(BotonApartados)
                    .addComponent(BotonAbono))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProveedoresLayout.createSequentialGroup()
                        .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonGuardar)
                            .addComponent(BotonImprimir))
                        .addGap(18, 18, 18)
                        .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonAgregar)
                            .addComponent(BotonModificar)
                            .addComponent(BotonEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))
                    .addGroup(panelProveedoresLayout.createSequentialGroup()
                        .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelIDProveedor)
                            .addComponent(TextFieldIDProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelCedulaJuridica)
                            .addComponent(TextFieldCedulaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelNombreProveedor)
                            .addComponent(TextFieldNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelNombreContacto)
                            .addComponent(TextFieldNombreContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelApellidoContacto)
                            .addComponent(TextFieldApellidoContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelTelefonoProveedor)
                            .addComponent(TextFieldTelefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelEmail)
                            .addComponent(TextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelIDDireccion)
                            .addComponent(TextFieldIDDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedores().setVisible(true);
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
    private javax.swing.JLabel FrameProveedores;
    private javax.swing.JLabel LabelApellidoContacto;
    private javax.swing.JLabel LabelCedulaJuridica;
    private javax.swing.JLabel LabelEmail;
    private javax.swing.JLabel LabelIDDireccion;
    private javax.swing.JLabel LabelIDProveedor;
    private javax.swing.JLabel LabelNombreContacto;
    private javax.swing.JLabel LabelNombreProveedor;
    private javax.swing.JLabel LabelTelefonoProveedor;
    private javax.swing.JTable TablaProveedores;
    private javax.swing.JTextField TextFieldApellidoContacto;
    private javax.swing.JTextField TextFieldCedulaJuridica;
    private javax.swing.JTextField TextFieldEmail;
    private javax.swing.JTextField TextFieldIDDireccion;
    private javax.swing.JTextField TextFieldIDProveedor;
    private javax.swing.JTextField TextFieldNombreContacto;
    private javax.swing.JTextField TextFieldNombreProveedor;
    private javax.swing.JTextField TextFieldTelefonoProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel panelProveedores;
    // End of variables declaration//GEN-END:variables
}
