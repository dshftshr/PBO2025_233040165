package Pertemuan9;

public class Kendaraan {
    String merek;
    int tahun;
    String warna;

    Kendaraan(String merek, int tahun, String warna) {
        this.merek = merek;
        this.tahun = tahun;
        this.warna = warna;
    }

    void info() {
        System.out.println("Merek: " + merek);
        System.out.println("Tahun: " + tahun);
        System.out.println("Warna: " + warna);
    }
}