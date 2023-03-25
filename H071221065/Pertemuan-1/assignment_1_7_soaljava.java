import java.util.Scanner;

public class assignment_1_7_soaljava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String zoo = sc.nextLine();
        int kebun = findIndex(zoo);
        System.out.println(kebun);

        sc.close();
    }
    public static int findIndex(String teks) {
        String binatang[] = {"Singa", "gajah", "ayam", "bebek", "anjing"};
        for (int i = 0; i < binatang.length; i+=1) {
            if (binatang[i].equalsIgnoreCase(teks)) {
                return i ;
                
            }
        }
        return -1;
    } 
    
}