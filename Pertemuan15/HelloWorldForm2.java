package Pertemuan15;

import javax.swing.JFrame;            // Mengimpor kelas JFrame dari pustaka Swing
import javax.swing.JLabel;            // Mengimpor kelas JLabel dari pustaka Swing

public class HelloWorldForm2 extends JFrame {     // Mendeklarasikan kelas HelloWorldForm2 sebagai turunan dari JFrame
    private JLabel label;                         // Membuat variabel label dari tipe JLabel

    public HelloWorldForm2() {                    // Konstruktor dari kelas HelloWorldForm2
        label = new JLabel();                     // Membuat objek JLabel baru
        label.setText("Hallo Dunia!");            // Menetapkan teks pada label menjadi "Hallo Dunia!"

        add(label);                               // Menambahkan label ke dalam form
        setTitle("Program pertama");              // Menetapkan judul form menjadi "Program pertama"

        setSize(600, 300);                        // Menentukan ukuran form lebar 600 dan tinggi 300
    }
}

