/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import Logic.LogicLogin;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.Window;
import java.util.Locale;
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
        popUp_berhasilLogin.setVisible(false);
        popUp_berhasilLoginAdmin.setVisible(false);
        popUp_gagalLogin.setVisible(false);
        popUp_RFID.setVisible(false);
        rfid_text.setText("Memindai Kartu...");

        hideEye.setVisible(false);
        
        addPlaceHolderStyle(txtusername);
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
        textField.setForeground(Color.black);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        unhideEye = new javax.swing.JLabel();
        hideEye = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        b_rfid = new javax.swing.JLabel();
        b_login = new javax.swing.JLabel();
        b_lupapass = new javax.swing.JLabel();
        exit1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        popUp_RFID = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        rfid_text = new javax.swing.JLabel();
        rfid_logo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rfid_input = new javax.swing.JTextField();
        popUp_gagalLogin = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        popUp_berhasilLoginAdmin = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        popUp_berhasilLogin = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gif login.gif"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, -10, 790, 800);

        unhideEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_show.png"))); // NOI18N
        unhideEye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                unhideEyeMousePressed(evt);
            }
        });
        getContentPane().add(unhideEye);
        unhideEye.setBounds(1250, 400, 30, 30);

        hideEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_hide.png"))); // NOI18N
        hideEye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hideEyeMousePressed(evt);
            }
        });
        getContentPane().add(hideEye);
        hideEye.setBounds(1250, 400, 30, 30);

        txtusername.setBackground(new Color(0,0,0,0));
        txtusername.setFont(new java.awt.Font("Microsoft Tai Le", 0, 18)); // NOI18N
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
        getContentPane().add(txtusername);
        txtusername.setBounds(910, 270, 360, 60);

        txtpassword.setBackground(new Color(0,0,0,0));
        txtpassword.setFont(new java.awt.Font("Microsoft Tai Le", 0, 18)); // NOI18N
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
        getContentPane().add(txtpassword);
        txtpassword.setBounds(900, 380, 360, 70);

        b_rfid.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_rfid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_rfidMouseClicked(evt);
            }
        });
        getContentPane().add(b_rfid);
        b_rfid.setBounds(1000, 560, 170, 50);

        b_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_loginMouseClicked(evt);
            }
        });
        getContentPane().add(b_login);
        b_login.setBounds(990, 520, 200, 60);

        b_lupapass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_lupapassMouseClicked(evt);
            }
        });
        getContentPane().add(b_lupapass);
        b_lupapass.setBounds(1160, 460, 130, 30);

        exit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_exit.png"))); // NOI18N
        exit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit1MouseClicked(evt);
            }
        });
        getContentPane().add(exit1);
        exit1.setBounds(1330, 10, 51, 51);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Login Page.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 1464, 789);

        popUp_RFID.setBackground(new Color(0,0,0,200));
        popUp_RFID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                popUp_RFIDMousePressed(evt);
            }
        });
        popUp_RFID.setLayout(null);

        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        popUp_RFID.add(exit);
        exit.setBounds(620, 480, 160, 50);

        rfid_text.setFont(new java.awt.Font("Microsoft Tai Le", 0, 18)); // NOI18N
        popUp_RFID.add(rfid_text);
        rfid_text.setBounds(580, 440, 280, 40);

        rfid_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/com-resize-unscreen.gif"))); // NOI18N
        popUp_RFID.add(rfid_logo);
        rfid_logo.setBounds(630, 280, 130, 110);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/PopUp_RFID.png"))); // NOI18N
        popUp_RFID.add(jLabel8);
        jLabel8.setBounds(380, 140, 638, 410);

        rfid_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rfid_inputActionPerformed(evt);
            }
        });
        rfid_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rfid_inputKeyReleased(evt);
            }
        });
        popUp_RFID.add(rfid_input);
        rfid_input.setBounds(400, 260, 90, 22);

        getContentPane().add(popUp_RFID);
        popUp_RFID.setBounds(0, 0, 1464, 789);

        popUp_gagalLogin.setBackground(new Color(0,0,0,200));
        popUp_gagalLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                popUp_gagalLoginMousePressed(evt);
            }
        });
        popUp_gagalLogin.setLayout(null);

        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        popUp_gagalLogin.add(jLabel5);
        jLabel5.setBounds(650, 360, 170, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/popup username atau password salah.png"))); // NOI18N
        popUp_gagalLogin.add(jLabel6);
        jLabel6.setBounds(380, 140, 720, 310);

        getContentPane().add(popUp_gagalLogin);
        popUp_gagalLogin.setBounds(0, 0, 1464, 789);

        popUp_berhasilLoginAdmin.setBackground(new Color(0,0,0,200));
        popUp_berhasilLoginAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                popUp_berhasilLoginAdminMousePressed(evt);
            }
        });
        popUp_berhasilLoginAdmin.setLayout(null);

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        popUp_berhasilLoginAdmin.add(jLabel3);
        jLabel3.setBounds(650, 360, 170, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/popup berhasil login admin.png"))); // NOI18N
        popUp_berhasilLoginAdmin.add(jLabel4);
        jLabel4.setBounds(380, 140, 720, 310);

        getContentPane().add(popUp_berhasilLoginAdmin);
        popUp_berhasilLoginAdmin.setBounds(0, 0, 1464, 789);

        popUp_berhasilLogin.setBackground(new Color(0,0,0,200));
        popUp_berhasilLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                popUp_berhasilLoginMousePressed(evt);
            }
        });
        popUp_berhasilLogin.setLayout(null);

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        popUp_berhasilLogin.add(jLabel2);
        jLabel2.setBounds(650, 360, 170, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/popup berhasil login owner.png"))); // NOI18N
        popUp_berhasilLogin.add(jLabel1);
        jLabel1.setBounds(380, 140, 720, 310);

        getContentPane().add(popUp_berhasilLogin);
        popUp_berhasilLogin.setBounds(0, 0, 1464, 789);

        setSize(new java.awt.Dimension(1464, 789));
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
//                Floginberhasilowner owner = new Floginberhasilowner();
//                owner.setVisible(true);
//                JOptionPane.showMessageDialog(null,"Berhasil Login Owner");
                
                popUp_berhasilLogin.setVisible(true);
            }else if(lvl.equals("admin kasir")){
                popUp_berhasilLoginAdmin.setVisible(true);
//                 popUp_berhasilLoginAdmin.setVisible(true);JOptionPane.showMessageDialog(null,"Berhasil Login Admin Kasir");
//                new dashboardadmin().setVisible(true);

               

//                  new Ploginberhasiladmin().setVisible(true);
                
//                this.dispose();
//                new Floginberhasiladmin().setVisible(true);
                
            }  
        }else{  
                popUp_gagalLogin.setVisible(true);
//            popUp_berhasilLogin.setVisible(false);
//            Plogingagal apa = new Plogingagal();
//            apa.setSize(1464, 789);
//            this.add(apa);
//            this.setComponentZOrder(apa, 0);
//            this.revalidate();
//            this.repaint();
//             Flogingagal gagal = new Flogingagal();
//             gagal.setVisible(true);
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
        txtpassword.setEchoChar((char)0);
    }//GEN-LAST:event_unhideEyeMousePressed

    private void hideEyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hideEyeMousePressed
        unhideEye.setVisible(true); 
        hideEye.setVisible(false);
        txtpassword.setEchoChar('*');
    }//GEN-LAST:event_hideEyeMousePressed

    private void txtpasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpasswordMousePressed

    }//GEN-LAST:event_txtpasswordMousePressed

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
    
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void txtusernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusernameFocusGained
        if(txtusername.getText().equals("Masukkan Username")){
            txtusername.setText(null);
            txtusername.requestFocus();
            removePlaceHolderStyle(txtusername);
        }
    }//GEN-LAST:event_txtusernameFocusGained

    private void txtusernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusernameFocusLost
           if(txtusername.getText().length()==0){  
           addPlaceHolderStyle(txtusername);  
           txtusername.setText("Masukkan Username");
           
           
           
            
            }
    }//GEN-LAST:event_txtusernameFocusLost

    private void txtpasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasswordFocusGained
        if(txtpassword.getText().equals("Masukkan Password")){
            txtpassword.setText(null);
            txtpassword.requestFocus(); 
            txtpassword.setEchoChar('*');
            txtpassword.setForeground(Color.black);
            removePlaceHolderStyle(txtpassword);
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

    private void b_rfidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_rfidMouseClicked
    popUp_RFID.setVisible(true);
    rfid_input.requestFocus();
//    JDialog dialog = new JDialog(this,"Login RFID",true);
//    dialog.setSize(1464,789);
//    dialog.getContentPane().add(new PopUp_RFID());
//    dialog.setLocationRelativeTo(this);
//    dialog.setUndecorated(true);
//    dialog.setVisible(true);
    
    }//GEN-LAST:event_b_rfidMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
        popUp_berhasilLogin.setVisible(false);
        new dasboardowner().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void popUp_berhasilLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_popUp_berhasilLoginMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_popUp_berhasilLoginMousePressed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.dispose();
        popUp_berhasilLoginAdmin.setVisible(false);
        new dashboardadmin().setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void popUp_berhasilLoginAdminMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_popUp_berhasilLoginAdminMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_popUp_berhasilLoginAdminMousePressed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        popUp_gagalLogin.setVisible(false);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void popUp_gagalLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_popUp_gagalLoginMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_popUp_gagalLoginMousePressed

    private void popUp_RFIDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_popUp_RFIDMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_popUp_RFIDMousePressed

    private void rfid_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rfid_inputActionPerformed

    }//GEN-LAST:event_rfid_inputActionPerformed

    private void rfid_inputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rfid_inputKeyReleased
       if(rfid_input.getText().length() >= 10){
      Logic.LogicLogin logiclogin = new LogicLogin();
      boolean isLogin = logiclogin.ScanRFID(rfid_input.getText());
      if(isLogin){
            String lvl = Logic.LogicLogin.level;
            this.setVisible(true);
            if(lvl.equals("owner")){   
//                Floginberhasilowner owner = new Floginberhasilowner();
//                owner.setVisible(true);
//                JOptionPane.showMessageDialog(null,"Berhasil Login Owner");
             rfid_text.setText("Kartu Valid");
             JOptionPane.showMessageDialog(null,"Berhasil Login Owner");
             new dasboardowner().setVisible(true);
             
             this.dispose();
            
            }else if(lvl.equals("admin kasir")){
                rfid_text.setText("Kartu Valid");
                JOptionPane.showMessageDialog(null,"Berhasil Login Admin Kasir");
                new dashboardadmin().setVisible(true); 
                
                this.dispose();           
            }  
            
        }else{
                rfid_text.setText("Kartu Tidak Valid");
                rfid_input.setText(null);
        }
    }
    }//GEN-LAST:event_rfid_inputKeyReleased

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocus();
    }//GEN-LAST:event_formWindowGainedFocus

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        popUp_RFID.setVisible(false);
    }//GEN-LAST:event_exitMouseClicked

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
    private javax.swing.JLabel b_rfid;
    private javax.swing.JLabel background;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel exit1;
    private javax.swing.JLabel hideEye;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel popUp_RFID;
    private javax.swing.JPanel popUp_berhasilLogin;
    private javax.swing.JPanel popUp_berhasilLoginAdmin;
    private javax.swing.JPanel popUp_gagalLogin;
    private javax.swing.JTextField rfid_input;
    private javax.swing.JLabel rfid_logo;
    private javax.swing.JLabel rfid_text;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    private javax.swing.JLabel unhideEye;
    // End of variables declaration//GEN-END:variables
}
