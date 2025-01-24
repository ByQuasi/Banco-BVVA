/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cajeroonline;

import java.awt.BorderLayout;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Panel extends javax.swing.JFrame {

    /**
     * Creates new form Panel
     */
    public Panel() {
        initComponents();
        setLocationRelativeTo(null);

    }

    /**
     * a
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jDialog1 = new javax.swing.JDialog();
        button_plata = new javax.swing.JButton();
        button_tarjeta = new javax.swing.JButton();
        button_creditos = new javax.swing.JButton();
        button_modif = new javax.swing.JButton();
        button_seguros = new javax.swing.JButton();
        button_inver = new javax.swing.JButton();
        button_mall = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        meun = new javax.swing.JMenu();
        ayudaMenu = new javax.swing.JMenuItem();
        usuariosMenu = new javax.swing.JMenuItem();
        ingresosMenu = new javax.swing.JMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        button_plata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cajeroonline/pngwing.com (1).png"))); // NOI18N
        button_plata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_plataActionPerformed(evt);
            }
        });

        button_tarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cajeroonline/pngwing..png"))); // NOI18N
        button_tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_tarjetaActionPerformed(evt);
            }
        });

        button_creditos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cajeroonline/platainver.png"))); // NOI18N
        button_creditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_creditosActionPerformed(evt);
            }
        });

        button_modif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cajeroonline/pngwing.com.png"))); // NOI18N
        button_modif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_modifActionPerformed(evt);
            }
        });

        button_seguros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cajeroonline/segurida.png"))); // NOI18N
        button_seguros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_segurosActionPerformed(evt);
            }
        });

        button_inver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cajeroonline/inver.png"))); // NOI18N
        button_inver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_inverActionPerformed(evt);
            }
        });

        button_mall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cajeroonline/shopp.png"))); // NOI18N
        button_mall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_mallActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cajeroonline/x.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton1.setText("Baja de Cuenta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Modificar usuario");

        jLabel2.setText("Plata");

        jLabel3.setText("Tarjetas");

        jLabel4.setText("Creditos");

        jLabel5.setText("Seguros");

        jLabel6.setText("Inversiones");

        jLabel7.setText("Mall");

        jLabel8.setText("Cerrar Sesion");

        meun.setText("Herramientas");

        ayudaMenu.setText("Ayuda");
        ayudaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaMenuActionPerformed(evt);
            }
        });
        meun.add(ayudaMenu);

        usuariosMenu.setText("Usuarios");
        usuariosMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosMenuActionPerformed(evt);
            }
        });
        meun.add(usuariosMenu);

        ingresosMenu.setText("Ingresos");
        ingresosMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresosMenuActionPerformed(evt);
            }
        });
        meun.add(ingresosMenu);

        jMenuBar1.add(meun);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel1)
                        .addGap(187, 187, 187)
                        .addComponent(jLabel2)
                        .addGap(221, 221, 221)
                        .addComponent(jLabel3)
                        .addGap(203, 203, 203)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button_seguros, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button_inver, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button_mall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel5)
                                .addGap(188, 188, 188)
                                .addComponent(jLabel6)
                                .addGap(212, 212, 212)
                                .addComponent(jLabel7)
                                .addGap(206, 206, 206)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(button_modif, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                .addComponent(button_plata, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                .addComponent(button_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                                .addComponent(button_creditos, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button_plata, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(button_modif, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button_creditos, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(button_mall, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(button_inver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button_seguros, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_modifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_modifActionPerformed
        usuario = new Usuario();
        usuario.getUser(user);
        usuario.setVisible(true);
    }//GEN-LAST:event_button_modifActionPerformed

    private void button_plataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_plataActionPerformed
        plata = new Plata();
        plata.getUser(user);
        plata.setVisible(true);
    }//GEN-LAST:event_button_plataActionPerformed

    private void button_tarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_tarjetaActionPerformed
        tarjetas = new Tarjetas();
        tarjetas.getUser(user);
        tarjetas.setVisible(true);
    }//GEN-LAST:event_button_tarjetaActionPerformed

    private void button_creditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_creditosActionPerformed
        setUser(user);

        if (tarjeta < 1) {
            JOptionPane.showMessageDialog(null, "No posee tarjeta con nosotros");
        } else {
            creditos = new Creditos();
            creditos.getUser(user);
            creditos.setVisible(true);
        }
    }//GEN-LAST:event_button_creditosActionPerformed

    private void button_inverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_inverActionPerformed
        setUser(user);
        if (tarjeta < 1) {
            JOptionPane.showMessageDialog(null, "No posee tarjeta con nosotros");
        } else {
            inversiones = new Invensiones();
            inversiones.getUser(user);
            inversiones.setVisible(true);
        }
    }//GEN-LAST:event_button_inverActionPerformed

    private void button_mallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_mallActionPerformed

        setUser(user);
        if (tarjeta < 1) {
            JOptionPane.showMessageDialog(null, "No posee tarjeta con nosotros");
        } else {
            mall = new Mall();
            mall.getUser(user);
            mall.setVisible(true);
        }
    }//GEN-LAST:event_button_mallActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        for (java.awt.Window window : java.awt.Window.getWindows()) {
            window.dispose();
        }
        Login log = new Login();
        log.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection cn = c.getConnection();
        try {
            PreparedStatement pst = cn.prepareStatement("insert into ayuda_data values(?,?,?,?)");
            pst.setInt(1, user_id);
            pst.setString(2, "Baja de Cuenta");
            pst.setString(3, "0");
            pst.setString(4, "Incompleto");
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Ticket Creado!");
            pst.close();
            cn.close();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void usuariosMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosMenuActionPerformed
        ayuda = new ayudas();
        ayuda.setLocationRelativeTo(null);
        ayuda.setVisible(true);
    }//GEN-LAST:event_usuariosMenuActionPerformed

    private void ingresosMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresosMenuActionPerformed
        ingreso = new IngresoMaster();
        ingreso.setLocationRelativeTo(null);
        ingreso.setVisible(true);
    }//GEN-LAST:event_ingresosMenuActionPerformed

    private void ayudaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaMenuActionPerformed
        Connection cn = c.getConnection();
        JPopupMenu menu = new JPopupMenu();
        JPanel panel = new JPanel();
        DefaultTableModel tabla = new DefaultTableModel();
        tabla.addColumn("Usuario");
        tabla.addColumn("Tipo");
        tabla.addColumn("ID");
        JTable table = new JTable(tabla);
        panel.setLayout(new BorderLayout());
        panel.add(new JScrollPane(table), BorderLayout.CENTER);
        try {
            PreparedStatement pst = cn.prepareStatement("SELECT a.user_id, a.tipo, a.unique_id, u.level FROM ayuda_data a JOIN "
                    + "user_data u ON a.user_id = u.id where status = 'Incompleto' ORDER BY (CASE WHEN u.level = 2 THEN 0 ELSE 1 END), u.level ASC");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                do {
                    tabla.addRow(new Object[]{rs.getInt("user_id"), rs.getString("tipo"), rs.getInt("unique_id")});
                } while (rs.next());
            } else {
                JOptionPane.showMessageDialog(null, "No hay Tickets");
            }
            cn.close();
            pst.close();
            rs.close();
        } catch (Exception e) {
        }
        table.setComponentPopupMenu(menu);

        JFrame frame = new JFrame("Tabla con Menú Contextual");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500, 400);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }//GEN-LAST:event_ayudaMenuActionPerformed

    private void button_segurosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_segurosActionPerformed
        seguros = new Seguros();
        seguros.getUser(user);
        seguros.setVisible(true);
    }//GEN-LAST:event_button_segurosActionPerformed

    public void setUser(String user) {
        this.user = user;
        Connection cn = c.getConnection();
        try {
            PreparedStatement pst = cn.prepareStatement("select * from user_data where user_user = ?");
            pst.setString(1, user);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                user_id = rs.getInt("id");
                tarjeta = rs.getInt("tarjetas");
                level = rs.getInt("level");
                if (tarjeta < 1) {
                    button_creditos.setEnabled(false);
                    button_inver.setEnabled(false);
                    button_mall.setEnabled(false);
                }
                if (level > 2) {

                    meun.setEnabled(true);
                    if (level == 4) {
                        ingresosMenu.setEnabled(true);
                    } else {
                        ingresosMenu.setEnabled(false);
                    }
                } else {

                    meun.setEnabled(false);
                }
            }
            cn.close();
            pst.close();
            rs.close();
        } catch (Exception e) {
            System.out.println("Error en setUser: " + e);
        }
    }

    private int user_id, level;
    private ayudas ayuda;
    private Conection c = new Conection();
    private String user;
    private int tarjeta;
    private Plata plata;
    private Usuario usuario;
    private Tarjetas tarjetas;
    private Creditos creditos;
    private Seguros seguros;
    private Invensiones inversiones;
    private Mall mall;
    private IngresoMaster ingreso;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ayudaMenu;
    private javax.swing.JButton button_creditos;
    private javax.swing.JButton button_inver;
    private javax.swing.JButton button_mall;
    private javax.swing.JButton button_modif;
    private javax.swing.JButton button_plata;
    private javax.swing.JButton button_seguros;
    private javax.swing.JButton button_tarjeta;
    private javax.swing.JMenuItem ingresosMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenu meun;
    private javax.swing.JMenuItem usuariosMenu;
    // End of variables declaration//GEN-END:variables
}
