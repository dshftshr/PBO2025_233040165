package Pertemuan11.latihan1;

// Kelas Lingkaran adalah turunan dari kelas abstrak Bentuk
public class Lingkaran extends Bentuk {

    // Konstruktor Lingkaran menerima parameter jari-jari dan 
    // memanggil konstruktor superclass (Bentuk) untuk menginisialisasinya
    public Lingkaran(int jari2){
        super(jari2);
    }
    
    // Implementasi metode abstrak luas() dari kelas Bentuk
    // Menghitung luas lingkaran dengan rumus: PHI * jari-jari * jari-jari
    public double luas(){
        return PHI * jari2 * jari2;
    }
}
