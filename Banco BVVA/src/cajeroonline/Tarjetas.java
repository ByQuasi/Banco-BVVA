/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cajeroonline;

import java.awt.CardLayout;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Tarjetas extends javax.swing.JFrame {

    /**
     * Creates new form tarjetas
     */
    public Tarjetas() {
        initComponents();
        setLocationRelativeTo(null);
        Connection cn = c.getConnection();
        prepareUser(cn);
        try {
            cn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Tarjetas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        Credito = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        obtenerC_button = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_credit = new javax.swing.JTable();
        Debito = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_debit = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        obtenerD_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pagarC_button = new javax.swing.JButton();
        bajaC_button = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        bajaD_button = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel11.setBackground(new java.awt.Color(102, 102, 102));

        Credito.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel2.setText("Tarjeta de credito");

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea2.setColumns(20);
        jTextArea2.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setText("La tarjeta de credito le proporcionara\nmanera de cubrir esos gastos que tienen\nun monto alto y no pueden pagarlo a full\no mismo crear un historial crediticio \npagando en tiempo y forma, lo que \nle permitira ingresar a mejores creditos\nfuturos.");
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane4.setViewportView(jTextArea2);

        obtenerC_button.setText("Obtener");
        obtenerC_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obtenerC_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(obtenerC_button)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(44, 44, 44)))
                .addGap(66, 66, 66))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(obtenerC_button)
                .addGap(42, 42, 42))
        );

        Credito.add(jPanel1, "card2");

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        table_credit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Movimiento", "Deposito", "Cuotas"
            }
        ));
        jScrollPane3.setViewportView(table_credit);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
        );

        Credito.add(jPanel2, "card3");

        Debito.setLayout(new java.awt.CardLayout());

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        table_debit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Movimiento", "Deposito"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_debit);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
        );

        Debito.add(jPanel4, "card3");

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setRows(5);
        jTextArea1.setText("La tarjeta de debito te permitira tener \nuna forma de abonar tus gastos de \nmanera contactless y de manera virtual\nlo que hace que no tengas que estar \nllevando fajos de billetes o monedas\nen los bolsillos, asi facilitando una \ncarga menor en la persona.\n");
        jTextArea1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(jTextArea1);

        obtenerD_button.setText("Obtener");
        obtenerD_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obtenerD_buttonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("Tarjeta de debito");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(obtenerD_button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(obtenerD_button)
                .addGap(42, 42, 42))
        );

        Debito.add(jPanel3, "card2");

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));
        jPanel7.setLayout(new java.awt.CardLayout());

        jPanel6.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 195, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 151, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel6, "card3");

        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setText("Monto total a pagar:");

        jLabel15.setText("jLabel15");

        jLabel16.setText("jLabel16");

        jLabel9.setText("Minimo:");

        jLabel7.setText("Limite:");

        jLabel14.setText("jLabel14");

        jLabel4.setText("Tarjeta de credito");

        jLabel6.setText("//nombre");

        pagarC_button.setText("Pagar");
        pagarC_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagarC_buttonActionPerformed(evt);
            }
        });

        bajaC_button.setText("Baja");
        bajaC_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaC_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel16))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel15))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel14))))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bajaC_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pagarC_button)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pagarC_button)
                    .addComponent(bajaC_button))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel8, "card2");

        jPanel9.setBackground(new java.awt.Color(102, 102, 102));
        jPanel9.setLayout(new java.awt.CardLayout());

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bajaD_button.setText("Baja");
        bajaD_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaD_buttonActionPerformed(evt);
            }
        });

        jLabel11.setText("Extraccion diaria:");

        jLabel13.setText("-");

        jLabel5.setText("No actiba");

        jLabel3.setText("Tarjeta de debito:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addGap(0, 43, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addComponent(bajaD_button)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addComponent(bajaD_button)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel9.add(jPanel10, "card2");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Debito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Credito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Debito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Credito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(245, 245, 245))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void obtenerC_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obtenerC_buttonActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(
                null,
                "¿Estás seguro de que deseas obtener la tarjeta?",
                "Confirmación de Baja",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
        );

        if (respuesta == JOptionPane.YES_OPTION) {
            Connection cn = c.getConnection();
            try {
                PreparedStatement pst = cn.prepareStatement("insert into ayuda_data values(?,?,?,?)");
                pst.setInt(1, user_id);
                pst.setString(2, "Obtener Credito T");
                pst.setString(3, "0");
                pst.setString(4, "Incompleto");
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Ticket Creado!");
                pst.close();
                cn.close();
            } catch (Exception e) {

            }

        }
    }//GEN-LAST:event_obtenerC_buttonActionPerformed

    private void bajaD_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaD_buttonActionPerformed
        if (tarjetas > 1) {
            JOptionPane.showMessageDialog(null, "Primero debes dar la baja de la tarjeta de Credito");
        } else {

            int respuesta = JOptionPane.showConfirmDialog(
                    null,
                    "¿Estás seguro de que deseas dar de baja la tarjeta?",
                    "Confirmación de Baja",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE
            );

            if (respuesta == JOptionPane.YES_OPTION) {

                Connection cn = c.getConnection();
                try {
                    PreparedStatement pst = cn.prepareStatement("update user_data set tarjetas = ? where id = ?");
                    pst.setInt(1, 0);
                    pst.setInt(2, user_id);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Baja realizada!");
                    pst.close();
                    prepareUser(cn);
                    cn.close();
                } catch (Exception e) {
                    System.out.println(e + " asdasdasd");
                }

            }
        }

    }//GEN-LAST:event_bajaD_buttonActionPerformed

    private void pagarC_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagarC_buttonActionPerformed
        if (plata > money) {
            JOptionPane.showMessageDialog(null, "Fondos Insuficientes");
        } else {

            int respuesta = JOptionPane.showConfirmDialog(
                    null,
                    "¿Estás seguro de que deseas pagar la tarjeta?",
                    "Confirmación de Pago",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE
            );
            if (respuesta == JOptionPane.YES_OPTION) {
                Connection cn = c.getConnection();
                try {
                    java.util.Date utilDate = new java.util.Date(); // Fecha actual
                    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
                    PreparedStatement ps = cn.prepareStatement("insert into pagos_data values(?,?,?,?,?,?)");

                    for (int i = 0; i < pagar.size(); i++) {
                        ps.setInt(1, user_id);
                        ps.setDouble(2, pagar.get(i));
                        ps.setInt(3, 1);
                        ps.setInt(4, ids.get(i));
                        ps.setString(5, "0");
                        ps.setDate(6, sqlDate);
                        ps.addBatch();

                    }
                    ps.executeBatch();
                    PreparedStatement pst = cn.prepareStatement("update user_data set money = money - ? where ID = ?");
                    pst.setDouble(1, plata);
                    pst.setInt(2, user_id);
                    pst.executeUpdate();

                    updateCrediticio();
                    pst.close();
                    ps.close();
                    cn.close();
                    JOptionPane.showMessageDialog(null, "Pago realizado!");
                } catch (Exception e) {
                    try {
                        cn.rollback();
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null, "Error al pagar");
                }
            }
        }


    }//GEN-LAST:event_pagarC_buttonActionPerformed

    private void updateCrediticio() {
        Connection cn = c.getConnection();
        try {

            PreparedStatement pst = cn.prepareStatement("update tarjetas_data set pagado = ? where user_id = ? and pagado = 0");

            pst.setInt(1, 1);
            pst.setInt(2, user_id);
            pst.executeUpdate();
            pst.close();

            cn.close();

        } catch (Exception ex) {
            System.out.println("Exception " + ex);
        }
    }
    private void bajaC_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaC_buttonActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(
                null,
                "¿Estás seguro de que deseas dar de baja la tarjeta?",
                "Confirmación de Baja",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
        );

        if (respuesta == JOptionPane.YES_OPTION) {
            Connection cn = c.getConnection();
            try {
                PreparedStatement ps = cn.prepareStatement("select * from tarjeta_data where tarjetas_id = ?");
                ps.setInt(1, tarjetas);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Todavia tiene compras pendientes");
                } else {
                    PreparedStatement pst = cn.prepareStatement("update user_data set tarjetas = ? where id = ?");
                    pst.setInt(1, 1);
                    pst.setInt(2, user_id);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Baja realizada!");
                    pst.close();
                }
                rs.close();
                ps.close();
                cn.close();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }

        }
    }//GEN-LAST:event_bajaC_buttonActionPerformed

    private void obtenerD_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obtenerD_buttonActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(
                null,
                "¿Estás seguro de que deseas obtener la tarjeta?",
                "Confirmación de Obtencion",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
        );
        if (respuesta == JOptionPane.YES_OPTION) {
            Connection cn = c.getConnection();
            try {
                PreparedStatement pst = cn.prepareStatement("insert into ayuda_data values(?,?,?,?)");
                pst.setInt(1, user_id);
                pst.setString(2, "Obtener Debito");
                pst.setString(3, "0");
                pst.setString(4, "Incompleto");
                pst.executeUpdate();
                pst.close();
                cn.close();
                JOptionPane.showMessageDialog(null, "Se genero el ticket");
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_obtenerD_buttonActionPerformed

    public void getUser(String user) {
        this.user = user;
        Connection cn = c.getConnection();
        prepareUser(cn);
        try {
            cn.close();
        } catch (Exception e) {
        }
    }

    private void prepareUser(Connection cn) {
        try {
            PreparedStatement pst = cn.prepareStatement("select * from user_data where user_user = ?");
            pst.setString(1, user);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                tarjetas = rs.getInt("tarjetas");
                user_id = rs.getInt("ID");
                money = rs.getDouble("money");
                income = rs.getInt("income");
            }
            if (tarjetas > 0) {
                bajaD_button.setEnabled(true);
                setPanel(cn);
                setLabel(cn);
            } else {
                CardLayout dedit = (CardLayout) Debito.getLayout();
                dedit.show(Debito, "card2");
                bajaD_button.setEnabled(false);
            }
            pst.close();
            rs.close();
            cn.close();
        } catch (Exception e) {
            System.out.println("prepareUser " + e);
        }
    }

    private void setPanel(Connection cn) {

        int tarjeta = (tarjetas >= 1) ? 1 : 0;
        CardLayout dedit = (CardLayout) Debito.getLayout();
        if (tarjeta != 0) {
            try {
                jLabel5.setText("Debito BVVA");
                DefaultTableModel table = (DefaultTableModel) table_debit.getModel();
                table.setRowCount(0);
                PreparedStatement pst = cn.prepareStatement("select * from tarjeta_data where tarjetas_id = ? and user_id = ?");
                pst.setInt(1, tarjeta);
                pst.setInt(2, user_id);
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    do {

                        table.addRow(new Object[]{rs.getDate("date"), rs.getString("movimiento"), rs.getString("deposito")});

                    } while (rs.next());
                } else {
                    table.addRow(new Object[]{"No", "posee", "gastos"});
                }
                dedit.show(Debito, "card3");
                if (tarjetas > 1) {

                    CardLayout credito = (CardLayout) jPanel7.getLayout();
                    credito.show(jPanel7, "card2");
                    CardLayout credit = (CardLayout) Credito.getLayout();
                    credit.show(Credito, "card3");
                    PreparedStatement ps = cn.prepareStatement("select * from tarjeta_data where tarjetas_id = ? and user_id = ?");
                    ps.setInt(1, tarjetas);
                    ps.setInt(2, user_id);
                    ResultSet r = ps.executeQuery();
                    DefaultTableModel table2 = (DefaultTableModel) table_credit.getModel();
                    table2.setRowCount(0);
                    if (r.next()) {
                        do {

                            table2.addRow(new Object[]{r.getString("date"), r.getString("movimiento"), r.getInt("cuotas"), r.getString("deposito")});
                            if (rs.getInt("pagado") == 0) {
                                plata += r.getDouble("movimiento");
                                pagar.add(r.getDouble("movimiento"));
                                ids.add(rs.getInt("unique_id"));
                            }
                        } while (r.next());
                        pagarC_button.setEnabled(true);
                    } else {
                        table2.addRow(new Object[]{"No", "posee", "gastos", "!"});
                        pagarC_button.setEnabled(false);
                    }
                    ps.close();
                    r.close();
                }
                rs.close();
                pst.close();
            } catch (Exception e) {
                System.out.println("setPanel" + e);
            }
        } else {
            jLabel5.setText("No tiene activa.");
        }

        getContentPane().revalidate();
        getContentPane().repaint();
    }

    private void setLabel(Connection cn) {
        jLabel5.setText("Debito BVVA");
        double aux = 20;
        if (income > 0) {
            aux = income / 30;
        }
        jLabel13.setText(String.format("%.2f", aux));
        if (tarjetas > 1) {
            try {
                PreparedStatement pst = cn.prepareStatement("select * from tarjetas_id where unique_id = ?");
                pst.setInt(1, tarjetas);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {
                    jLabel6.setText(rs.getString("name"));
                    jLabel14.setText(String.valueOf(rs.getInt("limite")));
                    jLabel15.setText(String.valueOf(plata));
                    double min = plata * (1 + 12 / 100);
                    jLabel16.setText(String.valueOf(min));
                }
                rs.close();
                pst.close();
            } catch (Exception e) {

            }
        }

    }

    private String user;
    private int tarjetas, user_id;
    private double plata, money, income;
    ArrayList<Double> pagar = new ArrayList<>();
    private ArrayList<Integer> ids = new ArrayList<>();
    private Conection c = new Conection();
    private Plata platac = new Plata();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Credito;
    private javax.swing.JPanel Debito;
    private javax.swing.JButton bajaC_button;
    private javax.swing.JButton bajaD_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton obtenerC_button;
    private javax.swing.JButton obtenerD_button;
    private javax.swing.JButton pagarC_button;
    private javax.swing.JTable table_credit;
    private javax.swing.JTable table_debit;
    // End of variables declaration//GEN-END:variables
}
