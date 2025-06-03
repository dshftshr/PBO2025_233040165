package Pertemuan13;

public class MainPolymorph {
    public static void main(String[] args) {
        Bentuk lingkaran = new Lingkaran(7);
        Bentuk tabung = new Tabung(7, 10);
        Bentuk persegiPanjang = new PersegiPanjang(5, 8);

        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Luas Tabung: " + tabung.hitungLuas());
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.hitungLuas());
    }
}
