/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cajeroonline;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_user = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        button_Ingresar = new javax.swing.JButton();
        button_Olvide = new javax.swing.JButton();
        button_Registrarse = new javax.swing.JButton();
        txt_pass = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.magenta);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel2.setText("Contraseña:");
        jLabel2.setToolTipText("");

        button_Ingresar.setText("Ingresar");
        button_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_IngresarActionPerformed(evt);
            }
        });

        button_Olvide.setText("Olvide Contraseña");
        button_Olvide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_OlvideActionPerformed(evt);
            }
        });

        button_Registrarse.setText("Registrarse");
        button_Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_RegistrarseActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cajeroonline/pngwing.com (2).png"))); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(46, 46, 46)
                                        .addComponent(button_Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(button_Registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel2)
                                    .addComponent(txt_user)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(225, 225, 225)
                                .addComponent(button_Olvide)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_Registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_Olvide, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_RegistrarseActionPerformed
        new Registro().setVisible(true);
    }//GEN-LAST:event_button_RegistrarseActionPerformed

    private void button_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_IngresarActionPerformed

        Connection cn = c.getConnection();
        if (txt_user.getText().equals("") || txt_pass.getPassword().equals("")) {
            JOptionPane.showMessageDialog(null, "Hay campos en blanco.");
        } else {
            try {
                PreparedStatement pst = cn.prepareStatement("select * from user_data where binary user_user = ? and binary user_pass = ?");
                pst.setString(1, txt_user.getText().trim());
                pst.setString(2, new String(txt_pass.getPassword()));
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    user.setUser(txt_user.getText().trim());
                    dispose();
                    user.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "No existe usuario y/o contraseña");
                }
                pst.close();
                rs.close();
                cn.close();
            } catch (Exception ex) {
                System.out.println("Error en modfi: " + ex);
            }
        }
    }//GEN-LAST:event_button_IngresarActionPerformed

    private void button_OlvideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_OlvideActionPerformed
        String usuario = JOptionPane.showInputDialog(null,
                "Ingrese su nombre de usuario:",
                "Ingreso de Usuario",
                JOptionPane.QUESTION_MESSAGE);
        if (usuario == null || usuario.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Cancelado");
        } else {
            Connection cn = c.getConnection();
            String statement = "select * from user_data where user_user = ?";
            try {
                PreparedStatement pst = cn.prepareStatement(statement);
                pst.setString(1, usuario);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    int id = rs.getInt("ID");

                    statement = "select * from preguntas_data where user_id = ?";
                    PreparedStatement ps = cn.prepareStatement(statement);
                    ps.setInt(1, id);
                    ResultSet r = ps.executeQuery();
                    if (r.next()) {
                        String respuesta = JOptionPane.showInputDialog(null,
                                r.getString("pregunta"),
                                "Pregunta",
                                JOptionPane.QUESTION_MESSAGE);
                        if (respuesta.equals(r.getString("respuesta"))) {
                            user.setUser(usuario);
                            JOptionPane.showMessageDialog(null, "Recorda cambiar la contraseña una vez que entras desde Modificar Usuario");
                            dispose();
                            user.setVisible(true);
                        } else {
                            statement = "insert into ayuda_data values(?,?,?,?)";
                            PreparedStatement p = cn.prepareStatement(statement);
                            p.setInt(1, id);
                            p.setString(2, "Olvido contraseña");
                            p.setInt(3, 0);
                            p.setString(4, "Incompleto");
                            p.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Se genero un ticket para tu ayuda, contactate con nosotros");
                            p.close();
                        }
                    }
                    r.close();
                    ps.close();
                }
                cn.close();
                pst.close();
                rs.close();
            } catch (Exception e) {
                System.out.println("Error en olvido: " + e);
            }
        }
    }//GEN-LAST:event_button_OlvideActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    private Panel user = new Panel();
    private Conection c = new Conection();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Ingresar;
    private javax.swing.JButton button_Olvide;
    private javax.swing.JButton button_Registrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}
