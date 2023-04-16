public class Cod {
    String name, senjata;
    double attackPower, uang;
    int jumlahMenang;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSenjata() {
        return senjata;
    }

    public void setSenjata(String senjata) {
        this.senjata = senjata;
    }

    public double getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(double attackPower) {
        this.attackPower = attackPower;
    }

    public double getUang() {
        return uang;
    }

    public void setUang(double uang) {
        this.uang = uang;
    }

    public int getJumlahMenang() {
        return jumlahMenang;
    }
    public void setJumlahMenang(int jumlahMenang) {
        this.jumlahMenang = jumlahMenang;
    }

    public Cod() {
    }

    // Deklarasi konstruktor Cod dengan empat parameter.
    public Cod(String name, String senjata, double attackPower, double uang, int jumlahMenang) {
        // Set nilai variabel nama dengan nilai parameter nama,senjata,attackPower,uang, jumlahmenang.
        this.name = name;
        this.senjata = senjata;
        this.attackPower = attackPower;
        this.uang = uang;
        this.jumlahMenang = 0;
    }

    // deklarasi method tampilkanKarakter
    public void tampilkanKarakter() {
        System.out.println("\n\n========== Spesifikasi ==========");
        System.out.println("Nama          : " + this.getName());
        System.out.println("Senjata     : " + this.getSenjata());
        System.out.println("AttackPower     : " + this.getAttackPower());
        System.out.println("Uang : " + this.getUang());
        System.out.println("Jumlah Menang : " + this.getJumlahMenang());
    }

    public void upgradeSenjata(int SenjataBaru) {
        if (SenjataBaru > this.uang) {
            System.out.println("Tidak bisa upgrade senjata, uang tidak cukup!");
        } else {
            int tambahAttackPower = SenjataBaru / 30000;

            this.setAttackPower(this.getAttackPower() + tambahAttackPower);
            this.setUang(this.getUang() - SenjataBaru + (SenjataBaru % 30000));

            System.out.printf("Menambahkan AttackPower ke %s sebesar %d\n", this.getName(), tambahAttackPower);
        }
    }

    public void enemy(Cod enemy) {
        if (this.getAttackPower() > enemy.getAttackPower()) {
            this.setJumlahMenang(this.getJumlahMenang() + 1);
            this.setUang(this.getUang() + 20000);

            System.out.printf("\n%s Menang! Jumlah kemenangan dari %s mencapai %d kemenangan. \n",this.getName(), this.getName(), this.getJumlahMenang());
        } else if (this.getAttackPower() == enemy.getAttackPower()) {
            System.out.printf("\n%s dengan %s sama-sama kuat! Pertandingan berakhir seri.\n", this.getName(), enemy.getName());
        } else {
            enemy.setJumlahMenang(enemy.getJumlahMenang() + 1);
            enemy.setUang(enemy.getUang() + 30000);

            System.out.printf("%s Menang! Jumlah kemenangan dari %s mencapai %d kemenangan.", enemy.getName(), enemy.getName(), enemy.getJumlahMenang());
        }
    }
}
