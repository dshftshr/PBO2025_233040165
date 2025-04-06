package Pertemuan6;

import Pertemuan5.Matakuliah;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {
    private Date tglCetak;
    private double ipk ;
    private List<KartuHasilStudi> KartuHasilStudi;
    private  Mahasiswa mahasiswa;

    public TranskripNilai (Mahasiswa mahasiswa) {
        super();
        this.mahasiswa = mahasiswa;

        KartuHasilStudi = new ArrayList<KartuHasilStudi>();
        tglCetak = new Date();
    }

    public double hitungIPK(){
        double totalBobot = 0;
        int totalSKS = 0;

        for (KartuHasilStudi khs : KartuHasilStudi) {
            khs.hitungIps(); // Hitung IPS untuk setiap semester
            for (Matakuliah mk : khs.getDaftarMatakuliah()) {
                totalBobot += mk.getIndex() * mk.getSKS();
                totalSKS += mk.getSKS();
            }
        }

        if (totalSKS > 0) {
            this.ipk = totalBobot / totalSKS;
        } else {
            this.ipk = 0;
        }

        return this.ipk;
    }

    public void addKHS (KartuHasilStudi khs) {
        KartuHasilStudi.add(khs);
    }

    public void display (){
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal cetak: " + tglCetak.toString());
        System.out.println("IPK: " + ipk);

        for (KartuHasilStudi khs : KartuHasilStudi) {
            System.out.println(khs.display());
        }

    }
}