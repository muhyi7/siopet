package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conn {
    public static Connection mysqlconfig;
    public static Connection configDB() throws SQLException{
        try {
            String url = "jdbc:mysql://localhost/siopet";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url,user,pass);
        } catch (Exception e) {
            System.err.println("koneksi gagal " + e.getLocalizedMessage());
        }
        return mysqlconfig;
}

    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
