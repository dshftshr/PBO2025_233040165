package Pertemuan15;

import javax.swing.JFrame;                         // Mengimpor kelas JFrame

public class ProgramUtama {                        // Kelas utama untuk menjalankan program
    public static void main(String[] args) {       // Fungsi main sebagai titik awal program
        JFrame form = new HelloWorldForm2();       // Membuat objek HelloWorldForm2 dan menyimpannya dalam variabel bertipe JFrame
        form.setVisible(true);                     // Menampilkan form ke layar
    }
}