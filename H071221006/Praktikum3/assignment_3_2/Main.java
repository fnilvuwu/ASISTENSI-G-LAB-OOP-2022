class Player {
    private String name;
    private int hp;
    private int attackPower;
    private int defense;

    public Player(){}

    public void getDamage(Player enemy) {
        hp= hp-Math.abs(enemy.getAttackPower()-defense);
    }

    // Lengkapi
    
    public void status() {
        System.out.println(name + " status");
        System.out.println("HP = " + hp);
        System.out.println("Defense = " + defense);
        System.out.println("Attack = " + attackPower + "\n");
    }

    public Player(String name, int hp, int attackPower, int defense) {
        this.name = name;
        this.attackPower = attackPower;
        this.defense = defense;
        this.hp = hp;

    }

    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }


    int getAttackPower() {
        return attackPower;
    }
}
    
public class Main {
    public static void main(String [] args) {
    
        Player player1= new Player("Mino", 100, 30, 15);
        Player player2= new Player("Hilda", 100, 100, 10);
    
        player2.setAttackPower(-100);
    
        player1.getDamage(player2);
    
        player1.status();
        player2.status();
    }
}
    