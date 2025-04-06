package Pertemuan6;

import Pertemuan5.Matakuliah;

public class TranskripNilaiMain {
    public static void main(String[] args) {
        // Create object matakuliah
        Matakuliah mk1 = new Matakuliah("001","Visualisasi Data", "A", 3);
        Matakuliah mk2 = new Matakuliah("002","Teori Komputasi", "A", 2);
        Matakuliah mk3 = new Matakuliah("003","Praktikum Multimedia", "B", 2);

        // membuat object khs
        KartuHasilStudi khs = new KartuHasilStudi("1");
        khs.addMataKuliah(mk1);
        khs.addMataKuliah(mk2);
        khs.addMataKuliah(mk3);

        // Membuat object mahasiswa
        Mahasiswa mhs = new Mahasiswa("233040165", "Desi Hafita Ashri");

        // membuat object transkripnilai
        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKHS(khs);

        // Hitung IPK keseluruhan
        transkrip.hitungIPK();

        transkrip.display();
    }
}