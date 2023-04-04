
public class Main {
    public static void main(String[] args) {
        Parfum FO = new Parfum();

        FO.merk = "Fakhrul Oud";
        FO.aroma = "Oriental floral";
        FO.volume = 50;

        FO.menyemprot(5);
        System.out.print(FO.volume);

    }
}
