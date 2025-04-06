package Pertemuan4;

public class Lingkaran {
	double jari2;
	
	// konstruktor
	public Lingkaran(double jari2) {
		this.jari2 = jari2;
	}
	
	// getter untuk jari2
	public double getjari2() {
		return jari2;
	}
	
	// setter untuk jari2
	public void setJari2(double jari2) {
		this.jari2 = jari2;
	}
	
	// fungsi untuk menghitung luas lingkaran
	public double hitungLuas() {
		return Math.PI * jari2 * jari2;
	}
}