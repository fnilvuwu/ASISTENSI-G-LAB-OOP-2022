class Produk {

    int ID;
    String nama;
    int stok;
    double harga;

    Barang(int ID, String nama, int stok, double harga) {
        this.ID = ID;
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    public boolean tersedia() {
        return stok > 0;
    }

    

    public void cekProduk() {
        // void tidak bisa return, void itu tipe method

        if (tersedia()) {
            System.out.println(nama + "dengan " + harga + " tersedia dengan stok " + stok);
        } else {
            System.out.println(nama + "dengan " + harga + " tidak tersedia");
        }
    
    }

}

