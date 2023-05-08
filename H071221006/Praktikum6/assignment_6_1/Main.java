

abstract class Dog implements Move {
    protected int position;   //* menggunakan protected agar class dapat diakses oleh class turunannya dan tdak dapat diakses diluar package*/
    protected int averageLength;

     
    abstract void describe();
}

class Pitbull extends Dog {
    public void move() {
        super.position += 3;
        System.out.println("Anjing ini berpindah sejauh +" + super.position + " ke kanan");
    }
    void describe() {
        System.out.println("Ciri-ciri Pitbull : Memiliki tubuh yang berotot dan gagah dan memiliki rahang yang kuat.");
        super.averageLength = 40;
        System.out.println("Panjang badan anjing pitbull = " + super.averageLength);
    }
}

class SiberianHusky extends Dog {
    public void move() {
        super.position += 2;
        System.out.println("Anjing ini berpindah sejauh +" + super.position + " ke kanan");
    }
    void describe() {
        System.out.println("Ciri-ciri Siberian Husky : Memiliki bulu yang tebal dan panjang dan memiliki warna beragam.");
        super.averageLength = 55;
        System.out.println("Panjang badan anjing Siberian Husky = " + super.averageLength);
    }
}

class BullDog extends Dog {
    public void move() {
        super.position += 1;
        System.out.println("Anjing ini berpindah sejauh +" + super.position + " ke kanan");
    }
    void describe() {
        System.out.println("Ciri-ciri BullDog : tubuh lebar, besar, moncong pesek, berkaki pendek dan memiliki ekstra kulit yang jatuh berlipat.");
        super.averageLength = 35;
        System.out.println("Panjang badan anjing BullDog = " + super.averageLength);
    }
}

class GermanShepherd extends Dog {
    public void move() {
        super.position +=3;
        System.out.println("Anjing ini berpindah sejauh +" + super.position + " ke kanan");
    }
    void describe() {
        System.out.println("Ciri-ciri German Shepherd : Struktur tubuh yang agak memanjang, proporsional, berotot, dan memiliki struktur tulang yang solid.");
        super.averageLength = 60;
        System.out.println("Panjang badan anjing German Shepherd = " + super.averageLength);
    }
}

public class Main {
    public static void main(String[] args) {
        Pitbull pitbull = new Pitbull();
    
        System.out.println("=".repeat(35));
        pitbull.describe();
        System.out.println("=".repeat(35));
        pitbull.move();
        System.out.println("=".repeat(35));
    }
}

