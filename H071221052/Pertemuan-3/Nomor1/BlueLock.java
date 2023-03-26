// package DLL.BlueLock;
public class BlueLock {
    String nama, skill;
    int attackPower, health;
    int jumlahMenang;

    

    public BlueLock(String nama, String skill, int attackPower, int health) {
        this.nama = nama;
        this.skill = skill;
        this.attackPower = attackPower;
        this.health = health;
        this.jumlahMenang = 0;
    }

    public void tampilkanPower() {
        System.out.println("\n========== Power Pemain ==========");
        System.out.println("Nama          : " + this.getNama());
        System.out.println("Skill yang dimilikinya " + this.getSkill());
        System.out.println("AttackPower     : " + this.getAttackPower());
        System.out.println("Jumlah Menang : " + this.getJumlahMenang());
        System.out.println("Health : " + this.gethealth());
    }

    // public class BlueLock { - Deklarasi kelas BlueLock.
    // String nama, skill; - Deklarasi variabel nama dan skill dengan tipe data
    // String.
    // int attackPower, health; - Deklarasi variabel attackPower dan health dengan
    // tipe data integer.
    // int jumlahMenang; - Deklarasi variabel jumlahMenang dengan tipe data integer.
    // public BlueLock() { - Deklarasi konstruktor BlueLock tanpa parameter.
    // } - Tutup kurung dari konstruktor BlueLock tanpa parameter.
    // public BlueLock(String nama, String skill, int attackPower, int health) { -
    // Deklarasi konstruktor BlueLock dengan empat parameter.
    // this.nama = nama; - Set nilai variabel nama dengan nilai parameter nama.
    // this.skill = skill; - Set nilai variabel skill dengan nilai parameter skill.
    // this.attackPower = attackPower; - Set nilai variabel attackPower dengan nilai
    // parameter attackPower.
    // this.health = health; - Set nilai variabel health dengan nilai parameter
    // health.
    // this.jumlahMenang = 0; - Set nilai variabel jumlahMenang dengan nilai 0.
    // } - Tutup kurung dari konstruktor BlueLock dengan empat parameter.
    // public void tampilkanPower() { - Deklarasi method tampilkanPower tanpa
    // parameter dengan tipe kembalian void.
    // System.out.println("\n========== Power Pemain =========="); - Mencetak string
    // "\n========== Power Pemain ==========" ke layar.
    // System.out.println("Nama : " + this.getNama()); - Mencetak string "Nama : "
    // diikuti dengan nilai variabel nama dari objek saat ini ke layar.
    // System.out.println("Skill yang dimilikinya " + this.getSkill()); - Mencetak
    // string "Skill yang dimilikinya " diikuti dengan nilai variabel skill dari
    // objek saat ini ke layar.
    // System.out.println("AttackPower : " + this.getAttackPower()); - Mencetak
    // string "AttackPower : " diikuti dengan nilai variabel attackPower dari objek
    // saat ini ke layar.
    // System.out.println("Jumlah Menang : " + this.getJumlahMenang()); - Mencetak
    // string "Jumlah Menang : " diikuti dengan nilai variabel jumlahMenang dari
    // objek saat ini ke layar.
    // System.out.println("Health : " + this.gethealth()); - Mencetak string "Health
    // : " diikuti dengan nilai variabel health dari objek saat ini ke layar.

    public void upgradeSkill(int BolaGoal) { // Mendefinisikan sebuah method bernama upgradeSkill dengan tipe parameter
                                             // int BolaGoal.
        if (BolaGoal > this.health) { // cek apakah gol lebih besar dari health
            System.out.println("Tidak bisa upgrade health");
        } else {
            // Setiap 5 gol attackPower bertambah 1
            int tambahAttackPower = BolaGoal / 5; // jika gol lebih kecil maka mnmbhkn nilai untuk attck power dengan
                                                  // syarat /5

            this.setAttackPower(this.getAttackPower() + tambahAttackPower);
            this.sethealth(this.gethealth() + BolaGoal + (BolaGoal % 5)); // Kondisi health jika sudah upgrade skill

            System.out.printf("\nMenambahkan attackPower ke %s sebesar %d..\n", this.getNama(), tambahAttackPower);
        } // format print %s itu string %d itu integer
    }

