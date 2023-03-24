// package 4. Asistensi .Asistensi 3.Nomor1;
public class Tugas3No1 {
    public static void main(String[] args) {
        RagnarokOnline player1 = new RagnarokOnline("Player1", 1, 100, 50, 10, 10, 10, 10, 10, 10, "Swordsman");
        RagnarokOnline player2 = new RagnarokOnline("Player2", 1, 100, 50, 10, 10, 10, 10, 10, 10, "Mage");
        
        System.out.println("== Before Level Up ==");
        player1.displayStats();
        player2.displayStats();

        player1.levelUp();
        player2.levelUp();

        System.out.println("\n== After Level Up ==");
        player1.displayStats();
        player2.displayStats();
    }
}
