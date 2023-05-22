/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import notif.login.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.*;
/**
 *
 * @author lenovo
 */
public class login extends javax.swing.JFrame {

//    String username;
   /**
     * Creates new form landing
     */
    public login() {
        initComponents();
        this.hideEye.setVisible(false);
        addPlaceHolderStyle(txtpassword);
    }
    public void addPlaceHolderStyle(JTextField textfield){
        Font font = textfield.getFont();
        font = font.deriveFont(Font.PLAIN);
        textfield.setFont(font);
        textfield.setForeground(Color.gray);
    }
    public void removePlaceHolderStyle(JTextField textField){
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN);
        textField.setFont(font);
        textField.setForeground(Color.gray);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hideEye = new javax.swing.JLabel();
        unhideEye = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        b_login = new javax.swing.JLabel();
        b_lupapass = new javax.swing.JLabel();
        exit1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hideEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_hide.png"))); // NOI18N
        hideEye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hideEyeMousePressed(evt);
            }
        });
        getContentPane().add(hideEye, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 400, 30, 30));

        unhideEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_show.png"))); // NOI18N
        unhideEye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                unhideEyeMousePressed(evt);
            }
        });
        getContentPane().add(unhideEye, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 400, 30, 30));

        txtusername.setBackground(new Color(0,0,0,0));
        txtusername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtusername.setText("Masukkan Username");
        txtusername.setBorder(null);
        txtusername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtusernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtusernameFocusLost(evt);
            }
        });
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });
        getContentPane().add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 270, 360, 60));

        txtpassword.setBackground(new Color(0,0,0,0));
        txtpassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtpassword.setText("Masukkan Password");
        txtpassword.setBorder(null);
        txtpassword.setEchoChar('\u0000');
        txtpassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpasswordFocusLost(evt);
            }
        });
        txtpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtpasswordMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtpasswordMouseReleased(evt);
            }
        });
        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 380, 360, 70));

        b_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_loginMouseClicked(evt);
            }
        });
        getContentPane().add(b_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 520, 200, 60));

        b_lupapass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_lupapassMouseClicked(evt);
            }
        });
        getContentPane().add(b_lupapass, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 460, 130, 30));

        exit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_exit.png"))); // NOI18N
        exit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit1MouseClicked(evt);
            }
        });
        getContentPane().add(exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 10, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Login.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed

    }//GEN-LAST:event_txtusernameActionPerformed

    private void b_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_loginMouseClicked
        String username = txtusername.getText();
        String password = txtpassword.getText();
        Logic.LogicLogin login = new Logic.LogicLogin();
        boolean logg = login.log(username, password);
        if(logg){
            String lvl = Logic.LogicLogin.level;
            this.setVisible(true);
            if(lvl.equals("owner")){   
                Floginberhasilowner owner = new Floginberhasilowner();
                owner.setVisible(true);
            }else if(lvl.equals("admin kasir")){
                Floginberhasiladmin admin = new Floginberhasiladmin();
                admin.setVisible(true);
            }  
        }else{
             Flogingagal gagal = new Flogingagal();
             gagal.setVisible(true);
        }
        
    }//GEN-LAST:event_b_loginMouseClicked

    private void b_lupapassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_lupapassMouseClicked
        this.setVisible(false);
        new lupa1().setVisible(true);
    }//GEN-LAST:event_b_lupapassMouseClicked

    private void exit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_exit1MouseClicked

    private void unhideEyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unhideEyeMousePressed
        hideEye.setVisible(true);
        unhideEye.setVisible(false);
        txtpassword.setEchoChar('*');
    }//GEN-LAST:event_unhideEyeMousePressed

    private void hideEyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideEyeMousePressed
        unhideEye.setVisible(true);
        hideEye.setVisible(false);
        txtpassword.setEchoChar((char)0);
    }//GEN-LAST:event_hideEyeMousePressed

    private void txtpasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpasswordMousePressed

    }//GEN-LAST:event_txtpasswordMousePressed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
    
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void txtusernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusernameFocusGained
        if(txtusername.getText().equals("Masukkan Username")){
            txtusername.setText(null);
            txtusername.requestFocus();
            txtusername.setForeground(Color.black);
            removePlaceHolderStyle(txtusername);
        }
    }//GEN-LAST:event_txtusernameFocusGained

    private void txtusernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusernameFocusLost
            if(txtusername.getText().length()==0){     
            txtusername.setText("Masukkan Username");
            addPlaceHolderStyle(txtusername);
            }
    }//GEN-LAST:event_txtusernameFocusLost

    private void txtpasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasswordFocusGained
        if(txtpassword.getText().equals("Masukkan Password")){
            txtpassword.setText(null);
            txtpassword.requestFocus(); 
            txtpassword.setForeground(Color.black);
            txtpassword.setEchoChar('*');
            removePlaceHolderStyle(txtusername);
        }
    }//GEN-LAST:event_txtpasswordFocusGained

    private void txtpasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasswordFocusLost
        if(txtpassword.getText().length()==0){
            addPlaceHolderStyle(txtpassword);
            txtpassword.setText("Masukkan Password");
            txtpassword.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_txtpasswordFocusLost

    private void txtpasswordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpasswordMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordMouseReleased

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel b_login;
    private javax.swing.JLabel b_lupapass;
    private javax.swing.JLabel background;
    private javax.swing.JLabel exit1;
    private javax.swing.JLabel hideEye;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    private javax.swing.JLabel unhideEye;
    // End of variables declaration//GEN-END:variables
}
