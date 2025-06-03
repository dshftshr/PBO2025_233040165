package Pertemuan14;

public class TestMahasiswa {
    public static void main(String[] args) {
        System.out.println("Aplikasi Manajemen Data Mahasiswa");
        System.out.println("Maksimum SKS per semester: " + Mahasiswa.MAX_SKS);
        System.out.println("----------------------------------------\n");
        
        // Membuat beberapa objek mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("202107001", "Budi Santoso");
        Mahasiswa mhs2 = new Mahasiswa("202107002", "Ani Wijaya");
        Mahasiswa mhs3 = new Mahasiswa("202107003", "Citra Dewi");
        
        // Menampilkan info masing-masing mahasiswa
        System.out.println("Data Mahasiswa:");
        mhs1.displayInfo();
        mhs2.displayInfo();
        mhs3.displayInfo();
        
        // Mengubah nama mahasiswa (NIM tidak bisa diubah karena final)
        mhs1.setNama("Budi Santoso Wijaya");
        
        System.out.println("Data setelah perubahan:");
        mhs1.displayInfo();
        
        // Menampilkan total mahasiswa
        System.out.println("Total Mahasiswa Terdaftar: " + Mahasiswa.getTotalMahasiswa());
        
        // Percobaan mengubah MAX_SKS akan menyebabkan error (uncomment untuk melihat error)
        // Mahasiswa.MAX_SKS = 30; // Error: Cannot assign a value to final variable MAX_SKS
    }
}