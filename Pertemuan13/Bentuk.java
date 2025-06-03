	package Pertemuan13;
	
	abstract class Bentuk {
	    abstract double hitungLuas();
	}
	
	class Lingkaran extends Bentuk {
	    double radius;
	    Lingkaran(double r) { this.radius = r; }
	
	    double hitungLuas() {
	        return Math.PI * radius * radius;
	    }
	}
	
	class Tabung extends Bentuk {
	    double radius, tinggi;
	    Tabung(double r, double t) {
	        this.radius = r;
	        this.tinggi = t;
	    }
	
	    double hitungLuas() {
	        return 2 * Math.PI * radius * (radius + tinggi);
	    }
	}
	
	class PersegiPanjang extends Bentuk {
	    double panjang, lebar;

	    PersegiPanjang(double p, double l) {
	        this.panjang = p;
	        this.lebar = l;
	    }

	    double hitungLuas() {
	        return panjang * lebar;
	    }
	}
