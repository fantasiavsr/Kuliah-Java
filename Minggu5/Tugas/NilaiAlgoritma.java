package Minggu5.Tugas;

public class NilaiAlgoritma {
    
    public String namaMhs;
    public int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;

    double hitungTotal(int a, int l, int i, int f){
        double nTotal = (a*0.3)+(l*0.2)+(i*0.2)+(f*0.3);
        return nTotal;
    }
}
