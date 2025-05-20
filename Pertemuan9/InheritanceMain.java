package Pertemuan9;

public class InheritanceMain {
    public static void main(String[] args) {
        Kendaraan m1 = new Mobil("Toyota", 2020, "Hitam", 4);
        Kendaraan m2 = new Motor("Honda", 2021, "Merah", "Matic");

        System.out.println("=== Data Mobil ===");
        m1.info();

        System.out.println("\n=== Data Motor ===");
        m2.info();
    }
}