import java.util.InputMismatchException;
import java.util.Scanner;

public class assignment_1_6_soaljava {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        // inp.close();
        try {
            System.out.print("Masukkan jari-jari lingkaran: ");
            double jariJari = inp.nextDouble();
            inp.close();
   
            double luasLingkaran = Math.PI * Math.pow(jariJari, 2);
            System.out.printf("Luas lingkaran adalah: %.2f", luasLingkaran);
         } 
        catch (InputMismatchException e) {
            System.out.println("Hanya menerima angka");
         }
    }
    
}