package Minggu16.Tugas;

public class Nilai {
    double nilai;
    int nim, sks;
    String nama, mk;
    
    Nilai(int nim, String nama, String mk, int sks, double nilai){
        this.nim = nim;
        this.nama = nama;
        this.mk = mk;
        this.sks = sks;
        this.nilai = nilai;
    }

    public String toString(){
        return "NIM: "+nim+", Nama: "+nama+", MK: "+mk+", SKS: "+sks+", Nilai: "+nilai;
    }
}
