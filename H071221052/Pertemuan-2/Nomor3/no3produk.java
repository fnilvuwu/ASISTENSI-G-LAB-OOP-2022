public class no3produk {
    int id;
    String name;
    int stock;
    double price;

    public no3produk(int id, String name, int stock, double price) {
        this.id = id;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    public boolean isAvailable() {
        // true
        return stock <= 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

// Baris 1: Deklarasi kelas publik bernama no3produk.

// Baris 2-5: Deklarasi variabel instance yang akan digunakan di kelas ini.

// Baris 7-12: Konstruktor kelas no3produk dengan empat parameter. Konstruktor
// ini digunakan untuk menginisialisasi nilai-nilai awal dari variabel instance
// pada saat objek dibuat.

// Baris 14-16: Method yang mengembalikan boolean yang mengecek apakah produk
// tersedia atau tidak. Produk dianggap tersedia jika stoknya kurang dari atau
// sama dengan 100.

// Baris 18-21: Method untuk mengembalikan nilai variabel instance id.

// Baris 23-26: Method untuk mengatur nilai variabel instance id.

// Baris 28-31: Method untuk mengembalikan nilai variabel instance name.

// Baris 33-36: Method untuk mengatur nilai variabel instance name.

// Baris 38-41: Method untuk mengembalikan nilai variabel instance stock.

// Baris 43-46: Method untuk mengatur nilai variabel instance stock.

// Baris 48-51: Method untuk mengembalikan nilai variabel instance price.

// Baris 53-56: Method untuk mengatur nilai variabel instance price.