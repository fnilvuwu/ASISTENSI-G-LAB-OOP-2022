// Tugas 01, nomor 07

import java.util.Scanner;

public class Tugas01No07 {
    private String[] data; // Deklarasi array data sebagai variabel instance, ini materi bab IV Encapsulation

    public Tugas01No07() {
        // Konstruktor untuk menginisialisasi array data dengan beberapa contoh string
        data = new String[] { "pyro", "hydro", "electro", "cryo", "anemo", "geo", "dendro" };
    }

    public int findIndex(String text) {
        // Method untuk mencari indeks dari sebuah string pada array
        // Mengubah teks menjadi lowercase untuk membandingkan dengan lowercase dari data array
        String lowercaseText = text.toLowerCase();

        // Looping untuk mencari indeks dari teks pada array
        for (int i = 0; i < data.length; i++) {
            String lowercaseData = data[i].toLowerCase();
            if (lowercaseData.equals(lowercaseText)) { // Jika ditemukan teks pada array
                return i; // Kembalikan indeks dari teks pada array
            }
        }

        // Jika tidak ditemukan teks pada array, kembalikan -1
        return -1;
    }

    public static void main(String[] args) {
        Tugas01No07 example = new Tugas01No07(); // Membuat objek class

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama elemen: ");
        String input = scanner.nextLine();

        // Mencari indeks dari teks yang dimasukkan pengguna
        int index = example.findIndex(input);

        if (index == -1) {
            System.out.println(-1 + " : Elemen tidak ditemukan dalam game Genshin Impact");
        } else {
            System.out.println("Index dari \"" + input + "\": " + index);
        }
    }
}
