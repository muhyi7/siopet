/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import java.awt.*;
import notif.login.*;

/**
 *
 * @author lenovo
 */
public class lupa1 extends javax.swing.JFrame {

    /**
     * Creates new form lupa1
     */
    public lupa1() {
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

        b_lanjut = new javax.swing.JLabel();
        unhideEye = new javax.swing.JLabel();
        hideEye = new javax.swing.JLabel();
        txt_username1 = new javax.swing.JTextField();
        txt_pin = new javax.swing.JPasswordField();
        b_exit = new javax.swing.JLabel();
        b_back = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b_lanjut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_lanjut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_lanjutMouseClicked(evt);
            }
        });
        getContentPane().add(b_lanjut, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 480, 240, 70));

        unhideEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_show.png"))); // NOI18N
        unhideEye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                unhideEyeMousePressed(evt);
            }
        });
        getContentPane().add(unhideEye, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 400, 30, 30));

        hideEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_hide.png"))); // NOI18N
        hideEye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hideEyeMousePressed(evt);
            }
        });
        getContentPane().add(hideEye, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 400, 30, 30));

        txt_username1.setBackground(new Color(0,0,0,0));
        txt_username1.setFont(new java.awt.Font("Microsoft Tai Le", 0, 18)); // NOI18N
        txt_username1.setBorder(null);
        txt_username1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_username1ActionPerformed(evt);
            }
        });
        getContentPane().add(txt_username1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 270, 380, 60));

        txt_pin.setBackground(new Color(0,0,0,0));
        txt_pin.setFont(new java.awt.Font("Microsoft Tai Le", 0, 48)); // NOI18N
        txt_pin.setBorder(null);
        getContentPane().add(txt_pin, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 380, 370, 70));

        b_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_exit.png"))); // NOI18N
        b_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_exitMouseClicked(evt);
            }
        });
        getContentPane().add(b_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 20, -1, -1));

        b_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_previous.png"))); // NOI18N
        b_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_backMouseClicked(evt);
            }
        });
        getContentPane().add(b_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 20, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ForgetPassword.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b_lanjutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_lanjutMouseClicked
        String username = txt_username1.getText();
        String pin = txt_pin.getText();
         Logic.LogicLogin login = new Logic.LogicLogin();
         boolean konfirmasi = login.forgetPassword(username,pin);
         if(konfirmasi){
             FPinberhasil berhasil = new FPinberhasil();
             berhasil.setVisible(true);
         }else{
             FPingagal gagal = new FPingagal();
             gagal.setVisible(true);
         }
    }//GEN-LAST:event_b_lanjutMouseClicked

    private void txt_username1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_username1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_username1ActionPerformed

    private void b_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_backMouseClicked
         new login().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_b_backMouseClicked

    private void b_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_b_exitMouseClicked

    private void unhideEyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unhideEyeMousePressed
        hideEye.setVisible(true);
        unhideEye.setVisible(false);
        txt_pin.setEchoChar((char)0);
    }//GEN-LAST:event_unhideEyeMousePressed

    private void hideEyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideEyeMousePressed
        unhideEye.setVisible(true);
        hideEye.setVisible(false);
        txt_pin.setEchoChar('*');
    }//GEN-LAST:event_hideEyeMousePressed

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
            java.util.logging.Logger.getLogger(lupa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lupa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lupa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lupa1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lupa1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel b_back;
    private javax.swing.JLabel b_exit;
    private javax.swing.JLabel b_lanjut;
    private javax.swing.JLabel background;
    private javax.swing.JLabel hideEye;
    private javax.swing.JPasswordField txt_pin;
    private javax.swing.JTextField txt_username1;
    private javax.swing.JLabel unhideEye;
    // End of variables declaration//GEN-END:variables
}
