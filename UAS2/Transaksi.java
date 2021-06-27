package UAS2;

public class Transaksi {
    String namaBarang;
    int kode;
    int jumBarang, total;

    Transaksi(int kode, int jumBarang, int total, String namaBarang){
        this.namaBarang = namaBarang;
        this.kode = kode;
        this.jumBarang = jumBarang;
        this.total = total;
    }
}
