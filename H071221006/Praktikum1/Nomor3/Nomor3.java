import java.util.Scanner;

public class Nomor3 {

    public static void main(String[] args) {
        // membuat inputan
        try {
            Scanner name = new Scanner(System.in);
            System.out.print("Nama : ");
            String nama = name.next();
            
            System.out.print("Umur : ");
            int umur = name.nextInt();
            // name.nextLine();

            System.out.print("Hobby : ");
            String Hobi = name.next();

            System.out.print("Nama saya "+ nama + " , "+ umur + " tahun, Hobby " + Hobi);
        
        }
        catch (Exception e) {
            System.out.print("Inputan umur harus angka");
        }
}

}

