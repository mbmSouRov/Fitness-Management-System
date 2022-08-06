/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fitness_Management;
import static Fitness_Management.TrainerHomePage.jTextField3;
import static Fitness_Management.TrainerHomePage.jTextField4;
import static Fitness_Management.TrainerHomePage.jTextField5;
import static Fitness_Management.TrainerHomePage.jTextField6;
import static Fitness_Management.TrainerHomePage.jTextField7;
import static Fitness_Management.TrainerHomePage.jp2;
import static Fitness_Management.TrainerHomePage.jp4;
//import static Fitness_Management.ViewCustomerByTrainer.jTextFieldNAME;
import javax.swing.JOptionPane;
import java.awt.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();
           jLabel_incorrect.setVisible(false);
        
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        password = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        jLabel_incorrect = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton_close = new javax.swing.JButton();
        login_btn = new keeptoo.KButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1080, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setMaximumSize(new java.awt.Dimension(1080, 720));
        kGradientPanel1.setMinimumSize(new java.awt.Dimension(1080, 720));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1080, 720));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        password.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        password.setForeground(new java.awt.Color(153, 153, 153));
        password.setText("Enter Password:");
        password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 310, 50));

        username.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        username.setForeground(new java.awt.Color(153, 153, 153));
        username.setText("Enter Username:");
        username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 310, 50));

        jLabel_incorrect.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_incorrect.setForeground(new java.awt.Color(255, 0, 51));
        jLabel_incorrect.setText("Incorrect Username or Password");
        jLabel_incorrect.setFocusCycleRoot(true);
        jPanel1.add(jLabel_incorrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 330, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fitness_Management/image/logo.png"))); // NOI18N
        jPanel2.add(jLabel1);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 160));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Username:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 150, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Password:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 170, 30));

        jComboBox1.setBackground(new java.awt.Color(255, 51, 51));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 255, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Trainer" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 595, 130, -1));

        kGradientPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 410, 730));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fitness_Management/image/tree.png"))); // NOI18N
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 220, 180));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Welcome to");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, -1, -1));

        jLabel8.setFont(new java.awt.Font("Sitka Subheading", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Platinum Fitness");
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, 270, 50));

        jLabel4.setFont(new java.awt.Font("Vivaldi", 0, 60)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Login");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 150, 90));

        jLabel5.setFont(new java.awt.Font("Vivaldi", 0, 50)); // NOI18N
        jLabel5.setText("Here");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 190, -1));

        jButton_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fitness_Management/image/icons8-close-window-48.png"))); // NOI18N
        jButton_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_closeActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        login_btn.setText("Login");
        login_btn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        login_btn.setkEndColor(new java.awt.Color(153, 0, 204));
        login_btn.setkStartColor(new java.awt.Color(102, 255, 102));
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });
        kGradientPanel1.add(login_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 660, -1, -1));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 730));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        setSize(new java.awt.Dimension(1095, 767));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_btnActionPerformed
        // TODO add your handling code here:
        
        try {
           Connection con=ConnectionProvider.getCon();
           String sql="select * from TRAINER where TrainerEmail=? and TrainerPassword =? ";
            PreparedStatement pst=con.prepareStatement(sql);
            String Username= username.getText();
            String Password= password.getText();
            String Type=(String)jComboBox1.getSelectedItem();
            pst.setString(1, Username);
            pst.setString(2, Password);
            ResultSet rs=pst.executeQuery();
        
       if(jComboBox1.getSelectedItem().equals("Admin"))
           {
               if(username.getText().equals("abc")&& (password.getText().equals("abc")))
               {
                    setVisible(false);
           
                    new Home().setVisible(true);  
               }
             else
                  {
                     jLabel_incorrect.setVisible(true);  
                  }
          
           }
       else if(jComboBox1.getSelectedItem().equals("Trainer"))
               {
              
                  if(rs.next())
                  {
                    
                    setVisible(false);
//                    name.setText(rs.getString(1)); 

                    jTextField3.setText(rs.getString("TrainerName"));
                    jTextField5.setText(rs.getString("TrainerPhone"));
                    jTextField4.setText(rs.getString("TrainerAge"));
                    jTextField6.setText(rs.getString("TrainerEmail"));
                    jTextField7.setText(rs.getString("TrainerNID")); 
//                    jTextFieldNAME.setText(rs.getString("TrainerName"));
                    jTextField3.setEditable(false);
//                    jTextFieldNAME.setEditable(false);
                    jTextField4.setEditable(false);
                    jTextField5.setEditable(false);
                    jTextField6.setEditable(false);
                    jTextField7.setEditable(false);
                    
                     jp2.setVisible(true);
                    jp4.setVisible(false);
                   
                    
                    new TrainerHomePage().setVisible(true);  

                  }
                  else
                  {
                     jLabel_incorrect.setVisible(true);  
                  }
                  
                     
               }
               
       else {
           JOptionPane.showMessageDialog(null,"Please Enter Your Email and Password");
           
           
       }
        }
        
        
        catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Something Error!");
//             new Home().setVisible(true);  
        }
          
        
    }//GEN-LAST:event_login_btnActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
      jLabel_incorrect.setVisible(false);  
    if(username.getText().equals("Enter Username:"))
    {
       username.setText("");
    }

    }//GEN-LAST:event_usernameFocusGained

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusLost
    
         jLabel_incorrect.setVisible(false);
        if(username.getText().equals(""))
    {
       username.setText("Enter Username:");
    }

    }//GEN-LAST:event_usernameFocusLost

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
       jLabel_incorrect.setVisible(false);  
    if(password.getText().equals("Enter Password:"))
    {
       password.setText("");
    }

    }//GEN-LAST:event_passwordFocusGained

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
    
         jLabel_incorrect.setVisible(false);
        if(password.getText().equals(""))
    {
       password.setText("Enter Password:");
    }
    }//GEN-LAST:event_passwordFocusLost

    private void jButton_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_closeActionPerformed
       int a=JOptionPane.showConfirmDialog(null,"click Yes","Select",JOptionPane.YES_NO_OPTION);
       
       if(a==0)
       {
           System.exit(0); 
       }
           
       
       
       
    }//GEN-LAST:event_jButton_closeActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_close;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_incorrect;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KButton login_btn;
    private javax.swing.JTextField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

}
