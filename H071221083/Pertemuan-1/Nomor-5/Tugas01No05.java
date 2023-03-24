// Tugas 01, Nomor 05


import java.util.Scanner; //import scanner untuk input

public class Tugas01No05 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //deklarasi scannar
        System.out.print("Masukkan tanggal (DD-MM-YY): "); //tempat untuk input tanggal
        String date = input.nextLine(); // menepatkan inputan ke variabel date
        
        System.out.println(convertString(date)); // printout date (string) yang bakal displit
    }
    
    public static String convertString(String input) {
        String[] parts = input.split("-"); // printoutan tadi dibagi tiga (hari, bulan, tahun) dengan split -
        int day = Integer.parseInt(parts[0]); // mengubah string pertama menjadi integer dalam variabel day
        int month = Integer.parseInt(parts[1]); // mengubah string kedua menjadi integer dalam variabel month
        String year = parts[2]; // mengubah string ketiga menjadi integer dalam variabel year
        
        String[] monthNames = {"", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"}; // array bulan
        String output = day + " " + monthNames[month] + " 20" + year;  // format print out nya
        
        return output; // mengembalikan variabel output
    }
}