    public void lawan(BlueLock lawan) {
        if (this.getAttackPower() > lawan.getAttackPower()) {
            this.setJumlahMenang(this.getJumlahMenang() + 1); // jika menang lawan akan tambah 1 jmlh mnang
            this.sethealth(this.gethealth() + 5); // kondisi health setelah menang

            System.out.printf("\n%s Menang! Jumlah Kemenangan dari %s mencapai %d kemenangan..\n", this.getNama(), this.getNama(),this.getJumlahMenang()); // format print jika menang
        } else if (this.getAttackPower() == lawan.getAttackPower()) {
            System.out.printf("\n%s dengan %s sama-sama kuat! Pertandingan berakhir seri..\n", this.getNama(),
                    lawan.getNama()); // format print jika seri
        } else {
            lawan.setJumlahMenang(lawan.getJumlahMenang());
            lawan.sethealth(lawan.gethealth() + 5); // lawan menang + 5 lagi healthnya
        }

    }

    public void sethealth(int health) {
        this.health = health;
    }

    public void setJumlahMenang(int jumlahMenang) {
        this.jumlahMenang = jumlahMenang;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int gethealth() {
        return health;
    }

    public int getJumlahMenang() {
        return jumlahMenang;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public String getNama() {
        return nama;
    }

    public String getSkill() {
        return skill;
    }

    public void tampilkanPowerSekarang() {
        System.out.println("\n========== Power Pemain Setelah adu mekanik ==========");
        System.out.println("Nama          : " + this.getNama());
        System.out.println("Skill yang dimilikinya " + this.getSkill());
        System.out.println("AttackPower     : " + this.getAttackPower());
        System.out.println("Jumlah Menang : " + this.getJumlahMenang());
        System.out.println("Health : " + this.gethealth());
    }

}

// public void sethealth(int health) {: Membuat method sethealth yang memiliki
// parameter health bertipe int.
// this.health = health;: Mengassign nilai dari parameter health ke atribut
// health milik objek yang memanggil method ini.
// public void setJumlahMenang(int jumlahMenang) {: Membuat method
// setJumlahMenang yang memiliki parameter jumlahMenang bertipe int.
// this.jumlahMenang = jumlahMenang;: Mengassign nilai dari parameter
// jumlahMenang ke atribut jumlahMenang milik objek yang memanggil method ini.
// public void setAttackPower(int attackPower) {: Membuat method setAttackPower
// yang memiliki parameter attackPower bertipe int.
// this.attackPower = attackPower;: Mengassign nilai dari parameter attackPower
// ke atribut attackPower milik objek yang memanggil method ini.
// public void setNama(String nama) {: Membuat method setNama yang memiliki
// parameter nama bertipe String.
// this.nama = nama;: Mengassign nilai dari parameter nama ke atribut nama milik
// objek yang memanggil method ini.
// public void setSkill(String Skill) {: Membuat method setSkill yang memiliki
// parameter Skill bertipe String.
// this.skill = skill;: Mengassign nilai dari parameter Skill ke atribut skill
// milik objek yang memanggil method ini.
// public int gethealth() {: Membuat method gethealth yang mengembalikan nilai
// bertipe int.
// return health;: Mengembalikan nilai dari atribut health milik objek yang
// memanggil method ini.
// public int getJumlahMenang() {: Membuat method getJumlahMenang yang
// mengembalikan nilai bertipe int.
// return jumlahMenang;: Mengembalikan nilai dari atribut jumlahMenang milik
// objek yang memanggil method ini.
// public int getAttackPower() {: Membuat method getAttackPower yang
// mengembalikan nilai bertipe int.
// return attackPower;: Mengembalikan nilai dari atribut attackPower milik objek
// yang memanggil method ini.
// public String getNama() {: Membuat method getNama yang mengembalikan nilai
// bertipe String.
// return nama;: Mengembalikan nilai dari atribut nama milik objek yang
// memanggil method ini.
// public String getSkill() {: Membuat method getSkill yang mengembalikan nilai
// bertipe String.
// return skill;: Mengembalikan nilai dari atribut skill milik objek yang
// memanggil method ini.
// public void tampilkanPowerSekarang() {: Membuat method
// tampilkanPowerSekarang.
// System.out.println("\n========== Power Pemain Setelah adu mekanik
// ==========");: Menampilkan teks "========== Power Pemain Setelah adu mekanik
// ==========" di konsol.
// System.out.println("Nama : " + this.getNama());: Menampilkan nama objek yang
// memanggil method ini di konsol.
