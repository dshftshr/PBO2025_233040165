package Pertemuan14;

public class DatabaseConnection {
    // Variabel static untuk menyimpan URL koneksi database
    private static String connectionString;
    
    // Static block untuk inisialisasi
    static {
        // Proses inisialisasi yang kompleks bisa dilakukan di sini
        connectionString = "jdbc:mysql://localhost:3306/my_database?user=admin&password=secret";
        System.out.println("Static block dijalankan: Inisialisasi koneksi database selesai");
    }
    
    // Method untuk mendapatkan connectionString
    public static String getConnectionString() {
        return connectionString;
    }
}
