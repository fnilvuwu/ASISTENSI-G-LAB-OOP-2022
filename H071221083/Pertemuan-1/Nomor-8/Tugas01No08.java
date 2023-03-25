import java.util.Scanner; // import scanner untuk input

public class Tugas01No08 { //
    public static void main(String[] args) { 
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // Mendefinisikan array 2D bernama nums dengan nilai yang sudah diberikan
        
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Masukkan angka yang ingin dicari: "); 
        int target = scanner.nextInt(); // Memperoleh input angka dari pengguna dan menyimpannya dalam bentuk integer di dalam variabel target
        
        boolean found = false; // Mendeklarasikan dan menginisialisasi variabel found dengan nilai false. Variabel found digunakan untuk menunjukkan apakah angka yang dicari sudah ditemukan dalam array atau belum.
        
        for (int i = 0; i < nums.length; i++) { 
            for (int j = 0; j < nums[i].length; j++) { // Memulai perulangan untuk mencari angka yang dicari dalam baris yang sedang diakses. Variabel j digunakan untuk mengakses setiap elemen dalam baris.
                if (nums[i][j] == target) { // Jika nilai target ditemukan dalam elemen yang sedang diakses, mencetak pesan dan mengatur found menjadi true.
                    System.out.printf("Found %d at [%d][%d]\n", target, i, j);
                    found = true;
                    break; // Keluar dari perulangan untuk mencari elemen dalam baris yang sedang diakses
                }
            }
            if (found) { // Jika nilai target sudah ditemukan, keluar dari perulangan utama.
                break;
            }
        }
        
        if (!found) { // Jika nilai target tidak ditemukan dalam array, mencetak pesan.
            System.out.println("Angka tidak ditemukan dalam array.");
        }
    }
}
