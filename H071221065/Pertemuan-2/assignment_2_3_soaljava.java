public class assignment_2_3_soaljava {
    private int id;
    private String nama;
    private int stok;
    private double harga;

    public assignment_2_3_soaljava(int id, String nama, int stok, double harga) {
        this.id = id;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getStok() {
        return stok;
    }

    public double getHarga() {
        return harga;
    }

    public boolean isAvaliable() {
        return stok > 0;
    }
    public static void main(String[] args) {
        assignment_2_3_soaljava produk1 = new assignment_2_3_soaljava(111, "Pulpen", 50, 5000);
        assignment_2_3_soaljava produk2 = new assignment_2_3_soaljava(222, "Buku", 0, 10000);

        System.out.println("ID produk 1: " + produk1.getId());
        System.out.println("Nama produk 1: " + produk1.getNama());
        System.out.println("Stok produk 1: " + produk1.getStok());
        System.out.println("Harga produk 1: " + produk1.getHarga());
        System.out.println("Apakah produk 1 tersedia di stok? " + produk1.isAvaliable());


        System.out.println("========================================");

        System.out.println("ID produk 2: " + produk2.getId());
        System.out.println("Nama produk 2: " + produk2.getNama());
        System.out.println("Stok produk 2: " + produk2.getStok());
        System.out.println("Harga produk 2: " + produk2.getHarga());
        System.out.println("Apakah produk 2 tersedia di stok? " + produk2.isAvaliable());
    }
}