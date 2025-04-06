package Pertemuan4;

public class LingkaranMain {
	public static void main(String[] args) {
		// membuat objek lingkaran
		Lingkaran l1 = new Lingkaran(5);
		Lingkaran l2 = l1; 
		
		System.out.println("Nilai jari-jari awal:");
		System.out.println("l1: " + l1.getjari2());
		System.out.println("l2: " + l2.getjari2());
		
		l2.setJari2(10);
		
		System.out.println("Setelah perubahan jari-jari:");
		System.out.println("l1: " + l1.getjari2());
		System.out.println("l2: " + l2.getjari2());
		
		System.out.println("Luas lingkaran: " + l1.hitungLuas());
	}
}
