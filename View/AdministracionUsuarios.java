
package View;

import Controller.MedicamentoController;
import controller.UsuarioController;

public class AdministracionUsuarios extends javax.swing.JFrame {

    private final MedicamentoController controlador;
    private final UsuarioController usuario;
    
    public AdministracionUsuarios(MedicamentoController controlador, UsuarioController usuario) {
        initComponents();
        this.controlador = controlador;
        this.usuario = usuario;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ButtonMostrarUsuario = new javax.swing.JButton();
        ButtonAgregarUsuario = new javax.swing.JButton();
        ButtonEliminarUsuario = new javax.swing.JButton();
        ButtonModificarUsuario = new javax.swing.JButton();
        ButtonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/farmaplux_400x600.jpg"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ELIJA UNA OPCION");

        ButtonMostrarUsuario.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        ButtonMostrarUsuario.setText("1. Mostrar Usuarios");
        ButtonMostrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMostrarUsuarioActionPerformed(evt);
            }
        });

        ButtonAgregarUsuario.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        ButtonAgregarUsuario.setText("2. Agregar Usuario");
        ButtonAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgregarUsuarioActionPerformed(evt);
            }
        });

        ButtonEliminarUsuario.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        ButtonEliminarUsuario.setText("3. Eliminar Usuario");
        ButtonEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEliminarUsuarioActionPerformed(evt);
            }
        });

        ButtonModificarUsuario.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        ButtonModificarUsuario.setText("4. Modificar Usuario");
        ButtonModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonModificarUsuarioActionPerformed(evt);
            }
        });

        ButtonVolver.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        ButtonVolver.setText("Volver");
        ButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ButtonMostrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonAgregarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonEliminarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonModificarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(ButtonVolver)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(ButtonMostrarUsuario)
                .addGap(33, 33, 33)
                .addComponent(ButtonAgregarUsuario)
                .addGap(29, 29, 29)
                .addComponent(ButtonEliminarUsuario)
                .addGap(30, 30, 30)
                .addComponent(ButtonModificarUsuario)
                .addGap(18, 18, 18)
                .addComponent(ButtonVolver)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addGap(37, 37, 37)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void ButtonMostrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMostrarUsuarioActionPerformed
        MostrarUsuario mostrarUsuario = new MostrarUsuario(controlador, usuario);
        mostrarUsuario.setVisible(true);
        mostrarUsuario.setLocationRelativeTo(null);
         this.setVisible(false);
    }//GEN-LAST:event_ButtonMostrarUsuarioActionPerformed

    private void ButtonEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEliminarUsuarioActionPerformed
        EliminarUsuario eliminarUsuario = new EliminarUsuario(controlador, usuario);
        eliminarUsuario.setVisible(true);
        eliminarUsuario.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_ButtonEliminarUsuarioActionPerformed

    private void ButtonAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgregarUsuarioActionPerformed
        AgregarUsuario agregarUsuario = new AgregarUsuario(controlador, usuario);
        agregarUsuario.setVisible(true);
        agregarUsuario.setLocationRelativeTo(null);
         this.setVisible(false);
    }//GEN-LAST:event_ButtonAgregarUsuarioActionPerformed

    private void ButtonModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonModificarUsuarioActionPerformed
        ModificarUsuario modificarUsuario = new ModificarUsuario(controlador, usuario);
        modificarUsuario.setVisible(true);
        modificarUsuario.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_ButtonModificarUsuarioActionPerformed

    private void ButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVolverActionPerformed
        MenuAdmin menuAdmin = new MenuAdmin(controlador);
        this.setVisible(false);
        menuAdmin.setVisible(true);
        menuAdmin.setLocationRelativeTo(null);
    }//GEN-LAST:event_ButtonVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgregarUsuario;
    private javax.swing.JButton ButtonEliminarUsuario;
    private javax.swing.JButton ButtonModificarUsuario;
    private javax.swing.JButton ButtonMostrarUsuario;
    private javax.swing.JButton ButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
