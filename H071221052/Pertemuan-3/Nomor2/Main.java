public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Mino", 30);
        Player player2 = new Player("Hilda", 35);
        player1.setDefense(15);
        player2.setDefense(10);
        player1.getDamage(player2);
        player1.status();
        player2.status();
    }
}
