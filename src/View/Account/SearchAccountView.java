/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Account;

/**
 *
 * @author letu
 */
public class SearchAccountView extends javax.swing.JFrame {

    /**
     * Creates new form SearchDealerViewNew
     */
    public SearchAccountView() {
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

        jPanel1 = new javax.swing.JPanel();
        searchButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        searchButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        searchButton.setForeground(new java.awt.Color(153, 153, 153));
        searchButton.setText("Search");
        searchButton.setBorder(null);
        searchButton.setBorderPainted(false);
        searchButton.setContentAreaFilled(false);
        searchButton.setFocusPainted(false);
        searchButton.setFocusable(false);
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchButton);
        searchButton.setBounds(590, 610, 250, 50);

        backButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        backButton.setForeground(new java.awt.Color(153, 153, 153));
        backButton.setText("Back");
        backButton.setBorder(null);
        backButton.setBorderPainted(false);
        backButton.setContentAreaFilled(false);
        backButton.setFocusPainted(false);
        backButton.setFocusable(false);
        jPanel1.add(backButton);
        backButton.setBounds(270, 610, 250, 50);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/button_noClick.png"))); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(580, 610, 270, 60);

        nameField.setEditable(false);
        nameField.setBackground(new java.awt.Color(255, 255, 255));
        nameField.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        nameField.setForeground(new java.awt.Color(153, 153, 153));
        nameField.setText("UserName");
        nameField.setBorder(null);
        jPanel1.add(nameField);
        nameField.setBounds(290, 390, 240, 40);

        phoneField.setEditable(false);
        phoneField.setBackground(new java.awt.Color(255, 255, 255));
        phoneField.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        phoneField.setForeground(new java.awt.Color(153, 153, 153));
        phoneField.setText("PassWord");
        phoneField.setBorder(null);
        jPanel1.add(phoneField);
        phoneField.setBounds(290, 490, 240, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/logo.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 220, 250);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Search Account");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(530, 80, 380, 70);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/textFrame2.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(280, 380, 270, 60);

        jTextField1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("UserName");
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(450, 180, 530, 70);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/textFrame.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(430, 160, 570, 110);

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("UserName");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(130, 380, 130, 60);

        addressField.setEditable(false);
        addressField.setBackground(new java.awt.Color(255, 255, 255));
        addressField.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        addressField.setForeground(new java.awt.Color(153, 153, 153));
        addressField.setText("Role");
        addressField.setBorder(null);
        addressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressFieldActionPerformed(evt);
            }
        });
        jPanel1.add(addressField);
        addressField.setBounds(780, 390, 240, 40);

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("PassWord");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(130, 490, 120, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/textFrame2.png"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(280, 480, 270, 60);

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Role");
        jLabel9.setToolTipText("");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(700, 390, 60, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/bg2.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(-340, -290, 1010, 770);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/textFrame2.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(770, 380, 270, 60);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/icon/button_noClick.png"))); // NOI18N
        jPanel1.add(jLabel13);
        jLabel13.setBounds(260, 610, 270, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressFieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SearchAccountView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchAccountView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchAccountView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchAccountView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchAccountView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField phoneField;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
