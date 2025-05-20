package Pertemuan11.StudyKasus;

// Kelas utama untuk menjalankan program dan menguji objek Mobil dan Sepeda
public class Main {
    public static void main(String[] args) {
        // Membuat objek Mobil dan memanggil metode-metode yang dimiliki
        Mobil mobil = new Mobil();
        mobil.tampilkanJenis();  // Memanggil metode dari kelas Kendaraan (superclass)
        mobil.jalan();           // Memanggil metode jalan() dari interface Bergerak
        mobil.berhenti();        // Memanggil metode berhenti() dari interface Bergerak
        mobil.roda();            // Memanggil metode roda() dari kelas Mobil (implementasi abstrak)

        System.out.println();    // Mencetak baris kosong untuk pemisah output

        // Membuat objek Sepeda dan memanggil metode-metode yang dimiliki
        Sepeda sepeda = new Sepeda();
        sepeda.tampilkanJenis(); // Memanggil metode dari kelas Kendaraan (superclass)
        sepeda.jalan();          // Memanggil metode jalan() dari interface Bergerak
        sepeda.berhenti();       // Memanggil metode berhenti() dari interface Bergerak
        sepeda.roda();           // Memanggil metode roda() dari kelas Sepeda (implementasi abstrak)
    }
}