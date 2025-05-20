package Pertemuan11.StudyKasus;

// Kelas Mobil merupakan subclass dari Kendaraan dan mengimplementasikan interface Bergerak
public class Mobil extends Kendaraan implements Bergerak {

    // Implementasi metode jalan() dari interface Bergerak
    // Menjelaskan bagaimana mobil berjalan
    public void jalan() {
        System.out.println("Mobil berjalan dengan mesin.");
    }

    // Implementasi metode berhenti() dari interface Bergerak
    // Menjelaskan bagaimana mobil berhenti
    public void berhenti() {
        System.out.println("Mobil berhenti di lampu merah.");
    }

    // Implementasi metode roda() dari kelas abstrak Kendaraan
    // Menjelaskan jumlah roda mobil
    public void roda() {
        System.out.println("punya roda 4");
    }
}