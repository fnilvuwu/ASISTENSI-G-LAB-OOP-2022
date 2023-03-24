// Tugas 01, Nomor 01

/*Terdapat 7 soal, terdapat beberap mahasiswa dengan nim yang berbeda, agar setiap soal dapat terbagi secara adil ke mahasiswa maka anda diminta untuk membuat fungsi yang bisa menentukan nomor yang diperoleh mahasiswa berdasarkan nim yang diberikan.
Ketentuan pembagian soal berdasarkan 3 nim terakhir mahasiswa.
Misalnya
NIM : H071191049
Soal : no 7
NIM : H071191050
Soal : no 1
NIM : H071191055
Soal : no 6
Ctt : silahkan pikirkan sendiri bagaimana cara pembagiannya, setelah melihat beberapa contoh diatas. */

import java.util.Scanner; //import scanner untuk inputan

public class Tugas01No01 { // class sesuai nama file

    public static void main(String[] args) {
        int jumlahSoal = 7; // jumlah soal
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nomor Induk Mahasiswa: ");
        String nim = scanner.nextLine();
        int nomorSoal = pembagianSoal(nim, jumlahSoal); // buat method untuk pembagian soalnya
        System.out.println("Mahasiswa dengan NIM " + nim + " mendapatkan soal nomor " + nomorSoal);
    }

    public static int pembagianSoal(String nim, int jumlahSoal) {
        int tigaAngkaAkhir = Integer.parseInt(nim.substring(nim.length() - 3)); // ambil 3 angka terakhir dari NIM
        if (tigaAngkaAkhir % jumlahSoal == 0) {
            return 7;
        } else {
            int nomorSoal = tigaAngkaAkhir % jumlahSoal; // hitung nomor soal berdasarkan sisa pembagian
            return nomorSoal;
        }
    }
}
