// package 4. Asistensi .Asistensi 3.Nomor1;
public class RagnarokOnline {
    // attributes
    String name;
    int level;
    int hp;
    int sp;
    int strength;
    int agility;
    int vitality;
    int intelligence;
    int dexterity;
    int luck;
    String role;

    // constructors
    public RagnarokOnline() {
    }
    
    public RagnarokOnline(String name, int level, int hp, int sp, int strength, int agility, int vitality,
            int intelligence, int dexterity, int luck, String role) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.sp = sp;
        this.strength = strength;
        this.agility = agility;
        this.vitality = vitality;
        this.intelligence = intelligence;
        this.dexterity = dexterity;
        this.luck = luck;
        this.role = role;
    }

    // behavior / method
    public void displayStats() {
        System.out.println("===== " + this.name + "'s Stats =====");
        System.out.println("Role: " + this.role);
        System.out.println("Level: " + this.level);
        System.out.println("HP: " + this.hp);
        System.out.println("SP: " + this.sp);
        System.out.println("Strength: " + this.strength);
        System.out.println("Agility: " + this.agility);
        System.out.println("Vitality: " + this.vitality);
        System.out.println("Intelligence: " + this.intelligence);
        System.out.println("Dexterity: " + this.dexterity);
        System.out.println("Luck: " + this.luck);
    }

    public void levelUp() {
        this.level += 1;
        this.hp += 10;
        this.sp += 5;
        if (this.role.equals("Swordsman")) {
            this.strength += 2;
            this.agility += 1;
            this.vitality += 2;
            this.intelligence += 0;
            this.dexterity += 1;
            this.luck += 0;
        } else if (this.role.equals("Mage")) {
            this.strength += 0;
            this.agility += 1;
            this.vitality += 1;
            this.intelligence += 3;
            this.dexterity += 1;
            this.luck += 0;
        } else if (this.role.equals("Archer")) {
            this.strength += 1;
            this.agility += 2;
            this.vitality += 1;
            this.intelligence += 1;
            this.dexterity += 2;
            this.luck += 0;
        } else if (this.role.equals("Merchant")) {
            this.strength += 1;
            this.agility += 1;
            this.vitality += 2;
            this.intelligence += 1;
            this.dexterity += 1;
            this.luck += 1;
        } else {
            System.out.println("Invalid Role.");
        }
    }

    // getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getSp() {
        return sp;
    }
    public void setSp(int sp) {
        this.sp = sp;
    }
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public int getAgility() {
        return agility;
    }
    public void setAgility(int agility) {
        this.agility = agility;
    }
    public int getVitality() {
        return vitality;
    }
    public void setVitality(int vitality) {
        this.vitality = vitality;
    }
    public int getIntelligence() {
        return intelligence;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    public int getDexterity() {
        return dexterity;
    }
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
    public int getLuck() {
        return luck;
    }
    public void setLuck(int luck) {
        this.luck = luck;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
}