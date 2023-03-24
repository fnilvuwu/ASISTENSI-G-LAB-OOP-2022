// Tugas 01, Nomor 02

/* Buatlah program yang menerima n inputan bilangan, kemudian tampilan berapa bilangan decimal dan berapa bilangan bulat dari bilangan yang diinput.
Contoh input :
5
10 2.3 4 11.2 3
Contoh Output:
3 Bilangan Bulat
2 Bilangan Desimal
(Tambahkan trycatch untuk input bukan angka)*/

import java.util.Scanner; //import scanner untuk input

public class Tugas01No02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0; //delarasi banyak bilangan 
        double[] arr;  // deklarasi banyak array
        try {
            System.out.print("Masukkan jumlah bilangan: ");
            n = scanner.nextInt(); //input banyak bilangan
            arr = new double[n]; 
            
            for (int i = 0; i < n; i++) {
                // System.out.printf("Masukkan bilangan ke-%d: ", i+1);
                arr[i] = scanner.nextDouble();  // isi array sesuai banyak bilangan
            }

            int count_bulat = 0; //wadah buat bilbul
            int count_desimal = 0;  //wadah buat bildes

            for (int i = 0; i < n; i++) {
                if (arr[i] == (int)arr[i]) { //hitung banyak array berisi bilbul
                    count_bulat++;
                } else { //hitung banyak array berisi bildes
                    count_desimal++;
                }
            }

            System.out.printf("%d Bilangan Bulat\n%d Bilangan Desimal", count_bulat, count_desimal);

        } catch (Exception e) {
            System.out.println("Input harus berupa bilangan!");
        } finally {
            scanner.close();
        }
    }
}
