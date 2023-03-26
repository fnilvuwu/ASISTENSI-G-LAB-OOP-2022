
import java.util.ArrayList;

public class StoreBluelock {
    String name;
    
    ArrayList<PemainBluelock>PemainBuelock;


    public StoreBluelock(String name, ArrayList<PemainBluelock> PemainBuelock) {
        this.name = name;
        this.PemainBuelock = PemainBuelock;
    }

    public String getName() {
        return name;
    }
    

    public ArrayList<PemainBluelock> getPemainBuelock() {
        return PemainBuelock;
    }

    public void listPemainBuelock() {
        int i = 1;
        System.out.printf("Selamat datang di %s%nDaftar Pemain:%n", this.getName());
        for (PemainBluelock pemain : this.PemainBuelock) {
            System.out.printf("%d. %s - $%d | Jumlah Pemain %d | Attack Power %d%n", i, pemain.getName(), pemain.getHargaPemain(), pemain.getJumlahPemain(), pemain.getAttackPower());
            i++;
        }
        System.out.println("0. Keluar");
    }
    public void addPemainBuelock(PemainBluelock PemainBuelock){
        this.PemainBuelock.add(PemainBuelock); //untuk menambahkan sebuah objek atau instance dari kelas "PemainBuelock" ke dalam sebuah struktur data yang mungkin disebut sebagai koleksi, seperti daftar (list), array, atau set.
    }
}

