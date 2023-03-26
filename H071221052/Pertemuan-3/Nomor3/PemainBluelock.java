public class PemainBluelock {

        String name, skill;
        int JumlahPemain;
        int AttackPower;
        int hargaPemain;
        //variabel
    
        public PemainBluelock(String name, int hargaPemain, int AttackPower) { //konstruktor untuk objek dari kelas pemain bluelock
            this.name = name;
            this.hargaPemain = hargaPemain;
            this.JumlahPemain = 1; //nilai awal 1 yang diterima konstruktor
            this.AttackPower = AttackPower;
        
        }
    
        public String getName() { //mengembalikan nilai variabel name
            return name;
        }
    
        public int getJumlahPemain() { //mengembalika nilai dari variabel jumlah pemain
            return JumlahPemain;
        }
    
        // public void setAttackPower(int AttackPower) { //methode untuk mengset attackpower
        //     this.AttackPower = AttackPower;
        // }
    
        public int getHargaPemain() {
            return hargaPemain; //mengembalikan nilai dari variabel jumlah pemain
        }
    
        public int getAttackPower() {
            return AttackPower;
        }
        
        public void reduceJumlahPemain(StoreBluelock nama) {
            this.JumlahPemain--; //operator unarydecrerement Operator unary decrement adalah operator yang digunakan untuk mengurangi nilai sebuah variabel integer atau bilangan pecahan (float, double) sebanyak 1. Operator ini direpresentasikan dengan tanda "--" yang ditempatkan sebelum variabel yang ingin dikurangi nilainya. Contohnya, jika kita memiliki variabel "x" dengan nilai 5, maka "x--" akan mengurangi nilai variabel "x" menjadi 4.
        }
        
    }

