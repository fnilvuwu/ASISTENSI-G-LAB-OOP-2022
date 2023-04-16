public class CodM {
    public static void main(String[] args) {
        Cod ghost = new Cod("Ghost", "M4", 25, 15000, 2);
        Cod captPrice = new Cod("Capt.Price", "AK-47", 30, 20000, 2);

        ghost.tampilkanKarakter();
        captPrice.tampilkanKarakter();

        captPrice.upgradeSenjata(50000);
        captPrice.tampilkanKarakter();

        captPrice.enemy(ghost);
        ghost.enemy(captPrice);

        captPrice.tampilkanKarakter();


    }
}
