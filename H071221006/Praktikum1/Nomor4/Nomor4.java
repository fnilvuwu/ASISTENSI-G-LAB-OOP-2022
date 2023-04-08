import java.util.Scanner;

public class Nomor4 {
    public static void main(String[] args) {
        Scanner kata = new Scanner(System.in);
        System.out.print("Masukkan judul film : ");
        String judul = kata.nextLine();
        // kata.close();
        uppercasefirstLetter(judul);

        
    }
    public static void uppercasefirstLetter(String letter) {
        String[] film = letter.split(" ");
        for (String n : film) {
            
            String lower = n.substring(1).toLowerCase();
            String upper = n.substring(0, 1).toUpperCase();
            System.out.print(upper + lower + " ");

        }
    }
}
