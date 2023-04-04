public class Main {

    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "BTN Pao-Pao Permai";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Minhajul Yusri Khairi";
        mahasiswa.nim = "H071221006";

        System.out.println("Nama : " + mahasiswa.getNama());
        System.out.println("NIM : " + mahasiswa.getNim());
        System.out.println("Alamat : " + mahasiswa.getAlamat().getAlamatLengkap());
    }

   
}


  

