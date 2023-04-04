
import java.util.Scanner;

public class Nomor2 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        
        int angka;
        int bilanganbulat = 0;
        int bilangandesimal = 0;
        
        System.out.print(" ");
        angka = input.nextInt();
        input.nextLine();

        String inputan;
        inputan = input.nextLine();

        String[] Angka = inputan.split(" ");
        for(String i:Angka) {
            try {
                // parseInt untuk mengubah tipe data string ke integer
                int var1 = Integer.parseInt(i);
                bilanganbulat++; 
               
            } catch (Exception e) {
                // double var2 = Double.parseDouble("1.1");
                bilangandesimal++;
                // akan mendeteksi jika terdapat bilangan desimal, maka akan bertambah 1
                
            }           
        }
        System.out.println(bilanganbulat + " Bilangan bulat");
        System.out.println(bilangandesimal + " Bilangan desimal");
    }
}

