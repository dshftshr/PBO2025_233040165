package Pertemuan11.latihan2;

// Interface Kartu mendefinisikan kontrak untuk kelas-kelas yang akan mengimplementasikannya
public interface Kartu {

    // Metode otentikasi untuk memverifikasi apakah PIN yang diberikan valid
    // Mengembalikan nilai true jika PIN sesuai, false jika tidak
    public boolean otentikasi(String pin);

    // Metode encode untuk mengenkripsi atau mengubah PIN menjadi bentuk lain (misalnya hash)
    // Mengembalikan hasil encoding dari PIN yang diberikan
    public String encode(String pin);
}
