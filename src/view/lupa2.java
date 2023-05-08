/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import java.awt.*;

/**
 *
 * @author lenovo
 */
public class lupa2 extends javax.swing.JFrame {

    /**
     * Creates new form
     */
    public lupa2() {
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

        t_newpass = new javax.swing.JTextField();
        t_validpass = new javax.swing.JTextField();
        t_ubahpass = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        t_newpass.setBackground(new Color(0,0,0,0));
        t_newpass.setBorder(null);
        getContentPane().add(t_newpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 270, 390, 60));

        t_validpass.setBackground(new Color(0,0,0,0));
        t_validpass.setBorder(null);
        getContentPane().add(t_validpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 380, 390, 70));

        t_ubahpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_ubahpassMouseClicked(evt);
            }
        });
        getContentPane().add(t_ubahpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 480, 190, 70));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Lupa password 2.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void t_ubahpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_ubahpassMouseClicked
        String newpassword = t_newpass.getText();
        String validPassword = t_validpass.getText();
        if(newpassword.equals(validPassword)){
            if(newpassword.length() >= 8){
            Logic.LogicLogin login = new Logic.LogicLogin();
            boolean konfirmasi = login.changePassword(newpassword);
            JOptionPane.showMessageDialog(rootPane, "password berhasil di ganti");
            this.setVisible(false);
            new login().setVisible(true); 
            }else{
              JOptionPane.showMessageDialog(rootPane, "Password Harus lebih dari 7 digit");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "password tidak sama");
        } this.dispose();
    }//GEN-LAST:event_t_ubahpassMouseClicked

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
            java.util.logging.Logger.getLogger(lupa2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lupa2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lupa2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lupa2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lupa2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JTextField t_newpass;
    private javax.swing.JLabel t_ubahpass;
    private javax.swing.JTextField t_validpass;
    // End of variables declaration//GEN-END:variables
}