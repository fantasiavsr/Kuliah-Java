package Minggu8;

public class Transaksi {
    double saldo, saldoAwal, saldoAkhir;
    String noRekening, tglTransaksi;

    Transaksi(String x, double a, double b, double c, String e){
        noRekening = x;
        saldo = a;
        saldoAwal = b;
        saldoAkhir = c;
        tglTransaksi = e;
    }
}
