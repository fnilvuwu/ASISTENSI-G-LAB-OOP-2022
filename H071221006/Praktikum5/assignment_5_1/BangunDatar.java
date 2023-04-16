package Praktikum5.assignment_5_1;

public class BangunDatar {
    private double luas, keliling;

    public double getLuas() {
        return luas;
    }
    public void setLuas(double luas) {
        this.luas = luas;
    }
    public double getKeliling() {
        return keliling;
    }
    public void setKeliling(double keliling) {
        this.keliling = keliling;
    }
}

class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
        super.setKeliling(sisi * 4);
        super.setLuas(sisi * sisi);
    }
}

class PersegiPanjang extends BangunDatar {
    private double panjang, lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        super.setKeliling(2*panjang + 2*lebar);
        super.setLuas(panjang * lebar);
    }
}

class Lingkaran extends BangunDatar {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
        super.setKeliling(2 * Math.PI * jariJari);
        super.setLuas(Math.PI * jariJari * jariJari);
    }
}

class Segitiga extends BangunDatar {
    private double alas, tinggi, sisi;

    public Segitiga(double alas, double tinggi, double sisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi = sisi;
        super.setKeliling(sisi + sisi + sisi);
        super.setLuas(alas * tinggi / 2);
    }
}

class Trapesium extends BangunDatar {
    private double tinggi, alas, sisiMiring, atas;

    public Trapesium(double tinggi, double alas, double sisiMiring, double atas) {
        this.tinggi = tinggi;
        this.alas = alas;
        this.sisiMiring = sisiMiring;
        this.atas = atas;
        super.setKeliling(alas + sisiMiring + tinggi + atas);
        super.setLuas(tinggi * alas+atas / 2);
    }
}
