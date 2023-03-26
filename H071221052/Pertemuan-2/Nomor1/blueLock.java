public class blueLock {
    String name;
    int umur;
    String striker;
    int tinggiBadan;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setUmur(int umur) {
        this.umur = umur;
    }

    int getUmur() {
        return umur;
    }

    // void getStriker() {
    // this.striker = striker;
    // }

    // String posisi() {
    // return striker;
    // }

    void settinggiBadan(int tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
    }

    double gettinggiBadan() {
        return tinggiBadan;
    }

    void lari() {
        System.out.println("Pemain Bola bernama " + name + " dengan tinggi badan " + tinggiBadan + " sedang berlari");
    }

    void menggiringBola() {
        System.out.println("Pemain Bola bernama " + name + " dengan umur " + umur + " sedang menggiring bola");
    }
}

// Program tersebut merupakan program Java yang mendefinisikan sebuah kelas
// blueLock dengan empat variabel anggota (name, umur, striker, dan tinggiBadan)
// dan beberapa metode.
// Variabel name memiliki tipe data String dan berisi nama dari pemain sepak
// bola. Variabel umur memiliki tipe data int dan berisi umur dari pemain.
// Variabel striker memiliki tipe data String dan berisi posisi dari pemain.
// Variabel tinggiBadan memiliki tipe data int dan berisi tinggi badan dari
// pemain.
// Metode setName() dan getName() digunakan untuk mengatur dan mengambil nama
// dari pemain. Metode setUmur() dan getUmur() digunakan untuk mengatur dan
// mengambil umur dari pemain. Metode settinggiBadan() dan gettinggiBadan()
// digunakan untuk mengatur dan mengambil tinggi badan dari pemain.
// Metode lari() digunakan untuk mencetak pesan bahwa pemain yang bernama name
// sedang berlari. Metode menggiringBola() digunakan untuk mencetak pesan bahwa
// pemain yang bernama name sedang menggiring bola.
// Terdapat dua metode yang di-comment-out yaitu getStriker() dan posisi() yang
// tidak digunakan dalam kelas tersebut.
