package Pertemuan9;

public class Motor extends Kendaraan {
    String jenis;
    Motor(String merek, int tahun, String warna, String jenis) {
        super(merek, tahun, warna);
        this.jenis = jenis;
    }

    void info() {
        super.info();
        System.out.println("Jenis motor: " + jenis);
    }
}