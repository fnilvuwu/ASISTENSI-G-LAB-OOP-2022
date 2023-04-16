package Praktikum3.Nomor3;

public class User {
    private String name;
    private int balance;

    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    // constructor dengan parameter
    public User(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
    // public void detail() {
    //     System.out.println("----------CARD----------");
    //     System.out.println(this.getName());
    //     System.out.println(this.getBalance());
    //     System.out.println("------------------------");
    // }
}
