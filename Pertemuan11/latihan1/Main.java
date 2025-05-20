package Pertemuan11.latihan1;

// Kelas utama (main class) untuk menjalankan program
public class Main {
    public static void main(String[] args) {

        // Membuat objek Lingkaran dengan jari-jari 9
        Lingkaran l1 = new Lingkaran(9);
        System.out.println("==== Lingkaran ====");
        
        // Menampilkan jari-jari lingkaran
        System.out.println("jari jari = " + l1.jari2); // Catatan: akses langsung ke variabel protected
        // Menampilkan luas lingkaran
        System.out.println("Luas = " + l1.luas());

        // Membuat objek Tabung dengan jari-jari 10 dan tinggi 5
        Tabung t1 = new Tabung(10, 5);
        System.out.println("==== Tabung ====");
        
        // Menampilkan jari-jari tabung
        System.out.println("jari jari = " + t1.jari2); // Catatan: akses langsung ke variabel protected
        // Menampilkan luas permukaan tabung
        System.out.println("Luas = " + t1.luas());
    }
}