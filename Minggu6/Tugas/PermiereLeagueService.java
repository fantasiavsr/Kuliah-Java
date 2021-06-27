package Minggu6.Tugas;

public class PermiereLeagueService {

    PremiereLeague[] leagues = new PremiereLeague[20];
    int idx;

    void tambah(PremiereLeague l){
        if(idx < leagues.length){
            leagues[idx] = l;
            idx++;
        }else{
            System.out.println("Data sudah penuh!");
        }
    }
    
    void tampilAll(){
            System.out.println("No.\t|   Premiere League\t\t|   P\t|   GD\t|   PTS");
            System.out.println("---------------------------------------------------------------");
        for(int i = 0; i < leagues.length; i++){
            System.out.println(i+"\t|   "+leagues[i].team+"\t|   "+leagues[i].play+"\t|   "+leagues[i].goal+"\t|   "+leagues[i].points);

        }
    }

    void insertionSort(){
        for(int i = 1; i < leagues.length; i++){
            PremiereLeague temp = leagues[i];
            int j = i;
            while(j > 0 && leagues[j-1].points > temp.points){
                leagues[j] = leagues[j-1];
                j--;
            }
            leagues[j] = temp;
        }
    }
    
}
