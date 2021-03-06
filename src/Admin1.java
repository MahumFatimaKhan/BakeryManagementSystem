interface AdminDetails{
    CustomerDetails cd=new CustomerDetails();
    ViewOrder vd=new ViewOrder();
}

public class Admin1 extends javax.swing.JFrame implements AdminDetails {

    
    public Admin1() {
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
        jTextField2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        logout = new javax.swing.JButton();
        CustomerDetails = new javax.swing.JButton();
        ViewOrderss = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(21, 26, 30));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(21, 26, 30));
        jTextField2.setFont(new java.awt.Font("Showcard Gothic", 0, 40)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(221, 161, 80));
        jTextField2.setText("Admin");
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 70));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setBackground(new java.awt.Color(0, 0, 0));
        logout.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(221, 161, 80));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel2.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 130, 40));

        CustomerDetails.setBackground(new java.awt.Color(0, 0, 0));
        CustomerDetails.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        CustomerDetails.setForeground(new java.awt.Color(221, 161, 80));
        CustomerDetails.setText("Customer Details");
        CustomerDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerDetailsActionPerformed(evt);
            }
        });
        jPanel2.add(CustomerDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 200, 40));

        ViewOrderss.setBackground(new java.awt.Color(0, 0, 0));
        ViewOrderss.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        ViewOrderss.setForeground(new java.awt.Color(221, 161, 80));
        ViewOrderss.setText("View Orders");
        ViewOrderss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewOrderssActionPerformed(evt);
            }
        });
        jPanel2.add(ViewOrderss, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 200, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PSX_20200804_174950.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 450, 490));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 450, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
  dispose();
BakerySystem bs=new BakerySystem();
bs.setLocationRelativeTo(null);
bs.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void CustomerDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerDetailsActionPerformed
dispose();
cd.Customerdetail();
cd.setLocationRelativeTo(null);
cd.setVisible(true);
    }//GEN-LAST:event_CustomerDetailsActionPerformed

    private void ViewOrderssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewOrderssActionPerformed
     dispose();
vd.CustomerOrders();
vd.setLocationRelativeTo(null);
vd.setVisible(true);
    }//GEN-LAST:event_ViewOrderssActionPerformed

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
            java.util.logging.Logger.getLogger(Admin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CustomerDetails;
    private javax.swing.JButton ViewOrderss;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
}
