package Nomor5;

class Alamat {
    String jalan;
    String kota;

    String getAlamatLengkap() {
        return jalan + ", " + kota;
    }
}

class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat;

    String getNama() {
        return nama;
    }

    String getNim() {
        return nim;
    }

    String getAlamat() {
        return alamat.jalan + ", " + alamat.kota;
    }

    String getAlamatLengkap() {
        return alamat.getAlamatLengkap();
    }
}

public class Tugas2No5 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Goa Ria";
        alamat.kota = "Makassar";
        
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Nabil";
        mahasiswa.nim = "H071221083";

        System.out.println("Nama : " + mahasiswa.getNama());
        System.out.println("NIM : " + mahasiswa.getNim());
        System.out.println("Alamat : " + mahasiswa.getAlamatLengkap());
    }
}
