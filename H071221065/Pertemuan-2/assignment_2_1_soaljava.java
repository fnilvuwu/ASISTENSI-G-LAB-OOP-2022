public class assignment_2_1_soaljava {
    // Atribut (status sebuah objek)
    String nama;
    String genre;
    int jumlahSingel;
    double hargaTiket;

    // Behavior (tingkah laku dari objek)
    void infoPenyanyi() {
        System.out.println("Nama penyanyi: " + nama);
        System.out.println("Genre musik: " + genre);
        System.out.println("Jumlah album: " + jumlahSingel);
        System.out.println("Harga tiket konser: " + hargaTiket);
    }

    void setHargaTiketKonser(double hargaTiketBaru) {
        hargaTiket = hargaTiketBaru;
        System.out.println("Harga tiket konser telah diubah menjadi: " + hargaTiket);
    }
    public static void main(String[] args) {

        // Membuat objek dari kelas Penyanyi
        assignment_2_1_soaljava penyanyi1 = new assignment_2_1_soaljava();

        // Mengisi nilai atribut
        penyanyi1.nama = "Tiara Andini";
        penyanyi1.genre = "Pop";
        penyanyi1.jumlahSingel = 9;
        // penyanyi1.hargaTiket = 300.000;

        // Memanggil behavior
        penyanyi1.infoPenyanyi();

        // Mengubah nilai atribut harga tiket
        penyanyi1.setHargaTiketKonser(350.000);

        // Memanggil behavior setelah popularitas diubah
        penyanyi1.infoPenyanyi();
    }
}