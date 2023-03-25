import java.util.Scanner;

class assigment_1_1_soaljava {
    public static void main(String[] args) {
        Scanner inputNim = new Scanner(System.in);
        int Nim;
        // int soal;
        System.out.print("Masukkan 3 angka NIM Terakhir : ");
        Nim = inputNim.nextInt();
        inputNim.close();
        if (Nim % 7 == 0){
            System.out.println("soal no 7");
        }else{
            System.out.println("Soal no " + Nim % 7);
        }
    }
}