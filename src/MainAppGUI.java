/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

/**
 *
 * @author Marc-Étienne Ruffel
 */
public class MainAppGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainAppGUI
     */
    public MainAppGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chkJunior = new javax.swing.JCheckBox();
        chkSenior = new javax.swing.JCheckBox();
        chkSuper = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDepFood = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTravelDep = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtSleepDep = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtTravelTot = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtSleepTot = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtTotFood = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtRestTravel = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtSleepRest = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtRestFood = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtRedTravel = new javax.swing.JLabel();
        txtRedSleep = new javax.swing.JLabel();
        txtRedNP = new javax.swing.JLabel();
        btnSend = new javax.swing.JButton();
        txtRedFood = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        chkIsAvion = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setForeground(java.awt.Color.white);

        chkJunior.setBackground(new java.awt.Color(102, 102, 102));
        chkJunior.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        chkJunior.setForeground(new java.awt.Color(255, 255, 255));
        chkJunior.setText("Junior");
        chkJunior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkJuniorActionPerformed(evt);
            }
        });

        chkSenior.setBackground(new java.awt.Color(102, 102, 102));
        chkSenior.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        chkSenior.setForeground(new java.awt.Color(255, 255, 255));
        chkSenior.setText("Senior");
        chkSenior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSeniorActionPerformed(evt);
            }
        });

        chkSuper.setBackground(new java.awt.Color(102, 102, 102));
        chkSuper.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        chkSuper.setForeground(new java.awt.Color(255, 255, 255));
        chkSuper.setText("Super");
        chkSuper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkSuperActionPerformed(evt);
            }
        });

        txtDepFood.setColumns(20);
        txtDepFood.setFont(new java.awt.Font("Sitka Small", 0, 12)); // NOI18N
        txtDepFood.setRows(5);
        jScrollPane1.setViewportView(txtDepFood);

        txtTravelDep.setColumns(20);
        txtTravelDep.setRows(5);
        jScrollPane2.setViewportView(txtTravelDep);

        txtSleepDep.setColumns(20);
        txtSleepDep.setRows(5);
        jScrollPane3.setViewportView(txtSleepDep);

        jLabel3.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        jLabel3.setText("Hébergement");

        jLabel4.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        jLabel4.setText("Déplacement");

        jLabel5.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        jLabel5.setText("Nourriture");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("Gestion Factures ");

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("FlouAlimentaire & Co");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(45, 45, 45))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2))
        );

        txtTravelTot.setColumns(20);
        txtTravelTot.setRows(5);
        jScrollPane4.setViewportView(txtTravelTot);

        txtSleepTot.setColumns(20);
        txtSleepTot.setRows(5);
        jScrollPane5.setViewportView(txtSleepTot);

        jLabel8.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        jLabel8.setText("Dépense :");

        txtTotFood.setColumns(20);
        txtTotFood.setRows(5);
        jScrollPane6.setViewportView(txtTotFood);

        txtRestTravel.setColumns(20);
        txtRestTravel.setRows(5);
        jScrollPane7.setViewportView(txtRestTravel);

        txtSleepRest.setColumns(20);
        txtSleepRest.setRows(5);
        jScrollPane8.setViewportView(txtSleepRest);

        jLabel11.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        jLabel11.setText("Restant pour le mois");

        txtRestFood.setColumns(20);
        txtRestFood.setRows(5);
        jScrollPane9.setViewportView(txtRestFood);

        jLabel9.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        jLabel9.setText("Total du mois : ");

        jLabel6.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        jLabel6.setText("Employé");

        jLabel7.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        jLabel7.setText("Niveau");

        txtID.setFont(new java.awt.Font("Sitka Small", 0, 18)); // NOI18N
        txtID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtID.setText("Entrer ID");
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtRedTravel.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        txtRedTravel.setForeground(new java.awt.Color(204, 0, 0));

        txtRedSleep.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        txtRedSleep.setForeground(new java.awt.Color(204, 0, 0));

        txtRedNP.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        txtRedNP.setForeground(new java.awt.Color(204, 0, 0));
        txtRedNP.setMinimumSize(new java.awt.Dimension(108, 50));

        btnSend.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        btnSend.setText("Ajouter Facture");

        txtRedFood.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        txtRedFood.setForeground(new java.awt.Color(204, 0, 0));
        txtRedFood.setMinimumSize(new java.awt.Dimension(108, 50));

        txtDate.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        txtDate.setText("YYYY-MM-DD");
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Sitka Small", 0, 24)); // NOI18N
        jLabel10.setText("Date");

        chkIsAvion.setBackground(new java.awt.Color(102, 102, 102));
        chkIsAvion.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        chkIsAvion.setForeground(new java.awt.Color(255, 255, 255));
        chkIsAvion.setText("Avion");
        chkIsAvion.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(151, 151, 151)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(chkIsAvion)))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(chkSuper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chkSenior)
                        .addComponent(chkJunior))
                    .addComponent(jLabel7)
                    .addComponent(btnSend)
                    .addComponent(jLabel10)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtRedNP, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(636, 636, 636)
                        .addComponent(txtRedTravel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(266, 266, 266)
                        .addComponent(txtRedSleep, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(151, 151, 151)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(260, 260, 260))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(436, 436, 436)
                    .addComponent(txtRedFood, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1079, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(103, 103, 103)
                            .addComponent(jLabel8)
                            .addGap(214, 214, 214)
                            .addComponent(jLabel9))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jScrollPane1)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(53, 53, 53)
                                    .addComponent(chkIsAvion)))
                            .addGap(161, 161, 161)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane6)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(43, 43, 43)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel7)
                        .addGap(9, 9, 9)
                        .addComponent(chkJunior)
                        .addGap(47, 47, 47)
                        .addComponent(chkSenior)
                        .addGap(47, 47, 47)
                        .addComponent(chkSuper)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(jLabel11)
                            .addGap(17, 17, 17))
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane9)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(116, 116, 116)
                .addComponent(btnSend)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtRedTravel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRedNP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRedSleep, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(885, Short.MAX_VALUE)
                    .addComponent(txtRedFood, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkSuperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSuperActionPerformed
        // TODO add your handling code here:
         if(chkSuper.isSelected()){
            chkJunior.setEnabled(false);
            chkSenior.setEnabled(false);
            chkIsAvion.setEnabled(true);
        }else{ chkJunior.setEnabled(true);
                chkSenior.setEnabled(true);
                chkIsAvion.setEnabled(false);
         }
         
    }//GEN-LAST:event_chkSuperActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void chkJuniorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkJuniorActionPerformed
        // TODO add your handling code here:
           if(chkJunior.isSelected()){
            chkSuper.setEnabled(false);
            chkSenior.setEnabled(false);
        }else{ chkSuper.setEnabled(true);
                chkSenior.setEnabled(true);}
    }//GEN-LAST:event_chkJuniorActionPerformed

    private void chkSeniorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkSeniorActionPerformed
        // TODO add your handling code here:
                 if(chkSenior.isSelected()){
            chkSuper.setEnabled(false);
            chkJunior.setEnabled(false);
        }else{ chkSuper.setEnabled(true);
                chkJunior.setEnabled(true);}
    
        
    }//GEN-LAST:event_chkSeniorActionPerformed

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
            java.util.logging.Logger.getLogger(MainAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainAppGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JCheckBox chkIsAvion;
    private javax.swing.JCheckBox chkJunior;
    private javax.swing.JCheckBox chkSenior;
    private javax.swing.JCheckBox chkSuper;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextArea txtDepFood;
    private javax.swing.JTextField txtID;
    private javax.swing.JLabel txtRedFood;
    private javax.swing.JLabel txtRedNP;
    private javax.swing.JLabel txtRedSleep;
    private javax.swing.JLabel txtRedTravel;
    private javax.swing.JTextArea txtRestFood;
    private javax.swing.JTextArea txtRestTravel;
    private javax.swing.JTextArea txtSleepDep;
    private javax.swing.JTextArea txtSleepRest;
    private javax.swing.JTextArea txtSleepTot;
    private javax.swing.JTextArea txtTotFood;
    private javax.swing.JTextArea txtTravelDep;
    private javax.swing.JTextArea txtTravelTot;
    // End of variables declaration//GEN-END:variables
}
