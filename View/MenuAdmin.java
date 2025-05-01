package View;

import Controller.MedicamentoController;

public class MenuAdmin extends javax.swing.JFrame {
    
    private MedicamentoController controlador = new MedicamentoController();
    
    public MenuAdmin(MedicamentoController controlador) {
        this.controlador = controlador;
        initComponents();
    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ButtonAgregarProducto = new javax.swing.JButton();
        ButtonConsultarInventario = new javax.swing.JButton();
        ButtonEliminarMedicamento = new javax.swing.JButton();
        ButtonConsultarMedicamento = new javax.swing.JButton();
        ButtonCerrarSesion = new javax.swing.JButton();
        ButtonSalir = new javax.swing.JButton();
        ButtonAdministracionUsuarios = new javax.swing.JButton();
        ButtonModificarMedicamentos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setForeground(new java.awt.Color(0, 102, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/resized_image_400x1000.jpeg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("¡BIENVENIDO!");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Menu Admin");

        ButtonAgregarProducto.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        ButtonAgregarProducto.setText("1. Agregar producto");
        ButtonAgregarProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ButtonAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgregarProductoActionPerformed(evt);
            }
        });

        ButtonConsultarInventario.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        ButtonConsultarInventario.setText("2. Consultar Inventario");
        ButtonConsultarInventario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ButtonConsultarInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConsultarInventarioActionPerformed(evt);
            }
        });

        ButtonEliminarMedicamento.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        ButtonEliminarMedicamento.setText("5. Eliminar Medicamento");
        ButtonEliminarMedicamento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ButtonEliminarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEliminarMedicamentoActionPerformed(evt);
            }
        });

        ButtonConsultarMedicamento.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        ButtonConsultarMedicamento.setText("3. Consultar Medicamento");
        ButtonConsultarMedicamento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ButtonConsultarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonConsultarMedicamentoActionPerformed(evt);
            }
        });

        ButtonCerrarSesion.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        ButtonCerrarSesion.setText("7. Cerrar Sesion");
        ButtonCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ButtonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCerrarSesionActionPerformed(evt);
            }
        });

        ButtonSalir.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        ButtonSalir.setText("8. Salir");
        ButtonSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalirActionPerformed(evt);
            }
        });

        ButtonAdministracionUsuarios.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        ButtonAdministracionUsuarios.setText("6. Administracion de Usuarios");
        ButtonAdministracionUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAdministracionUsuariosActionPerformed(evt);
            }
        });

        ButtonModificarMedicamentos.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        ButtonModificarMedicamentos.setText("4. Modificar Medicamento");
        ButtonModificarMedicamentos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ButtonModificarMedicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonModificarMedicamentosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ButtonAgregarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonConsultarInventario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonConsultarMedicamento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(94, 94, 94))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ButtonCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonAdministracionUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(ButtonEliminarMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonModificarMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(29, 29, 29)
                        .addComponent(ButtonAgregarProducto)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonConsultarInventario)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonConsultarMedicamento)
                        .addGap(26, 26, 26)
                        .addComponent(ButtonModificarMedicamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonEliminarMedicamento)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonAdministracionUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(ButtonCerrarSesion)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonSalir))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregarProductoActionPerformed
        AgregarProducto agregarProducto = new AgregarProducto(controlador);
        agregarProducto.setVisible(true);
        agregarProducto.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_ButtonAgregarProductoActionPerformed

    private void ButtonEliminarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEliminarMedicamentoActionPerformed
        EliminarProducto eliminarProducto = new EliminarProducto(controlador);
        eliminarProducto.setVisible(true);
        eliminarProducto.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_ButtonEliminarMedicamentoActionPerformed

    private void ButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ButtonSalirActionPerformed

    private void ButtonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCerrarSesionActionPerformed
        Login login = new Login();
        this.setVisible(false);
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }//GEN-LAST:event_ButtonCerrarSesionActionPerformed

    private void ButtonConsultarInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConsultarInventarioActionPerformed
        ConsultarInventario consultarInventario = new ConsultarInventario(controlador);
        consultarInventario.setVisible(true);
        consultarInventario.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_ButtonConsultarInventarioActionPerformed

    private void ButtonConsultarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonConsultarMedicamentoActionPerformed
        ConsultarMedicamento consultarMedicamento = new ConsultarMedicamento(controlador);
        consultarMedicamento.setVisible(true);
        consultarMedicamento.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_ButtonConsultarMedicamentoActionPerformed

    private void ButtonAdministracionUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAdministracionUsuariosActionPerformed
        AdministracionUsuarios administracionUsuarios = new AdministracionUsuarios(controlador, null);
        administracionUsuarios.setVisible(true);
        administracionUsuarios.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_ButtonAdministracionUsuariosActionPerformed

    private void ButtonModificarMedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonModificarMedicamentosActionPerformed
        ModificarMedicamento modificarMedicamento = new ModificarMedicamento(controlador);
        modificarMedicamento.setVisible(true);
        modificarMedicamento.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_ButtonModificarMedicamentosActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAdministracionUsuarios;
    private javax.swing.JButton ButtonAgregarProducto;
    private javax.swing.JButton ButtonCerrarSesion;
    private javax.swing.JButton ButtonConsultarInventario;
    private javax.swing.JButton ButtonConsultarMedicamento;
    private javax.swing.JButton ButtonEliminarMedicamento;
    private javax.swing.JButton ButtonModificarMedicamentos;
    private javax.swing.JButton ButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
