package Pertemuan11.StudyKasus;

// Kelas Sepeda merupakan subclass dari Kendaraan dan mengimplementasikan interface Bergerak
public class Sepeda extends Kendaraan implements Bergerak {

    // Implementasi metode jalan() dari interface Bergerak
    // Menjelaskan bagaimana sepeda berjalan
    public void jalan() {
        System.out.println("Sepeda berjalan dengan dikayuh.");
    }

    // Implementasi metode berhenti() dari interface Bergerak
    // Menjelaskan bagaimana sepeda berhenti
    public void berhenti() {
        System.out.println("Sepeda berhenti dengan rem tangan.");
    }

    // Implementasi metode roda() dari kelas abstrak Kendaraan
    // Menjelaskan jumlah roda sepeda
    public void roda() {
        System.out.println("punya roda 2");
    }
}