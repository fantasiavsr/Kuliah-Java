package Minggu9.Tugas;

public class struk {
    int noTrans, jumTrans, total;
    String tglTrans;

    struk(int no, String tgl, int jum, int t){
        noTrans = no;
        tglTrans = tgl;
        jumTrans = jum;
        total = t;
    }

    void print(){
        System.out.println("Nomor Transaksi: "+noTrans);
        System.out.println("Tanggal Transaksi: "+tglTrans);
        System.out.println("Jumlah Transaksi: "+jumTrans);
        System.out.println("Total: "+total);
    }
}
