import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        String nim;
        int angka, soal;

        System.out.print("NIM : ");
        nim = input.nextLine();

        angka = Integer.parseInt(nim.substring(7, 10));

        
        // soal = angka%7==0 ? 7 : angka%7; 
        if (angka%7 == 0) {
            soal = 7;
        }
        else {
            soal = angka%7;
        }

        System.out.print("Soal : "+soal);

    }
}
