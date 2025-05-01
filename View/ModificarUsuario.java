package View;

import Controller.MedicamentoController;
import controller.UsuarioController;
import Model.Usuario;
import javax.swing.JOptionPane;

public class ModificarUsuario extends javax.swing.JFrame {
    
    private Usuario usuario1;
    private final UsuarioController usuario;
    private final MedicamentoController controlador;

    public ModificarUsuario(MedicamentoController controlador, UsuarioController usuario) {
        initComponents();
        this.usuario = usuario;
        this.controlador = controlador;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TextFieldUsuarioaModificar = new javax.swing.JTextField();
        ButtonBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TextFieldModificarUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TextFieldModificarContraseña = new javax.swing.JTextField();
        ButtonVolver = new javax.swing.JButton();
        ButtonGuardarInformacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/farmaplux_400x600.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese el nombre de usuario a modificar:");

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Modificar Usuario");

        ButtonBuscar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        ButtonBuscar.setText("Buscar");
        ButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setText("Digite la nueva contraseña");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setText("Digite el nuevo nombre");

        ButtonVolver.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        ButtonVolver.setText("Volver");
        ButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVolverActionPerformed(evt);
            }
        });

        ButtonGuardarInformacion.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        ButtonGuardarInformacion.setText("Guardar Informacion");
        ButtonGuardarInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGuardarInformacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(TextFieldUsuarioaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonBuscar)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(ButtonVolver)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ButtonGuardarInformacion))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TextFieldModificarUsuario)
                                    .addComponent(TextFieldModificarContraseña)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextFieldUsuarioaModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonBuscar))
                .addGap(53, 53, 53)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldModificarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonVolver)
                    .addComponent(ButtonGuardarInformacion))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVolverActionPerformed
        AdministracionUsuarios administracionUsuarios = new AdministracionUsuarios(controlador, usuario);
        this.setVisible(false);
        administracionUsuarios.setVisible(true);
        administracionUsuarios.setLocationRelativeTo(null);
    }//GEN-LAST:event_ButtonVolverActionPerformed

    private void ButtonGuardarInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGuardarInformacionActionPerformed
        if (usuario1 == null) {
            JOptionPane.showMessageDialog(this, "Por favor, busque un usuario antes de intentar modificarlo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }


        String nuevoNombreUsuario = TextFieldModificarUsuario.getText().trim();
        String nuevaContraseña = TextFieldModificarContraseña.getText().trim();

        if (nuevoNombreUsuario.isEmpty() || nuevaContraseña.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos antes de modificar.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }


        usuario1.setNombreUsuario(nuevoNombreUsuario);
        usuario1.setContraseña(nuevaContraseña);

        JOptionPane.showMessageDialog(this, "Usuario modificado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        TextFieldUsuarioaModificar.setText("");
        TextFieldModificarUsuario.setText("");
        TextFieldModificarContraseña.setText("");
        usuario1 = null;
    }//GEN-LAST:event_ButtonGuardarInformacionActionPerformed

    private void ButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBuscarActionPerformed
        String nombreUsuario = TextFieldUsuarioaModificar.getText().trim();

        if (nombreUsuario.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un nombre de usuario para buscar.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        usuario1 = usuario.buscarUsuario(nombreUsuario);

        if (usuario1 == null) {
            JOptionPane.showMessageDialog(this, "Usuario no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            TextFieldModificarUsuario.setText(usuario1.getNombreUsuario());
            TextFieldModificarContraseña.setText(usuario1.getContraseña());
        }

    }//GEN-LAST:event_ButtonBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBuscar;
    private javax.swing.JButton ButtonGuardarInformacion;
    private javax.swing.JButton ButtonVolver;
    private javax.swing.JTextField TextFieldModificarContraseña;
    private javax.swing.JTextField TextFieldModificarUsuario;
    private javax.swing.JTextField TextFieldUsuarioaModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
