package Minggu16.Tugas;

public class Mahasiswa {
    int nim;
    String nama, telp;

    Mahasiswa(int nim, String nama, String telp){
        this.nim = nim;
        this.nama = nama;
        this.telp = telp;
    }

    public int getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getTelp() {
        return telp;
    }


    @Override
    public String toString(){
        return "NIM: "+nim+", Nama: "+nama+", No. Telp: "+telp;
    }
    
}
