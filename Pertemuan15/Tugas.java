package Pertemuan15;

//Kasus 2-1

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tugas extends JFrame {
    private JTextField txt1, txt2;     // Dua input field
    private JButton btnJumlah;         // Tombol untuk menjumlahkan

    public tugas() {
        initComponents();              // Inisialisasi komponen
        setupLayout();                 // Mengatur tata letak komponen
        setupEventHandlers();          // Mengatur aksi event tombol
    }

    private void initComponents() {
        setTitle("Kasus 2-1");                  // Judul frame
        setSize(200, 150);                      // Ukuran frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Tutup saat klik X
        setLayout(null);                        // Gunakan layout manual (null)
        setLocationRelativeTo(null);            // Tampilkan frame di tengah layar

        txt1 = new JTextField();                // Text field pertama
        txt1.setBounds(20, 20, 150, 25);
        txt1.setText("5");                      // Nilai default

        txt2 = new JTextField();                // Text field kedua
        txt2.setBounds(20, 50, 150, 25);
        txt2.setText("7");                      // Nilai default

        btnJumlah = new JButton("Jumlah");      // Tombol Jumlah
        btnJumlah.setBounds(20, 80, 150, 25);
    }

    private void setupLayout() {
        add(txt1);             // Tambahkan input pertama ke frame
        add(txt2);             // Tambahkan input kedua ke frame
        add(btnJumlah);        // Tambahkan tombol ke frame
    }

    private void setupEventHandlers() {
        btnJumlah.addActionListener(new ActionListener() { // Aksi saat tombol diklik
            public void actionPerformed(ActionEvent e) {
                hitungJumlah(); // Panggil fungsi hitungJumlah
            }
        });
    }

    private void hitungJumlah() {
        try {
            int angka1 = Integer.parseInt(txt1.getText()); // Ambil nilai dari txt1
            int angka2 = Integer.parseInt(txt2.getText()); // Ambil nilai dari txt2
            int hasil = angka1 + angka2;                   // Hitung jumlah

            tampilkanHasil(hasil);                         // Tampilkan hasilnya
        } catch (NumberFormatException ex) {
            tampilkanError("Input harus berupa angka!");   // Tampilkan error jika bukan angka
        }
    }

    private void tampilkanHasil(int hasil) {
        JOptionPane.showMessageDialog(this, "Jumlah: " + hasil, "Message", JOptionPane.INFORMATION_MESSAGE);
    }

    private void tampilkanError(String pesan) {
        JOptionPane.showMessageDialog(this, pesan, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void tampilkan() {
        setVisible(true); // Menampilkan frame
    }
}
