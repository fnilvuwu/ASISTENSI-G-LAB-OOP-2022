package Praktikum4;


import java.util.ArrayList;
import java.util.Scanner;
import Praktikum4.models.Profile;
import Praktikum4.models.User;
import Praktikum4.utils.StringUtils;

public class Main1 {
    private static ArrayList<User> listUser = new ArrayList<>();
    private static ArrayList<Profile> listUserProfile = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Memanggil method runApp();
        runApp();
    }

    private static void runApp() {
        // Menu Utama Aplikasi
        System.out.println("-------------------------");
        System.out.println("Aplikasi Login Sederhana");
        System.out.println("-------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("> ");

        // Menginput pilihan menu
        int selectMenu = sc.nextInt();
        sc.nextLine();
        switch (selectMenu) {
            case 1:
                // Membuka Halaman Login
                showLoginMenu();
                break;
            case 2:
                // Membuka Halaman Register
                showRegisterMenu();
            default:
                // Mengulang Pemanggilan Menu Utama
                runApp();
        }
    }

    private static void showLoginMenu() {
        // Halaman Login
        System.out.println("-------------------------");
        System.out.println("Login");
        // Menginput Username dan Menyimpannya di attribute username;
        System.out.println("Masukkan Username");
        System.out.print("> ");

        String username = sc.next();
        // Membuat variabel userIndex yang mana nanti akan menampung index dari user
        int userIndex = -1;
        for (int i = 0; i < listUser.size(); i++) {
            // Mengecek apakah user index ke i dari listUser memiliki username yang sama
            // dengan username yang
            // diinput.
            // Jika ada ganti userIndex dengan Index dari User Tersebut, kemudian hentikan
            // perulangan
            if (listUser.get(i).getUsername().equals(username)) {
                userIndex = i;
                break;
            }
        }
        // Saat userIndex tidak sama dengan -1 atau userIndexnya ditemukan
        if (userIndex != -1) {
            // Menginput Password
            System.out.println("Password");
            System.out.print("> ");
            String password = sc.next();

            
            // Mengecek apakah password dari User yang login berdasarkan username
            // sama dengan password yang diinput sebelumnya, kemudian simpan
            // hasilnya di variabel isPasswordMatch
            boolean isPasswordMatch = listUser.get(userIndex).getPassword().equals(password);
            // Jika passwordnya sama maka berhasil login
            if (isPasswordMatch) {
                System.out.println("Berhasil Login");
                // panggil method showDetailUser dan kirimkan data Profile User yang login               
                Main.showDetailUser(listUserProfile.get(userIndex));
                
                showDetailUser(listUserProfile.get(userIndex));
                System.exit(0);
            } else {
                // saat password salah akan menampikan password salah
                System.out.println("Password Salah");
            }
        }
    }

    private static void showRegisterMenu() {
        System.out.println("-------------------------");
        System.out.println("REGISTER");

        // Menginput username dan password
        System.out.println("Username");
        System.out.print("> ");
        String username = sc.nextLine();
        System.out.println("Password");
        System.out.print("> ");
        String password = sc.nextLine();
        
        // Buatlah atau Instance objek User baru, dan tambahkan
        // username dan password yang diinput sebelumnya secara langsung
        // saat instance User
        User register = new User(username, password);
        // Buatlah atau Instance objek Profile baru
        Profile profil = new Profile(password, username, 0, password);

        // Menginput Data Profile
        System.out.println("Nama Lengkap");
        System.out.print("> ");
        String fullName = sc.nextLine();
        System.out.println("Umur");
        System.out.print("> ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Hobby");
        System.out.print("> ");
        String hobby = sc.nextLine();

        // Berikan nilai fullName, age, dan hobby ke objek profile yang telah
        // di Instance sebelumnya. Nilai ini diperoleh dari data profile yang
        // diinput sebelumnya
        profil.setFullname(fullName);
        profil.setAge(age);
        profil.setHobby(hobby);

        // Berikan nilai nickName ke objek profile,
        // Nilai ini diperoleh menggunakan static method yang dibuat di class
        // StringUtils, dengan mengirimkan fullName yang diinput sebelumnya
        profil.setNickName(StringUtils.getNickName(fullName));
    
        // Menambahkan user yang dibuat ke list user
        listUser.add(User);
        // Menambahkan profile user yang dibuat ke list profile
        listUserProfile.add(profil);
        System.out.println("-------------------------");
        System.out.println("Berhasil Membuat User Baru!!");
        runApp();
    }

    private static void showDetailUser(Profile profile) {
        // Tampilkan semua data profile user yang login
        System.out.println("-".repeat(20));
        System.out.println("SELAMAT DATANG!!");
        System.out.println("-".repeat(20));
        System.out.println("Nama lengkap     : " + profile.getFullname());
        System.out.println("Nama panggilan   : " + profile.getNickName());
        System.out.println("Umur             : " + profile.getAge());
        System.out.println("Hobby            : " + profile.getHobby());
        System.out.println("-".repeat(20));
    }
}

