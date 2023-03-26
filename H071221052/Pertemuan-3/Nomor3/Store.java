
import java.util.ArrayList;
import java.util.Scanner;

public class Store { //memanfaatkan kelas yg sdh dibuat yaitu user,pemain dan storebluelock
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        

        User user = new User("AL QADRI", 50000); // add User

        ArrayList<PemainBluelock> pemain = new ArrayList<>(); // Menambahkan pemain untuk BlueLock, Pemain disimpan
                                                              // dalam ArrayList dengan type PemainBuelock.
        pemain.add(new PemainBluelock("YOICHI ISAGI", 18500, 94));
        pemain.add(new PemainBluelock("MEGURU BACHIRA", 18000, 93));
        pemain.add(new PemainBluelock("HYOMA CHIGIRI", 10000, 90));

        StoreBluelock BlueLock = new StoreBluelock("BLUE LOCK STORE", pemain); // Instance class StoreBlueock
        BlueLock.addPemainBuelock(new PemainBluelock("RIN ITOSHI", 25000, 97)); //menambhkn pemain dengan metode tsb

        while (true) { // Loop 1

            user.card(); // Menampilkan data User
            BlueLock.listPemainBuelock(); // Menampilkan list PemainBuelock
            System.out.print("> ");
            int pilihan1 = inp.nextInt(); //membaca inputan dengan tipedata integer

            if (pilihan1 > BlueLock.getPemainBuelock().size()) { //  mengembalikan jumlah elemen (pemain) dalam ArrayList pemainBuelock dari objek BlueLock. Opsi yang diinput melebihi jumlah pemain
                System.out.println("-".repeat(40));
                System.out.println("Tidak ada dalam pilihan!");

            } else if (1 <= pilihan1 && pilihan1 <= pemain.size()) { // kondisional else if, yang memeriksa apakah nilai variabel pilihan1 antara 1 dan ukuran ArrayList pemain Opsi yang diinput pas dengan jumlah pemain
                System.out.println("-".repeat(40)); // garis
                System.out.println("Apakah anda yakin ingin membeli Pemain ini?:");
                System.out.printf("%s, dengan Harga $%d?%n", BlueLock.getPemainBuelock().get(pilihan1 - 1).getName(),BlueLock.getPemainBuelock().get(pilihan1 - 1).getHargaPemain()); //BlueLock.getPemainBuelock() adalah metode yang mengambil ArrayList pemainBuelock dari objek BlueLock.
               // get(pilihan1 - 1) digunakan untuk mengambil objek Pemain dari ArrayList pemainBuelock pada indeks yang sesuai dengan nomor pilihan yang dimasukkan oleh pengguna (variabel pilihan1).
                //getName() adalah metode yang mengembalikan nama pemain dari objek Pemain yang dipilih, sedangkan getHargaPemain() adalah metode yang mengembalikan harga pemain dari objek Pemain.
                
                System.out.println("-".repeat(40));

                while (true) { // Loop 2

                    System.out.printf("1. Konfirmasi%n2. Batal%n");
                    System.out.print("> ");
                    int konfirmasi = inp.nextInt();

                    if (konfirmasi == 1 && user.getBalance() >= BlueLock.getPemainBuelock().get(pilihan1 - 1).getHargaPemain()) { // inputan 1 dan jumlah balance user cukup untuk membeli pemain
                                                                                                                    
                        BlueLock.getPemainBuelock().get(pilihan1 - 1).reduceJumlahPemain(BlueLock); // Mengurangi jumlah stok dan pengecekan jika stok = 0, maka pemain akan di-remove dari list pemain bluelock
                                                                                                     
                        user.setBalance(BlueLock.getPemainBuelock().get(pilihan1 - 1).getHargaPemain()); // Menyesuaikan balance dari user setelah transaksi berhasil
                                                                                                          

                        System.out.printf("%s berhasil membeli %s.%n", user.getName(),
                                BlueLock.getPemainBuelock().get(pilihan1 - 1).getName());

                        System.out.println("-".repeat(40));
                        System.out.printf("Lanjutkan Transaksi%n1. Iya%n2. Tidak%n");
                        System.out.print("> ");
                        int pilihan2 = inp.nextInt();

                        if (pilihan2 == 1) { // Break Loop 2
                            break;


                        } else {

                            System.out.println("Terima Kasih Telah Berkunjung");
                            System.exit(0); // Menghentikan seluruh Loop / return 0
                        }

                    } else if (konfirmasi == 2) { // Opsi batalkan transaksi (Break Loop 2)
                        break;

                    } else {
                        System.out.println("-".repeat(40));
                        System.out.printf("Informasi : Balance Anda = $%d | harga Pemain = $%d | %s%n",
                                user.getBalance(), BlueLock.getPemainBuelock().get(pilihan1 - 1).getHargaPemain(),
                                (user.getBalance() < BlueLock.getPemainBuelock().get(pilihan1 - 1).getHargaPemain())
                                        ? "Silahkan Batalkan pesanan, Uang anda tidak cukup"
                                        : "Masukkan Perintah Dengan Benar!");
                    }
                }

            } else {
                System.out.println("Terima Kasih Telah Berkunjung");
                break;
            }

        }

        inp.close();
    }
}

