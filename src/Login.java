
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



public class Login extends javax.swing.JFrame implements Cstmdetail{
    int ln;  int line;
    File folder=new File("Information");
    File f=new File("Admin");
   
    
    public Login() {
        initComponents();
    }
 
    void ValidData(String tfusername,String tfpw){
        if(!tfusername.equals("") || !tfpw.equals("")){
        try {
            
            RandomAccessFile raf=new RandomAccessFile(folder+"\\Customer.txt","rw");
            RandomAccessFile view=new RandomAccessFile(f+"\\ViewOrders.txt","rw");
            
            for(int i=0;i<ln;i++){
              String  username=raf.readLine().substring(9);
              String  pw=raf.readLine().substring(9);
              
            if(tfusername.equals(username) & tfpw.equals(pw)) {
                dispose();
                Store s1=new Store();
                s1.setLocationRelativeTo(null);
                s1.setVisible(true);
                break;
            }
            else if(i==(ln-5)){
                JOptionPane.showMessageDialog(rootPane, "Incorrect Username or Password");
                break;
            }
            for(int j=1;j<=4;j++){
                raf.readLine();
            }
            }
            countLinesforOrder();
             for(int i=0;i<line;i++){
                view.readLine();
            }
             view.writeBytes("\r\n");
             view.writeBytes("Username:"+ tfusername + "\r\n");
                   
                    
            
            } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        } catch(NullPointerException ex){
            JOptionPane.showMessageDialog(rootPane, "Incorrect Username or Password");
        }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Please fill in the required fields");
        }
        
    }   
    
    void countLine(){
        try {
            ln=1;
            RandomAccessFile raf=new RandomAccessFile(folder+"\\Customer.txt","rw");
            for(int i=0;raf.readLine()!=null;i++){
                ln++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Registeration.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Registeration.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    void countLinesforOrder(){
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
        back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Register = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfpw = new javax.swing.JPasswordField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfusername = new javax.swing.JTextArea();
        Login1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(21, 26, 30));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(21, 26, 30));
        jTextField2.setFont(new java.awt.Font("Showcard Gothic", 0, 44)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(221, 161, 80));
        jTextField2.setText("Login");
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setFont(new java.awt.Font("Tahoma", 0, 50)); // NOI18N
        back.setForeground(new java.awt.Color(221, 161, 80));
        back.setText("???");
        back.setBorder(null);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(back)
                .addGap(105, 105, 105)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 70));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Register.setBackground(new java.awt.Color(0, 0, 0));
        Register.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        Register.setForeground(new java.awt.Color(221, 161, 80));
        Register.setText("Don't have an account? Sign up here");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        jPanel2.add(Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 240, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(221, 161, 80));
        jLabel3.setText("Password:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(221, 161, 80));
        jLabel2.setText("Username:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        tfpw.setForeground(new java.awt.Color(221, 161, 80));
        tfpw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfpwActionPerformed(evt);
            }
        });
        jPanel2.add(tfpw, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 180, 30));

        jScrollPane2.setForeground(new java.awt.Color(221, 161, 80));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setToolTipText("");
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        tfusername.setColumns(20);
        tfusername.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        tfusername.setForeground(new java.awt.Color(221, 161, 80));
        tfusername.setRows(5);
        jScrollPane2.setViewportView(tfusername);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 180, 30));

        Login1.setBackground(new java.awt.Color(0, 0, 0));
        Login1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        Login1.setForeground(new java.awt.Color(221, 161, 80));
        Login1.setText("Login");
        Login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Login1ActionPerformed(evt);
            }
        });
        jPanel2.add(Login1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 150, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PSX_20200804_174950_20200804175745164.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 450, 400));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 450, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
dispose();
Registeration r1=new Registeration();
r1.setLocationRelativeTo(null);
r1.setVisible(true);      

    }//GEN-LAST:event_RegisterActionPerformed

    private void tfpwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfpwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfpwActionPerformed

    private void Login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Login1ActionPerformed
        countLine();
        ValidData(tfusername.getText(), tfpw.getText());
    }//GEN-LAST:event_Login1ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
        BakerySystem bs=new BakerySystem();
        bs.setLocationRelativeTo(null);
        bs.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

   
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login1;
    private javax.swing.JButton Register;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPasswordField tfpw;
    private javax.swing.JTextArea tfusername;
    // End of variables declaration//GEN-END:variables
}
