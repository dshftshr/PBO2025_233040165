package Pertemuan15;

// latihan 1-3

import javax.swing.*;         // Untuk komponen GUI seperti JFrame, JLabel, JButton
import java.awt.*;            // Untuk layout seperti GridLayout
import java.awt.event.*;      // Untuk event listener seperti ActionListener dan ActionEvent


public class HelloWorldForm3 extends JFrame implements ActionListener // Membuat kelas HelloWorldForm3 yang mewarisi JFrame dan mengimplementasikan ActionListener
{
    private JLabel label;  // Deklarasi variabel label bertipe JLabel
    private JButton button;  // Deklarasi variabel button bertipe JButton

    public HelloWorldForm3() // Konstruktor kelas HelloWorldForm3
    {
        label = new JLabel(); // Inisialisasi objek JLabel
        label.setText("Hello world!"); // Menampilkan teks awal "Hello world!" pada label

        button = new JButton("Klik Me!"); // Inisialisasi tombol dengan teks "Klik Me!"
        button.addActionListener(this); // Menambahkan event listener ke button agar bisa merespons klik

        setLayout(new GridLayout(2,1)); // Mengatur layout menjadi Grid 2 baris 1 kolom
        add(label); // Menambahkan komponen label ke dalam form
        add(button); // Menambahkan komponen button ke dalam form

        setTitle("My First Program"); // Menetapkan judul form
        setVisible(true); // Menampilkan form ke layar
        setSize(300, 200); // Mengatur ukuran form (lebar: 300px, tinggi: 200px)
    }

    @Override
    public void actionPerformed(ActionEvent e) // Fungsi ini dijalankan saat tombol diklik
    {
        label.setText("Hallo Dunia!"); // Mengubah teks label menjadi "Hallo Dunia!" saat button diklik
    }
}

