package UAS2;

public class Barang {
    String  nama;
    int kode, harga, stok;

    Barang(int kode, String nama, int harga, int stok){
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public int getHarga() {
        return harga;
    }
}
