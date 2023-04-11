package Praktikum3.Nomor3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Store store = new Store("Sisfo Komputer");
        User user1 = new User("Minhajul", 6000);
        
        Product product1 = new Product("HP Pavilion Gaming 15", 2000, 15);
        Product product2 = new Product("ASUS VivoBook 15 A516MAO N4020", 4000, 4);
        Product product3 = new Product("Lenovo IdeaPad S145", 1500, 2);
        Scanner sc = new Scanner(System.in);

         // [1]
         store.addProduct(product1);
         store.addProduct(product2);
         store.addProduct(product3);
         // [1]

        boolean x = true;
        while (x == true) {
            System.out.println("-".repeat(20) + "CARD" + "-".repeat(20));
            System.out.println(user1.getName());
            System.out.println(user1.getBalance());
            System.out.println("-".repeat(44));

            System.out.println("Selamat datang di " + store.getName());
            System.out.println("Daftar produk: ");

            for (int i = 0; i < store.getProducts().size(); i++) { 
               
                System.out.println(i+1 + ". " + store.getProducts().get(i).getName() + " -" + " $" + store.getProducts().get(i).getPrice() + " | " + " store " + store.getProducts().get(i).getStock()) ;
            }
            System.out.println("0. Keluar");
            System.out.print(" > ");
            
            int a = sc.nextInt();
            if (a == 0) {
                x = false;
                System.out.println("Terima Kasih! Sampai Jumpa lagi");
   
            } else {
                System.out.println("Apakah anda yakin ingin membeli: ");
                System.out.println(store.getProducts().get(a-1).getName() + ", dengan harga $" + store.getProducts().get(a-1).getPrice());
                System.out.println("1. Konfirmasi");
                System.out.println("2. Batal");
                System.out.print(" > ");

                int b = sc.nextInt();
                if (b == 1) {
                    store.transaksi(user1, store.getProducts().get(a-1));
                    System.out.println(user1.getName() + " berhasil membeli " + store.getProducts().get(a-1).getName());
                    if (store.getProducts().get(a-1).getStock()==0) {
                        store.removeProduct(store.getProducts().get(a-1));
                    }
                    System.out.println("-".repeat(20));
                    System.out.println("Lanjutkan transaksi? ");
                    System.out.println("1. Iya");
                    System.out.println("2. Tidak");
                    System.out.print(" > ");

                    int c = sc.nextInt();
                    if (c == 1) {
                    } else {
                        // lengkapi
                        System.out.println("Terima Kasih! Sampai Jumpa lagi");
                        break;
                    }
                }
            }
        }
    }
}
