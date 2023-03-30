public class Jurusan {

    // Atribut
    private String nama;
    private String jurusan;
    private String peminat;
    private int rataRata;

    // Konstruktor 1
    public Jurusan(String nama, String jurusan ) {
        this.nama = nama;
        this.jurusan = jurusan;
    }

    // Konstruktor 2
    public Jurusan(String nama, String jurusan, String peminat, int rataRata) {
        this.nama = nama;
        this.jurusan = jurusan;
        this.peminat = peminat;
        this.rataRata = rataRata;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getPeminat() {
        return peminat;
    }

    public void setPeminat(String peminat) {
        this.peminat = peminat;
    }

    public int getRatarata() {
        return rataRata;
    }

    public void setRatarata(int rataRata) {
        this.rataRata = rataRata;
    }

    // Behavior 1 : Mengembalikan peringkat berdasarkan nilai
    public int nilairataRata() {
        if (rataRata >= 95) {
            return 1 ;
        } else if (rataRata >= 85) {
            return 2;
        } else if (rataRata >= 75) {
            return 3;
        } else if (rataRata >= 65) {
            return 4;
        } else {
            return 5;
        }
    }

    // Behavior 2 : Menambah peminat pada jurusan
    public void tambahPeminat(int peminatTambahan) {
        peminat += peminatTambahan;
    }

    // Menampilkan informasi siswa
    public void tampilInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Peminat : " + peminat);
        System.out.println("rataRata : " + nilairataRata() + "\n") ;
    }
}

class Main {
    public static void main(String[] args) {
        Jurusan siswa1 = new Jurusan("Izzata", "Sisfo");
        Jurusan siswa2 = new Jurusan("Salsa", "Sisfo");
        
        siswa1.setPeminat("Lulus!");
        siswa1.tampilInfo();
        siswa2.tampilInfo();

        siswa2.tambahPeminat(100);
        System.out.println("Setelah ditambah nilai pada siswa 2 : " + "\n");

        siswa2.setPeminat("Lulus!");
        siswa2.tampilInfo();
    }
}