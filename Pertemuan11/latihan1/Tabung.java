package Pertemuan11.latihan1;

// Kelas Tabung merupakan turunan dari kelas abstrak Bentuk
public class Tabung extends Bentuk {

    // Variabel tinggi hanya bisa diakses dalam kelas ini
    private int tinggi;

    // Konstruktor default, memanggil konstruktor superclass dengan nilai jari2 = 0
    public Tabung(){
        super(0);
    }

    // Konstruktor dengan parameter jari2 dan tinggi
    // Menginisialisasi nilai jari2 dari superclass dan tinggi dari kelas ini
    public Tabung(int jari2, int tinggi){
        super(jari2);
        this.tinggi = tinggi;
    }

    // Implementasi metode abstrak luas() dari kelas Bentuk
    // Menghitung luas permukaan tabung dengan rumus: 2 * PHI * r * (r + t)
    public double luas(){
        return 2 * PHI * jari2 * (jari2 + tinggi);
    }

    // Getter untuk mengambil nilai tinggi
    public int getTinggi(){
        return this.tinggi;
    }

    // Setter untuk mengubah nilai tinggi
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
}