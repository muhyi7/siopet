/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Logic.LogicLogin;
import static view.dasboardowner.lblnama;

/**
 *
 * @author lenovo
 */
public class dashboardadmin extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public dashboardadmin() {
        initComponents();
         load_data();
//        lblnama.setText("Ahmad Muhyiddin");
    }
    public void load_data(){
//        lblNama.setText(String.valueOf(new Logic.login().userId));
        lblnama.setText(LogicLogin.nama);
    }
//    login lg = new login();
//    public void load_data(){
////        lblNama.setText(String.valueOf(new Logic.login().userId));
//        lblnama.setText(lg.username);
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonuser = new javax.swing.JComboBox<>();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblnama.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(lblnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 230, 50));

        buttonuser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Log Out", "Exit" }));
        buttonuser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonuserActionPerformed(evt);
            }
        });
        getContentPane().add(buttonuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 10, 150, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dashboard.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonuserActionPerformed
        String menu = String.valueOf(buttonuser.getSelectedItem());
        switch(menu){
            case "Log Out":
                this.setVisible(false);
                this.dispose();
                new login().setVisible(true);
            break;
            case"Exit":
            System.exit(0);
            break;
        }
    }//GEN-LAST:event_buttonuserActionPerformed

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
            java.util.logging.Logger.getLogger(dashboardadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboardadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboardadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboardadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboardadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JComboBox<String> buttonuser;
    public static final javax.swing.JLabel lblnama = new javax.swing.JLabel();
    // End of variables declaration//GEN-END:variables
}
