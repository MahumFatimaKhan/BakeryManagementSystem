
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Payment extends javax.swing.JFrame implements Carts{
  File f=new File("Admin");
  int line;
  int x;
    /**
     * Creates new form Payment
     */
    public Payment() {
        initComponents();
        Creditnumber.setVisible(false);
        CreditCardNum.setVisible(false);
        ssn.setVisible(false);
        SSN.setVisible(false);
    }
    
    public void pay(String CreditCardNum,String SSN){
      try {countLine();
          RandomAccessFile view=new RandomAccessFile(f+"\\ViewOrders.txt","rw");
          for(int i=0;i<line;i++){
                view.readLine();
            }
          if(COD.isSelected()){
              view.writeBytes("Payment Method: Cash On Delivery"+ "\r\n");
              dispose();
              Final f=new Final();
              f.setLocationRelativeTo(null);
              f.setVisible(true);
          }
          else if(CreditCard.isSelected()) {
              if(!SSN.equals("") && !CreditCardNum.equals("")){
              int count=0;
              for (int i = 0; i < SSN.length(); i++) {
         if (Character.isDigit(SSN.charAt(i)))
         count++;
      } 
         if(count==9){
              view.writeBytes("Credit Card No.:" + CreditCardNum + "\r\n");
              view.writeBytes("SSN.:" + SSN + "\r\n" );
              dispose();
              Final f=new Final();
              f.setLocationRelativeTo(null);
              f.setVisible(true);
              }
              else{
                JOptionPane.showMessageDialog(rootPane, "SSN should be of 9 digits");
                
         }    
          }
          }
          else{
              JOptionPane.showMessageDialog(rootPane, "Please fill in the required fields");
          }
      } catch (FileNotFoundException ex) {
          Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
      } catch (IOException ex) {
          Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    
     void countLine(){
        try {
            line=1;
            RandomAccessFile view=new RandomAccessFile(f+"\\ViewOrders.txt","rw");
            for(int i=0;view.readLine()!=null;i++){
                line++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Registeration.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Registeration.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Confirm = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        CreditCard = new javax.swing.JRadioButton();
        COD = new javax.swing.JRadioButton();
        ssn = new javax.swing.JLabel();
        SSN = new javax.swing.JTextField();
        Creditnumber = new javax.swing.JLabel();
        CreditCardNum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(21, 26, 30));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(21, 26, 30));
        jTextField2.setFont(new java.awt.Font("Showcard Gothic", 0, 35)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(221, 161, 80));
        jTextField2.setText("Payment Method");
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
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 70));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Confirm.setBackground(new java.awt.Color(0, 0, 0));
        Confirm.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        Confirm.setForeground(new java.awt.Color(221, 161, 80));
        Confirm.setText("Confirm");
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });
        jPanel2.add(Confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 110, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(221, 161, 80));
        jLabel2.setText("Mode Of Payment");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, 40));

        CreditCard.setBackground(new java.awt.Color(0, 0, 0));
        CreditCard.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        CreditCard.setForeground(new java.awt.Color(221, 161, 80));
        CreditCard.setText("Credit Card");
        CreditCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditCardActionPerformed(evt);
            }
        });
        jPanel2.add(CreditCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        COD.setBackground(new java.awt.Color(0, 0, 0));
        COD.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        COD.setForeground(new java.awt.Color(221, 161, 80));
        COD.setText("Cash On Delivery");
        COD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CODActionPerformed(evt);
            }
        });
        jPanel2.add(COD, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        ssn.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        ssn.setForeground(new java.awt.Color(221, 161, 80));
        ssn.setText("SSN :");
        jPanel2.add(ssn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        SSN.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        SSN.setForeground(new java.awt.Color(221, 161, 80));
        SSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SSNActionPerformed(evt);
            }
        });
        SSN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SSNKeyTyped(evt);
            }
        });
        jPanel2.add(SSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 100, -1));

        Creditnumber.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Creditnumber.setForeground(new java.awt.Color(221, 161, 80));
        Creditnumber.setText("Credit Card No. :");
        jPanel2.add(Creditnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        CreditCardNum.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        CreditCardNum.setForeground(new java.awt.Color(221, 161, 80));
        CreditCardNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreditCardNumActionPerformed(evt);
            }
        });
        CreditCardNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CreditCardNumKeyTyped(evt);
            }
        });
        jPanel2.add(CreditCardNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 130, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PSX_20200804_174950.jpg"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 450, 490));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 440, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
pay(CreditCardNum.getText(),SSN.getText());


    }//GEN-LAST:event_ConfirmActionPerformed

    private void CreditCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditCardActionPerformed
if(CreditCard.isSelected()){
    COD.setSelected(false);
    Creditnumber.setVisible(true);
    CreditCardNum.setVisible(true);
    ssn.setVisible(true);
    SSN.setVisible(true);
}
    }//GEN-LAST:event_CreditCardActionPerformed

    private void CODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CODActionPerformed
        if(COD.isSelected()){
             CreditCard.setSelected(false);
             Creditnumber.setVisible(false);
             CreditCardNum.setVisible(false);
             ssn.setVisible(false);
             SSN.setVisible(false);
        }
    }//GEN-LAST:event_CODActionPerformed

    private void SSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SSNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SSNActionPerformed

    private void CreditCardNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreditCardNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreditCardNumActionPerformed

    private void CreditCardNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CreditCardNumKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_CreditCardNumKeyTyped

    private void SSNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SSNKeyTyped
char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE || c==KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_SSNKeyTyped

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton COD;
    private javax.swing.JButton Confirm;
    private javax.swing.JRadioButton CreditCard;
    private javax.swing.JTextField CreditCardNum;
    private javax.swing.JLabel Creditnumber;
    private javax.swing.JTextField SSN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel ssn;
    // End of variables declaration//GEN-END:variables
}
