

class SmartPhone implements Move {
    private String brand;
    private int price;

    public SmartPhone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public void move() {
        System.out.println("SmartPhone berpindah");
        System.out.println(brand + " mempunyai harga Rp." + price);
    }
}

class Car implements Move {
    private int totalForwardGear;
    private String colour;
    private int maxSpeed;
    
    public Car(int totalForwardGear, String colour, int maxSpeed) {
        this.totalForwardGear = totalForwardGear;
        this.colour = colour;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void move() {
        System.out.println("Mobil ini mempunyai " + totalForwardGear + " gear");
        System.out.println("Mobil ini berwarna " + colour);
        System.out.println("Mobil ini mempunyai kecepatan maksimal " + maxSpeed + "km");
        System.out.println("Mobil sedang berakselerasi");
    }
}

public class Main2 {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Samsung", 9000000);
        Car car = new Car(5, "Red", 340);
       
        System.out.println("=".repeat(35));
        smartPhone.move();
        System.out.println("=".repeat(35));
        car
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        .move();
        System.out.println("=".repeat(35));
    }
}