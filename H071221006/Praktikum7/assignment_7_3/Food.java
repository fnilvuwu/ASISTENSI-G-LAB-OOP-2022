import java.util.ArrayList;

// Interface Food
interface Food {
    double getPrice();
}


// Class Burger
class Burger implements Food {
    private double price;
    @Override
    public double getPrice() {
        return price;
    }
}


// Class Pizza
class Pizza implements Food {
    private double price;
    @Override
    public double getPrice() {
        return price;
    }
}


// Class Steak
class Steak implements Food {
    private double price;
    @Override
    public double getPrice() {
        return price;
    }
}


// Class FactoryFood
class FactoryFood {
    public static Food getFood(String jenisMakanan) {  // Parameternya ini merepresentasikan jenis makanan yang dipesan
        // Jika jenis makanan sama dengan burger (tanpa memperhatikan huruf besar atau kecil), maka akan mengembalikan objek burger
        if (jenisMakanan.equalsIgnoreCase("Burger")) {
            return new Burger();
        // Jika jenis makanan sama dengan Pizza (tanpa memperhatikan huruf besar atau kecil), maka akan mengembalikan objek pizza
        } else if (jenisMakanan.equalsIgnoreCase("Pizza")) {
            return new Pizza();
        // Jika jenis makanan sama dengan steak (tanpa memperhatikan huruf besar atau kecil), maka akan mengembalikan objek steak
        } else if (jenisMakanan.equalsIgnoreCase("Steak")) {
            return new Steak();
        } else {
            return null;
        }
    }
}


// Class Restoran
class Restoran {
    public static int calculateTotal(ArrayList<Food> foods) {
        int totalPrice = 0;  //inisialisasi totalPrice dengan nilai 0
        for (Food food : foods) { //kita iterasi objek Food dalam foods. Dalam setiap iterasi kita mengakses objek Food dengan menggunakan food
            totalPrice += food.getPrice();
        }
        return totalPrice;
    }
}


// Main Class
class Main {
    public static void main(String[] args) {
        Food burger = FactoryFood.getFood("burger");
        Food pizza = FactoryFood.getFood("pizza");
        Food steak = FactoryFood.getFood("steak");

        ArrayList<Food> foods = new ArrayList<>();
        foods.add(burger);
        foods.add(pizza);
        foods.add(steak);

        int total = Restoran.calculateTotal(foods);

        System.out.println("Total price: " + total);

    }
}