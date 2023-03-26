public class Blue {
    public static void main(String[] args) {
        BlueLock isagi = new BlueLock("Isagi", "Melihat Masa Depan", 89, 100);
        BlueLock Bachira = new BlueLock("Bachira", "Menggiring bola dengan sangat lincah", 91, 100);
        isagi.tampilkanPower();
        Bachira.tampilkanPower();

        Bachira.upgradeSkill(5);
        isagi.upgradeSkill(5);

        Bachira.lawan(isagi);
        isagi.lawan(Bachira);

        isagi.tampilkanPowerSekarang();
        Bachira.tampilkanPowerSekarang();

    }
}
