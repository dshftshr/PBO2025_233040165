package Pertemuan11.latihan2;

// Kelas KartuElektronik mengimplementasikan interface Kartu
public class KartuElektronik implements Kartu {

    // Variabel kodeBank menyimpan kode bank terkait kartu
    private String kodeBank;

    // Variabel pin menyimpan PIN asli dari kartu
    private String pin;

    // Konstruktor untuk menginisialisasi objek KartuElektronik dengan kode bank dan pin
    public KartuElektronik(String kodeBank, String pin){
        this.kodeBank = kodeBank;
        this.pin = pin;
    }

    // Implementasi metode otentikasi dari interface Kartu
    // Memeriksa apakah input dari pengguna cocok dengan PIN yang tersimpan
    public boolean otentikasi(String pinInput){
        if (this.pin.equals(pinInput)){
            System.out.println("pin ada cocok"); // Menampilkan pesan jika PIN cocok
            return true;
        } else {
            return false;
        }
    }

    // Implementasi metode encode dari interface Kartu
    // Menggabungkan kodeBank dengan pin untuk menghasilkan representasi yang terenkripsi sederhana
    public String encode(String pin) {
        return kodeBank + "-" + pin;
    }
}
