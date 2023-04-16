package Praktikum3.Nomor3;

import java.util.ArrayList;

public class Store {
    private String name;
    private ArrayList<Product> products;

    public Store(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Product> getProducts() {
        return this.products;
    }
    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
    public void addProduct(Product product) {
        this.products.add(product);
    }
    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public void transaksi(User user, Product produk) {
        // size itu panjang array list
        for (int i = 0; i < this.products.size(); i++) {
            if (produk == this.products.get(i)) {
                if (user.getBalance() >= produk.getPrice()) {
                    int sisaUang = user.getBalance();
                    sisaUang -= produk.getPrice();
                    user.setBalance(sisaUang); 
                    int sisaStok = produk.getStock();
                    sisaStok --;
                    produk.setStock(sisaStok);
                } else {
                    System.out.println("Uang tidak cukup!!");
                }
            }
        }
    }
}
    

