package sistemhotel;

import java.sql.*;
import javax.swing.JOptionPane;

public class Koneksi {

    Connection conn;
    Statement stmn;

    public void koneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/hotel", "root", "");
            stmn = conn.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal " + ex);
            try {
                stmn.close();
                conn.close();
            } catch (SQLException ex1) {
                JOptionPane.showMessageDialog(null, "Koneksi Dibatalkan " + ex1);
            }

        }
    }
}
