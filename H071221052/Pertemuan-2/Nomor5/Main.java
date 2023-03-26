class Alamat {
    String jalan;
    String kota;

    public String getAlamatLengkap() {
        return jalan + ", " + kota;
    }


}

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

public class Main {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Btp BLOK AB NO 90";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "AL QADRI";
        mahasiswa.nim = "H071221052";

        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Alamat: " + mahasiswa.getAlamat().getAlamatLengkap());
    }

}

// Program di atas merupakan sebuah contoh program Java yang mendefinisikan dua
// kelas yaitu kelas Alamat dan kelas Mahasiswa. Kelas Alamat memiliki dua
// atribut yaitu jalan dan kota serta sebuah metode getAlamatLengkap() yang
// mengembalikan alamat lengkap yang terdiri dari jalan dan kota yang dipisahkan
// oleh tanda koma.

// Kelas Mahasiswa memiliki tiga atribut yaitu nama, nim, dan alamat yang
// merupakan objek dari kelas Alamat. Kelas Mahasiswa juga memiliki tiga metode
// yaitu getNama(), getNim(), dan getAlamat() yang masing-masing mengembalikan
// nilai dari atribut nama, nim, dan alamat.

// Pada bagian main(), program menginstansiasi objek Alamat dan objek Mahasiswa,
// kemudian menginisialisasi nilai-nilai atribut pada objek Mahasiswa dengan
// mengambil objek Alamat yang telah dibuat sebelumnya. Selanjutnya program
// mencetak nilai dari atribut nama, nim, dan alamat pada objek Mahasiswa dengan
// menggunakan metode getNama(), getNim(), dan getAlamat().getAlamatLengkap().

// Behaviornya adalah program akan mencetak informasi nama, NIM, dan alamat
// lengkap mahasiswa yang telah didefinisikan.