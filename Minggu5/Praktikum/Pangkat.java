package Minggu5.Praktikum;

public class Pangkat {
    public int nilai, pangkat;

    public int pangkatBF(int x, int y){
        int hasil = 1;
        for(int z = 0; z < y; z++){
            hasil = hasil * x;
        }
        return hasil;
    }

    public int pangkatDC(int x, int y){
        if(y == 0){
            return 1;
        }else{
            if(y % 2 == 1){
                return (pangkatDC(x, y/2) * pangkatDC(x, y/2)*x);
            }else{
                return (pangkatDC(x, y/2) * pangkatDC(x, y/2));
            }
        }
    }
}
