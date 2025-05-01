package View;

import Controller.MedicamentoController;
import controller.UsuarioController;

public class EliminarUsuario extends javax.swing.JFrame {
    
    private final UsuarioController usuario;
    private final MedicamentoController controlador;
    
    public EliminarUsuario(MedicamentoController controlador, UsuarioController usuario) {
        initComponents();
        this.controlador = controlador;
        this.usuario = usuario;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LabelEliminarUsuario = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LabelNombreUsuaarioaEliminar = new javax.swing.JLabel();
        TextFieldEliminarUsuario = new javax.swing.JTextField();
        ButtonEliminarUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextAreaEliminarUsuario = new javax.swing.JTextArea();
        ButtonVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/farmaplux_400x600.jpg"))); // NOI18N

        LabelEliminarUsuario.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        LabelEliminarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        LabelEliminarUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelEliminarUsuario.setText("Eliminar Usuario");

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        LabelNombreUsuaarioaEliminar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        LabelNombreUsuaarioaEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNombreUsuaarioaEliminar.setText("Nombre de Usuario a eliminar");

        ButtonEliminarUsuario.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        ButtonEliminarUsuario.setText("Eliminar");
        ButtonEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEliminarUsuarioActionPerformed(evt);
            }
        });

        TextAreaEliminarUsuario.setColumns(20);
        TextAreaEliminarUsuario.setRows(5);
        jScrollPane1.setViewportView(TextAreaEliminarUsuario);

        ButtonVolver.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
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
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ButtonEliminarUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonVolver))
                    .addComponent(TextFieldEliminarUsuario)
                    .addComponent(LabelNombreUsuaarioaEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(LabelNombreUsuaarioaEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextFieldEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonEliminarUsuario)
                    .addComponent(ButtonVolver))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelEliminarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LabelEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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

    private void ButtonEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEliminarUsuarioActionPerformed
        try {
        String nombre = (TextFieldEliminarUsuario.getText().trim());
        
        boolean eliminado = usuario.eliminarUsuario(nombre);

        if (eliminado) {
            TextAreaEliminarUsuario.setText("Usuario " + nombre + " eliminado exitosamente.");
        } else {
            TextAreaEliminarUsuario.setText("Usuario " + nombre + " no encontrado.");
        }
    } catch (NumberFormatException ex) {
        TextAreaEliminarUsuario.setText("Por favor ingresa un Usuario válido.");
    }
    }//GEN-LAST:event_ButtonEliminarUsuarioActionPerformed

    private void ButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVolverActionPerformed
        AdministracionUsuarios administracionUsuarios = new AdministracionUsuarios(controlador, usuario);
        this.setVisible(false);
        administracionUsuarios.setVisible(true);
        administracionUsuarios.setLocationRelativeTo(null);
    }//GEN-LAST:event_ButtonVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEliminarUsuario;
    private javax.swing.JButton ButtonVolver;
    private javax.swing.JLabel LabelEliminarUsuario;
    private javax.swing.JLabel LabelNombreUsuaarioaEliminar;
    private javax.swing.JTextArea TextAreaEliminarUsuario;
    private javax.swing.JTextField TextFieldEliminarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
