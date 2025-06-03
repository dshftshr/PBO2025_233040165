package Pertemuan14;

public class TestDatabaseConnection {
    public static void main(String[] args) {
        System.out.println("Aplikasi dimulai...");
        
        // Mengakses connectionString akan memicu eksekusi static block
        System.out.println("URL Koneksi Database: " + DatabaseConnection.getConnectionString());
        
        System.out.println("Aplikasi berjalan...");
    }
}