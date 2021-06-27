package Minggu8;

public class TransaksiService{
    Transaksi[] trans = new Transaksi[5];
    int idx;

    void add(Transaksi l){
        if(idx < trans.length){
            trans[idx] = l;
            idx++;
        }else{
            System.out.println("Data sudah penuh!");
        }
    }

    void showAll(){
            System.out.println("No Rekening    saldo   saldo awal  saldo akhir tglTransaksi");
        for(int i = 0; i < trans.length; i++){
            System.out.println(trans[i].noRekening+"  "+trans[i].saldo+"  "+trans[i].saldoAwal
            +"  "+trans[i].saldoAkhir+"  "+trans[i].tglTransaksi);
        }
    }

    void showLebih(){
        for(int i = 0; i < trans.length; i++){
            if(trans[i].saldo>500000){
                System.out.println(trans[i].noRekening+"  "+trans[i].saldo+"  "+trans[i].saldoAwal
                +"  "+trans[i].saldoAkhir+"  "+trans[i].tglTransaksi);
            }
        }
    }

}
