/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package notif.login;
import Logic.LogicLogin;
import java.awt.Color;
import Logic.*;
import java.awt.Dialog;
import java.awt.Window;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import view.*;

/**
 *
 * @author lenovo
 */
public class PopUp_RFID extends javax.swing.JPanel {

    /**
     * Creates new form PopUp_RFID
     */
    public PopUp_RFID() {
        initComponents();
        this.setOpaque(false);
        scan_text.setText("Pindai Kartu");
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        animasi = new javax.swing.JLabel();
        scan_text = new javax.swing.JLabel();
        PopUp = new javax.swing.JLabel();
        scan_input = new javax.swing.JTextField();

        setBackground(new Color(0,0,0,200));
        setLayout(null);

        animasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/barcode (1).gif"))); // NOI18N
        add(animasi);
        animasi.setBounds(290, 80, 130, 130);

        scan_text.setFont(new java.awt.Font("Microsoft Tai Le", 0, 18)); // NOI18N
        add(scan_text);
        scan_text.setBounds(210, 220, 300, 30);

        PopUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/RFID.png"))); // NOI18N
        PopUp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PopUp.setFocusCycleRoot(true);
        add(PopUp);
        PopUp.setBounds(0, 0, 718, 320);

        scan_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scan_inputActionPerformed(evt);
            }
        });
        scan_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                scan_inputKeyReleased(evt);
            }
        });
        add(scan_input);
        scan_input.setBounds(290, 70, 320, 22);
    }// </editor-fold>//GEN-END:initComponents

    private void scan_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scan_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scan_inputActionPerformed

    private void scan_inputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_scan_inputKeyReleased
      if(scan_input.getText().length() >= 10){
      Logic.LogicLogin logiclogin = new LogicLogin();
      boolean isLogin = logiclogin.ScanRFID(scan_input.getText());
      if(isLogin){
            String lvl = Logic.LogicLogin.level;
            this.setVisible(true);
            if(lvl.equals("owner")){   
//                Floginberhasilowner owner = new Floginberhasilowner();
//                owner.setVisible(true);
//                JOptionPane.showMessageDialog(null,"Berhasil Login Owner");
                
             JOptionPane.showMessageDialog(null,"Berhasil Login Owner");
             new dasboardowner().setVisible(true);
             Window window = SwingUtilities.windowForComponent(this);
             if(window instanceof Dialog){
                 Dialog dialog = (Dialog) window;
                 
            Window window2 = SwingUtilities.getWindowAncestor(dialog);
                 JFrame login = (JFrame) window2;
//                 dialog.dispose();
                 login.dispose();
               
             }
            
            }else if(lvl.equals("admin kasir")){
                JOptionPane.showMessageDialog(null,"Berhasil Login Admin Kasir");
                new dashboardadmin().setVisible(true);
                 
                Window window = SwingUtilities.windowForComponent(this);
             if(window instanceof Dialog){
                 Dialog dialog = (Dialog) window;
                 
            Window window2 = SwingUtilities.getWindowAncestor(dialog);
                 JFrame login = (JFrame) window2;
//                 dialog.dispose();
                 login.dispose();
               
             }
                
//                this.dispose();
//                new Floginberhasiladmin().setVisible(true);
                
            }  
        }else{
//             Flogingagal gagal = new Flogingagal();
//             gagal.setVisible(true);
                scan_text.setText("Kartu Tidak Valid");
                
        }
    }
      
    }//GEN-LAST:event_scan_inputKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PopUp;
    private javax.swing.JLabel animasi;
    private javax.swing.JTextField scan_input;
    private javax.swing.JLabel scan_text;
    // End of variables declaration//GEN-END:variables
}
