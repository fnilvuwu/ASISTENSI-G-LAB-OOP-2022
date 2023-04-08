
import java.util.Scanner;

public class Cakaran {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int n;

        int bilanganbulat = 0;
        int bilangandesimal = 0;
        
        System.out.print("Masukkan bilangan : ");
        n = input.nextInt();
        // String[] Angka = inputan.split(" ");
        for(int i = 1; i <= n; i++) {
            // try {
               
                System.out.printf("Input bilangan ke-%d", i);
                double angka = input.nextDouble();
                
                if (angka % 1 == 0) {
                    bilanganbulat++;
                } else {
                    bilangandesimal++;
                }
            }

            System.out.print("Bilangan desimal ", bilangandesimal);
            System.out.print("Bilangan bulat ", bilanganbulat);

        }

        
    }

