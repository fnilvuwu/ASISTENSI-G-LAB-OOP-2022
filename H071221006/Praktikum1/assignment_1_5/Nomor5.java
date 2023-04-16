import java.util.Scanner;

public class Nomor5 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String tanggal;
        String Tanggal,bulan,tahun;
        int tgl;
        int bln;
        int thn;

        System.out.println(" ");
        tanggal = input.next();

        Tanggal = tanggal.substring(0,2);
        bulan = tanggal.substring(3, 5);
        tahun = tanggal.substring(6, 8);

        tgl = Integer.parseInt(Tanggal);
        bln = Integer.parseInt(bulan);
        thn = Integer.parseInt(tahun);

        if (bln == 1) {
            bulan = " Januari ";
        } else if (bln == 2) {
            bulan = " Februari ";
        } else if (bln == 3) {
            bulan = " Maret ";
        } else if (bln == 4) {
            bulan = " April ";
        } else if (bln == 5) {
            bulan = " Mei ";
        } else if (bln == 6) {
            bulan = " Juni ";
        } else if (bln == 7) {
            bulan = " Juli ";
        } else if (bln == 8) {
            bulan = " Agustus ";
        } else if (bln == 9) {
            bulan = " September ";
        } else if (bln == 10) {
            bulan = " Oktober ";
        } else if (bln == 11) {
            bulan = " November ";
        } else if (bln == 12) {
            bulan = " Desember ";
        } 
        
        if (thn > 23) {
            tahun = "19" + tahun;
        } else {
            tahun = "20" + tahun;
        }
    
    System.out.print(tgl +  bulan +  tahun);
        
    }
}
