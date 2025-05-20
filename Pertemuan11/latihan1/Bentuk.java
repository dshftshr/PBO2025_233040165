package Pertemuan11.latihan1;

// Deklarasi kelas abstrak bernama Bentuk
public abstract class Bentuk {
    
    // Variabel konstanta PHI bernilai 3.14, biasanya digunakan untuk perhitungan lingkaran
    protected double PHI = 3.14;

    // Variabel jari2 bertipe integer, dilindungi agar bisa diakses oleh subclass
    protected int jari2;

    // Konstruktor untuk menginisialisasi nilai jari2 saat objek dibuat
    public Bentuk(int jari2){
        this.jari2 = jari2;
    }

    // Metode abstrak luas yang harus diimplementasikan oleh subclass
    public abstract double luas();

    // Getter untuk mendapatkan nilai jari2
    public int getJari2(){
        return jari2;
    }

    // Setter untuk mengubah nilai jari2
    public void setJari2(int jari2) {
        this.jari2 = jari2;
    }
}