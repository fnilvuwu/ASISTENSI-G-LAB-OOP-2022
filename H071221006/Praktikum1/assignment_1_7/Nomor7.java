import java.util.Scanner;

public class Nomor7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String club = input.nextLine().toLowerCase();


        String[] klub = {"madrid", "psg", "bayern"};
        findindeks(klub, club);

    }
    static void findindeks(String[] list, String str) {
        // proses pencarian dilakukan
        int var = -1;
        
        for(int i = 0; i < list.length; i++) {
            if(list[i].equals(str)) {
                // equals untuk mengecek dua string
                var = i;
                break;
            } 

        }
        System.out.print(var);
    }
}

