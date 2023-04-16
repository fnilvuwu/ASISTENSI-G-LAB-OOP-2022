package Praktikum5.assignment_5_2;

public class KomunitasProgrammer {
    private String nama;
    private int umur;
    private String fakultas;
    private String jurusan;

    public KomunitasProgrammer(String nama, int umur, String fakultas, String jurusan) {
        this.nama = nama;
        this.umur = umur;
        this.fakultas = fakultas;
        this.jurusan = jurusan;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getUmur() {
        return umur;
    }
    public void setUmur(int umur) {
        this.umur = umur;
    }
    public String getFakultas() {
        return fakultas;
    }
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
    public String getJurusan() {
        return jurusan;
    }
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
}

class PengurusInti extends KomunitasProgrammer {
    private String jabatan;

    public PengurusInti(String nama, int umur, String fakultas, String jurusan, String jabatan) {
        super(nama, umur, fakultas, jurusan);
        this.jabatan = jabatan;
    }

    public String getJabatan() {
        return jabatan;
    }
    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}

class KoordinatorBidangStaff extends KomunitasProgrammer {
    private String bidang;
    
    public KoordinatorBidangStaff(String nama, int umur, String fakultas, String jurusan, String bidang) {
        super(nama, umur, fakultas, jurusan);
        this.bidang = bidang;
    }
    
    public String getBidang() {
        return bidang;
    }
    public void setBidang(String bidang) {
        this.bidang = bidang;
    }
}
