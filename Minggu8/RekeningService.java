package Minggu8;

public class RekeningService {
    Rekening[] reks = new Rekening[5];
    int idx;

    void add(Rekening l){
        if(idx <reks.length){
           reks[idx] = l;
            idx++;
        }else{
            System.out.println("Data sudah penuh!");
        }
    }

    void showAll(){
        System.out.println("No Rekening    nama   nama ibu  no telp. email");
        for(int i = 0; i < reks.length; i++){
            System.out.println(reks[i].noRekening+"  "+reks[i].nama+"  "+reks[i].namaIbu
            +"  "+reks[i].phone+"  "+reks[i].email);
        }
    }

    void insertionSort(){
        for(int i = 1; i < reks.length; i++){
            Rekening temp = reks[i];
            int j = i;
            while(j > 0 && reks[j-1].num > temp.num){
                reks[j] = reks[j-1];
                j--;
            }
            reks[j] = temp;
        }
    }

}
