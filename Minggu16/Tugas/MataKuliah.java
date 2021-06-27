package Minggu16.Tugas;

public class MataKuliah {
    int kode, sks;
    String nama;

    MataKuliah(int kode, String nama, int sks){
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }


    public int getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    @Override
    public String toString(){
        return "Kode: "+kode+", MK: "+nama+", SKS: "+sks;
    }
}
