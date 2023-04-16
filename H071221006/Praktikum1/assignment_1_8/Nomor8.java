import java.util.Scanner;

public class Nomor8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Membuat array 2D
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.print("Masukkan bilangan yang ingin dicari: ");
        int num = sc.nextInt();

        // membuat variabel bertipe boolean jika yg kita cari tidak ada
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == num) {
                    found = true;
                    System.out.printf("Found %d [%d] [%d]", num, i, j);
                }
            }
        }

        if (!found) {   
            // (!) artinya negasi
            System.out.printf("Not Found %d", num);
        }

        sc.close();
    }
}

