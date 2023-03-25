public class GenshinChar {
    // Atribute
    String name;
    String element;
    String weapon;
    String region;
    int rarity;
    int ascend;
    int attack;
    int level;

    //Constructor
    public GenshinChar(String name, String element, String weapon, String region, int level, int rarity) {
        this.name = name;
        this.element = element;
        this.weapon = weapon;
        this.region = region;
        this.rarity = rarity;
        this.ascend = 0;
        this.attack = 50;
        this.level = level;

    }

    // method/behavior
    public void Character() {
        System.out.printf("Character = %s \nVision = %s \nWeapon = %s \nRegion = %s \nRarity = %d \n", name, element, weapon, region, rarity);
    }
    public void ascend() {
        ascend++;
        attack += 6; //setip berlangsungnya ascend, attack akan bertambah 6
        System.out.printf("Character ascend %d-Star\n", ascend);
    }
    public void levelUp() {
        level++; //level bertambah 1 dari level awal
        double l = level / 20; //setiap kali level bertambah 20 maka ascend akan berlangsung
        System.out.println("Level Character = "+level);
        if (l >= 1) {
            int r = (int)l;
            for (int i = 0; i < r; i++) {
                ascend();
            }
        }
    }
}
