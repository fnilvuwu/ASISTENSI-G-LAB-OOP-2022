class Player {
    private String name;
    private int hp;
    private int attackPower;
    private int defense;

    public Player(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        this.defense = 10;
    }

    public void getDamage(Player enemy) {
        int damage = Math.abs(enemy.getAttackPower() - defense);
        hp -= damage;
        System.out.println(name + " terkena " + damage + " damage dari " + enemy.getName());
    }

    public void status() {
        System.out.println(name + " status");
        System.out.println("HP = " + hp);
        System.out.println("Defense = " + defense);
        System.out.println("Attack = " + attackPower + "\n");
    }

    public int getAttackPower() {
        return attackPower;
    }

    public String getName() {
        return name;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}

public class Tugas3No2 {
    public static void main(String[] args) {
        Player player1 = new Player("Mino", 105, 30);
        Player player2 = new Player("Hilda", 100, 35);
        player1.getDamage(player2);
        player1.status();
        player2.status();
    }
}
