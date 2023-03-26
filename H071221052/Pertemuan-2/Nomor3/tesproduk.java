import java.util.Scanner;

public class tesproduk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            System.out.print("Masukkan ID produk: ");
            int id = scanner.nextInt();

            scanner.nextLine(); // Mengkonsumsi karakter newline (\n)

            System.out.print("Masukkan nama produk: ");
            String name = scanner.nextLine();

            System.out.print("Masukkan stok produk: ");
            int stock = scanner.nextInt();

            System.out.print("Masukkan harga produk: ");
            double price = scanner.nextDouble();

            no3produk no3produk = new no3produk(id, name, stock, price);

            System.out.println("\nInformasi Produk:");
            System.out.println("ID Produk: " + no3produk.getId());
            System.out.println("Nama Produk: " + no3produk.getName());
            System.out.println("Stok Produk: " + no3produk.getStock());
            System.out.println("Harga Produk: " + no3produk.getPrice());

            if (!no3produk.isAvailable()) {
                System.out.println("Produk tersedia di stok.");
            } else {
                System.out.println("Produk tidak tersedia di stok.");
            }
            scanner.close();

        } catch (Exception e) {
            System.out.println("Inputan yang anda masukkan salah");

        }

    }
}

// import java.util.Scanner; - mengimport class Scanner dari package java.util
// public class tesproduk { - mendefinisikan sebuah class dengan nama tesproduk
// public static void main(String[] args) { - mendefinisikan method utama main
// yang merupakan entry point dari program.
// Scanner scanner = new Scanner(System.in); - membuat sebuah objek scanner yang
// membaca input dari System.in (konsol).
// try { - mulai blok try-catch untuk menangani exception yang mungkin terjadi
// saat eksekusi program.
// System.out.print("Masukkan ID produk: "); - mencetak string ke konsol.
// int id = scanner.nextInt(); - membaca input integer dari konsol.
// scanner.nextLine(); - membaca newline character yang tersisa dari input
// sebelumnya.
// System.out.print("Masukkan nama produk: "); - mencetak string ke konsol.
// String name = scanner.nextLine(); - membaca input string dari konsol.
// System.out.print("Masukkan stok produk: "); - mencetak string ke konsol.
// int stock = scanner.nextInt(); - membaca input integer dari konsol.
// System.out.print("Masukkan harga produk: "); - mencetak string ke konsol.
// double price = scanner.nextDouble(); - membaca input double dari konsol.
// no3produk no3produk = new no3produk(id, name, stock, price); - membuat sebuah
// objek no3produk dengan menggunakan input yang diberikan.
// System.out.println("\nInformasi Produk:"); - mencetak string ke konsol dengan
// newline character.
// System.out.println("ID Produk: " + no3produk.getId()); - mencetak string ke
// konsol dan memanggil method getId() dari objek no3produk.
// System.out.println("Nama Produk: " + no3produk.getName()); - mencetak string
// ke konsol dan memanggil method getName() dari objek no3produk.
// System.out.println("Stok Produk: " + no3produk.getStock()); - mencetak string
// ke konsol dan memanggil method getStock() dari objek no3produk.
// System.out.println("Harga Produk: " + no3produk.getPrice()); - mencetak
// string ke konsol dan memanggil method getPrice() dari objek no3produk.
// if (no3produk.isAvailable()) { - melakukan pengecekan apakah objek no3produk
// tersedia atau tidak.
// System.out.println("Produk tersedia di stok."); - mencetak string ke konsol.
// } else { - jika no3produk tidak tersedia.
// System.out.println("Produk tidak tersedia di stok."); - mencetak string ke
// konsol.
// scanner.close(); - menutup objek scanner.
// } catch (Exception e) { - menangani exception yang mungkin terjadi dan
// memasukkannya ke dalam variabel e.
// System.out.println("Inputan yang anda masukkan salah"); - mencetak string ke
// konsol.
// } - akhir blok try-catch.
