// Tugas 01, Nomor 06

/*Buatlah kode untuk menghitung luas lingkaran, dengan output 2 angka
 * dibelakang koma! (Jangan lupa tambahkan try catch untuk input bukan angka)*/

import java.util.Scanner; //import kelas Scanner untuk membaca input dari pengguna

public class Tugas01No06 {
    public static void main(String[] args) { // method utama
        Scanner input = new Scanner(System.in); // membuat objek Scanner untuk membaca input dari pengguna
        double radius, luas; // mendeklarasikan variabel radius dan luas dengan tipe data double

        try { // menggunakan try-catch untuk menangani kesalahan input yang mungkin terjadi
            System.out.print("Masukkan radius lingkaran: "); // menampilkan pesan untuk meminta input radius
            radius = input.nextDouble(); // membaca input dari pengguna dan menyimpannya ke variabel radius

            luas = Math.PI * radius * radius; // menghitung luas lingkaran menggunakan rumus pi*r^2
            System.out.printf("Luas lingkaran adalah: %.2f", luas); // menampilkan hasil perhitungan ke layar dengan format dua angka di belakang koma menggunakan fungsi printf

        } catch (Exception e) { // menangani kesalahan input yang bukan angka
            System.out.println("Input tidak valid. Masukkan angka!"); // menampilkan pesan kesalahan ke layar
        }
    }
}
