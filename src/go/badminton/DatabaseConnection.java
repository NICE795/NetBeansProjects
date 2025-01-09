package go.badminton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/db_badminton?useUnicode=true&characterEncoding=UTF-8";
    private static final String USER = "root"; // Ganti dengan username DB Anda
    private static final String PASSWORD = ""; // Ganti dengan password DB Anda

    public static Connection getConnection() {
        try {
            // Membuat koneksi ke database
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            
            // Memeriksa apakah koneksi berhasil
            if (conn != null) {
                return conn; // Mengembalikan koneksi yang valid
            } else {
                System.out.println("Koneksi gagal!");
                return null;
            }
        } catch (SQLException e) {
            // Menampilkan detail error jika terjadi SQLException
            e.printStackTrace();
            System.out.println("Error Code: " + e.getErrorCode());
            System.out.println("SQL State: " + e.getSQLState());
            System.out.println("Message: " + e.getMessage());
            return null; // Mengembalikan null jika terjadi kesalahan
        }
    }
}


