// Tugas 01, Nomor 03

/*Buatlah inputan seperti berikut,
Nama : Ikhsan
Umur : 21
Hobi : Baca Komik

Kemudian tampilkan output seperti berikut :
Nama saya Ikhsan, 21 tahun, hobi Baca Komik

(Tambahkan try catch untuk mengecek jika umur bukan angka) */

import java.util.Scanner; // import scanner untuk input

public class Tugas01No03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // membuat objek scanner untuk membaca input

        try { // blok try untuk menangani pengecualian jika input umur bukan angka
            System.out.print("Nama : "); // menampilkan pesan "Nama : " ke layar
            String nama = scanner.nextLine(); // membaca input nama dari pengguna

            System.out.print("Umur : "); // menampilkan pesan "Umur : " ke layar
            int umur = scanner.nextInt(); // membaca input umur dari pengguna
            scanner.nextLine(); // membaca line kosong setelah nextInt()

            System.out.print("Hobi : "); // menampilkan pesan "Hobi : " ke layar
            String hobi = scanner.nextLine(); // membaca input hobi

            System.out.println("Nama saya " + nama + ", " + umur + " tahun, hobi " + hobi); // menampilkan output

        } catch (Exception e) { // blok catch untuk menangani pengecualian jika input umur bukan angka
            System.out.println("Umur harus berupa angka!"); // menampilkan pesan kesalahan ke layar
        }

    }
}
