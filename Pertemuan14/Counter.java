package Pertemuan14;

public class Counter {
    // Variabel static untuk menghitung jumlah instance
    private static int instanceCount = 0;
    
    // Constructor yang menambah instanceCount setiap dipanggil
    public Counter() {
        instanceCount++;
    }
    
    // Method static untuk mendapatkan jumlah instance
    public static int getInstanceCount() {
        return instanceCount;
    }
}
