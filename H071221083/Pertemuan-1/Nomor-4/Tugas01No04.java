// Tugas 01, Nomor 04

/*Buatlah method yang dapat digunakan untuk merubah huruf pertama dari tiap kata menjadi kapital.
Gunakan scanner untuk membuat inputan,

Berikut contoh inputannya :
Masukkan Judul Film :
> habis gelap terBitlaah Terang

Maka outputnya akan seperti berikut :
Habis Gelap Terbitlah Terang */

import java.util.Scanner; //import scanner untk input

public class Tugas01No04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // buat object untuk scanner

        System.out.print("Masukkan Judul Film : "); // menampilkan pesan untuk meminta input dari user
        String judul = scanner.nextLine(); // meminta input dari user dan menyimpannya ke dalam variabel judul

        String judulBaru = ubahHurufPertamaKapital(judul); // buat method

        System.out.println(judulBaru);
    }

    public static String ubahHurufPertamaKapital(String kalimat) {
        String[] kata = kalimat.toLowerCase().split(" "); // memisahkan tiap kata menjadi array dengan whitespace

        for (int i = 0; i < kata.length; i++) { // loop sebanyak jumlah kata pada array kata
            char[] huruf = kata[i].toCharArray();
            huruf[0] = Character.toUpperCase(huruf[0]); // kata pertama jadi uppercase
            kata[i] = new String(huruf);
        }

        String kalimatBaru = String.join(" ", kata); // ubah array menjadi string utuh
        return kalimatBaru;
    }
}