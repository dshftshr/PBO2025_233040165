package Pertemuan7;

public class TranskripNilaiMain {
	public static void main(String[] args) {
		Dosen dosen1 = new Dosen("	", "15110491");
		Dosen dosen2 = new Dosen("R. Sandika Galih Amalga., ST., MT", "15110492");
		Dosen dosen3 = new Dosen("Angooro Ari Nurcahyo. ST.,M.Kom", "15110493");
		Dosen dosen4 = new Dosen("Ferry Mulyanto, ST., M.Kom", "15110494");
        Dosen dosen5 = new Dosen("Caca Emile Supriana, S.SI., MT.", "15110495");
        Dosen dosen6 = new Dosen("Siroj Nur Ulum, S.T., M.T.", "15110495");

        Matakuliah mk1 = new Matakuliah("101","Matematika Dasar", "A", 3, dosen1);
        Matakuliah mk2 = new Matakuliah("102","Internet dan Teknologi Web", "A", 3, dosen2);
        Matakuliah mk3 = new Matakuliah("103","Perancangan Basis Data", "A", 3, dosen3);

        Matakuliah mk4 = new Matakuliah("201","Matematika Informatika I", "A", 3, dosen1);
        Matakuliah mk5 = new Matakuliah("202","Pemograman Web", "A", 3, dosen2);
        Matakuliah mk6 = new Matakuliah("203","Pemograman Basis Data", "A", 3, dosen3);
        Matakuliah mk7 = new Matakuliah("204","	Infrastruktur Jaringan", "A", 2, dosen4);

        Matakuliah mk8 = new Matakuliah("301","Matematika Informatika II", "A", 2, dosen1);
        Matakuliah mk9 = new Matakuliah("302","Infrastruktur Pendukung Aplikasi", "A", 2, dosen4);
        Matakuliah mk10 = new Matakuliah("303","Organizational Business Requirement", "B", 2, dosen5);
        Matakuliah mk11 = new Matakuliah("304","Rekayasa Perangkat Lunak", "A", 2, dosen6);        
        
        KartuHasilStudi khs1 = new KartuHasilStudi("1");
        KartuHasilStudi khs2 = new KartuHasilStudi("2");
        KartuHasilStudi khs3 = new KartuHasilStudi("3");
        
        khs1.addMataKuliah(mk1);
        khs1.addMataKuliah(mk2);
        khs1.addMataKuliah(mk3);

        khs2.addMataKuliah(mk4);
        khs2.addMataKuliah(mk5);
        khs2.addMataKuliah(mk6);
        khs2.addMataKuliah(mk7);
        
        khs3.addMataKuliah(mk8);
        khs3.addMataKuliah(mk9);
        khs3.addMataKuliah(mk10);
        khs3.addMataKuliah(mk11);

        //membuat object mahasiswa
        Mahasiswa mhs = new Mahasiswa("233040165", "Desi Hafita Ashri");

        //membuat object transkripnilai
        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKHS(khs1);
        transkrip.addKHS(khs2);
        transkrip.addKHS(khs3);

        //hitung IPK keseluruhan
        transkrip.hitungIPK();

        transkrip.display();
    }
}