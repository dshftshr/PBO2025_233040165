package Pertemuan11.latihan2;

// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek KartuElektronik dengan kodeBank "IF11" dan PIN "12345"
        KartuElektronik kartu = new KartuElektronik("IF11", "12345");
        
        // Memanggil metode otentikasi dengan input PIN "12345" dan menampilkan hasilnya
        System.out.println("Otentikasi = " + kartu.otentikasi("12345"));
    }
}
