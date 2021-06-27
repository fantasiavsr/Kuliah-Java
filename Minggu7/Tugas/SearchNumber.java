package Minggu7.Tugas;

public class SearchNumber{
    int row, col, rowPos, colPos;

    Number listNumber[][] = new Number[3][5];

    void add(Number n){
        if(row < 3){
            if(col < 5){
                listNumber[row][col] = n;
                col++;
            }else{
                row++;
                col = 0;
                listNumber[row][col] = n;
                col++;
            }
        }else{
            System.out.println("Data sudah penuh.");
        }
    }

    void show (){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(listNumber[i][j].number+" ");
            }
        }
        
    }

    void findSeqSearch(int cari){
        colPos=-1;
        rowPos=-1;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                if(listNumber[i][j].number==cari){
                    colPos = i;
                    rowPos = j;
                }
            }
        }
    }
    
    void showPosition(int x, int posR, int posC){
        if(posC != -1 && posR != -1){
            System.out.println("Data: "+x+" ditemkukan pada indeks ["+posC+"]"+"["+posR+"]");
        }else{
            System.out.println("Data "+x+" tidak ditemukan.");
        }
    }

    void showData(int x, int posR, int posC){
        if(posC != -1 && posR != -1){
            System.out.println(listNumber[posC][posR].number);
        }else{
            System.out.println("Data "+x+" tidak ditemukan.");
        }
    }



}
