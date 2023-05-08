/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import view.login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

import koneksi.Conn;

/**
 *
 * @author WINDOWS 10
 */
//method login awal
public class LogicLogin {
    public static String level;
    public static String userId;
    public static String nama;
    
    public boolean log(String username, String pass){
        try {
            String query = "SELECT * FROM tb_login WHERE id_pegawai ='"+ username +"' AND password ='" + pass + "'";
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(query);
            ResultSet res = pst.executeQuery();
            if(res.next()){
                String lvl = res.getString("level");
                this.level = lvl;
                this.userId = res.getString("id_login");
                return true;
            }else{
                  return false;
            }
        } catch (Exception e) {
                return false;
        }
    }
    //method lupa1
    public boolean forgetPassword(String username,String pin ){
        try {
            String query = "SELECT * FROM tb_login WHERE id_pegawai ='"+ username +"' AND pin ='" + pin + "'";
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(query);
            ResultSet res = pst.executeQuery();
            
            if(res.next()){
               this.userId = res.getString("id_login");
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean changePassword(String pass){
        try {
            String query = "UPDATE tb_login SET password ='" + pass + "' WHERE id_login ='" + userId + "'";
            Statement st = (Statement) Conn.configDB().createStatement();
            st.executeUpdate(query);
          return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    //method lupa2
    public boolean konfirmasiLupaPasswordUser(String username,int pin){
        try {
            String query = "SELECT * FROM tb_login WHERE id_pegawai ='"+ username +"' AND pin ='" + pin + "' AND id = '"+userId+"'";
            Connection koneksi = (Connection)Conn.configDB();
            PreparedStatement pst = koneksi.prepareStatement(query);
            ResultSet res = pst.executeQuery();
            
            if(res.next()){
                return true;
            }else{
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
    
        
 
    //method untuk logout
    public void logOut(){
        level = "";
        userId = "";
        nama = "";
        new login().setVisible(true);
    }
}

