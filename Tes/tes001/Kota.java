package Tes.tes001;

public class Kota {
    String nama;
    int limbah, pAir, pUdara;

    Kota(String n, int l, int a, int u){
        nama = n;
        limbah = l;
        pAir = a;
        pUdara = u;
    }

    public void print(){
        System.out.println(nama+"\t\t"+limbah+"\t\t"+pAir+"\t\t"
        +pUdara);
    }
}
