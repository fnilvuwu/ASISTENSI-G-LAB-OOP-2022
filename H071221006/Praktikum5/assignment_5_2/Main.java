package Praktikum5.assignment_5_2;

public class Main {
    public static void main(String[] args) {
        PengurusInti pengurus = new PengurusInti("Minhajul Yusri Khairi", 18, "MIPA", "Sistem Informasi", "Wakil Ketua");
        System.out.println("-".repeat(15) + "PENGURUS INTI" + "-".repeat(15));
        System.out.println("\nNama : " + pengurus.getNama());
        System.out.println("Umur : " + pengurus.getUmur());
        System.out.println("Fakultas : " + pengurus.getFakultas());
        System.out.println("Jurusan : " + pengurus.getJurusan());
        System.out.println("Jabatan : " + pengurus.getJabatan());
        
        KoordinatorBidangStaff koordinator = new KoordinatorBidangStaff("Minke", 20, "Teknik", "Teknik Informatika", "Humas");
        System.out.println("-".repeat(15) + "KOORDINATOR BIDANG DAN STAF" + "-".repeat(15));
        System.out.println("\nNama : " + koordinator.getNama());
        System.out.println("Umur : " + koordinator.getUmur());
        System.out.println("Fakultas : " + koordinator.getFakultas());
        System.out.println("Jurusan : " + koordinator.getJurusan());
        System.out.println("Bidang : " + koordinator.getBidang());
    }

}
