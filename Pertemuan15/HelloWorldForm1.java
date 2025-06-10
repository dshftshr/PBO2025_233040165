package Pertemuan15;

// latihan 1-1

import javax.swing.JFrame;     // Import kelas JFrame dari library Swing
import javax.swing.JLabel;     // Import kelas JLabel dari library Swing

public class HelloWorldForm1 extends JFrame {   // Membuat kelas HelloWorldForm1 yang merupakan turunan dari JFrame
    private JLabel label;      // Deklarasi variabel label bertipe JLabel

    public HelloWorldForm1() { // Konstruktor kelas HelloWorldForm1
        label = new JLabel();                      // Inisialisasi objek JLabel
        label.setText("Helloworld!");              // Memberi teks "Helloworld!" pada label

        add(label);                                // Menambahkan label ke form
        setTitle("My First Program");              // Memberikan judul form

        setVisible(true);                          // Menampilkan form ke layar
        setSize(300, 200);                         // Mengatur ukuran form (lebar: 300, tinggi: 200)
    }
}