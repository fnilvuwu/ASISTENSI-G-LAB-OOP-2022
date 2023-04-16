import java.util.Scanner;

public class Nomor6 {
    public static void main(String [] args) {
        try {
            Scanner input = new Scanner(System.in);

            double r1, r2;
            double luas;

            System.out.println("\t <<< Menghitung Luas Lingkaran >>> \n");

            System.out.print(" Input jari-jari 1 : ");
            r1 = input.nextDouble();

            System.out.print(" Input jari-jari 2 : ");
            r2 = input.nextDouble();
            // bisa menerima integer tapi datanya terkonversi
            luas = Math.PI * r1 * r2;

            System.out.printf("\n Luas lingkaran adalah : %.2f",luas);
        } catch (Exception e) {
            System.out.print("Input harus berupa angka");
            // TODO: handle exception
        }
        
    }
}
