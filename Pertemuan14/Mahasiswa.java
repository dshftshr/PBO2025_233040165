package Pertemuan14;

public class Mahasiswa {
    // Variabel final untuk NIM yang tidak bisa diubah setelah inisialisasi
    private final String nim;
    private String nama;
    
    // Variabel static untuk menghitung total mahasiswa
    private static int totalMahasiswa = 0;
    
    // Konstanta static final untuk batas maksimum SKS
    public static final int MAX_SKS = 24;
    
    // Constructor
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        totalMahasiswa++; // Menambah counter setiap instance baru dibuat
    }
    
    // Method untuk menampilkan info mahasiswa
    public void displayInfo() {
        System.out.println("NIM: " + this.nim);
        System.out.println("Nama: " + this.nama);
        System.out.println("Maksimum SKS: " + MAX_SKS);
        System.out.println("------------------------");
    }
    
    // Method static untuk mendapatkan total mahasiswa
    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }
    
    // Getter untuk NIM (final variable tetap bisa diakses)
    public String getNim() {
        return nim;
    }
    
    // Getter dan setter untuk nama
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
}
