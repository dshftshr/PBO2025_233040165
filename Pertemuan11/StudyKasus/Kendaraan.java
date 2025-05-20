package Pertemuan11.StudyKasus;

// Kelas abstrak Kendaraan sebagai kelas dasar untuk berbagai jenis kendaraan
public abstract class Kendaraan {

    // Metode konkret untuk menampilkan jenis kendaraan
    public void tampilkanJenis() {
        System.out.println("Ini adalah kendaraan.");
    }

    // Metode abstrak roda() yang harus diimplementasikan oleh kelas turunan
    // Biasanya untuk menjelaskan jumlah atau jenis roda kendaraan
    public abstract void roda();
}
