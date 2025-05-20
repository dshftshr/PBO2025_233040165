package Pertemuan9;

public class Mobil extends Kendaraan {
    int pintu;

    Mobil (String merek, int tahun, String warna, int pintu) {
        super(merek, tahun, warna);
        this.pintu = pintu;
    }

    void info() {
        super.info();
        System.out.println("Jumlah pintu: " + pintu);
    }
}
