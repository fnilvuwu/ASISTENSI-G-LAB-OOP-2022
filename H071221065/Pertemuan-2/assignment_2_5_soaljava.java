class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat; 

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public Alamat getAlamat() {
        return alamat;
    }
}

class Alamat {
    String jalan;
    String kota;


    public String getAlamatLengkap() {
        return jalan + ", " + kota;
    }
}

class Main {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "politeknik";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Izzata Clarissa Salsabila";
        mahasiswa.nim =  "H071221065";
        
        System.out.println("Nama : " + mahasiswa.getNama());
        System.out.println("Nim : " + mahasiswa.getNim());
        System.out.println("Alamat : " + mahasiswa.getAlamat().getAlamatLengkap());
    }
}
