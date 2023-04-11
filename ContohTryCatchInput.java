import java.util.Scanner;

public class ContohTryCatchInput {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                int umur = sc.nextInt();
                System.out.println("Umur adalah " + umur);
                break;
            } catch (Exception e) {
                System.out.println("Data type salah!");
                continue;
            }
        }
    }
}
