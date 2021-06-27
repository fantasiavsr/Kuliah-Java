package Minggu7.Tugas;

public class SearchNumber2 {
    int idx;
    Number listNumber[] = new Number[10];

    void add(Number n){
        if(idx < listNumber.length){
            listNumber[idx] = n;
            idx++;
        }else{
             System.out.println("Data sudah penuh.");
        }
    }
    
    void show(){
        for(int i = 0; i < 10; i++){
            System.out.print(listNumber[i].number+" ");
        }
        System.out.println();
    }


    void showPosition(int x, int pos){
        if(pos != -1){
            System.out.println("Data: "+x+" ditemukan pada indeks "+pos+", "+(pos+1));
        }else{
            System.out.println("Data "+x+" tidak ditemukan.");
        }
    }

    void showData(int x, int pos){
        if(pos != -1){
            System.out.println(listNumber[pos].number);

        }else{
            System.out.println("Data "+x+" tidak ditemukan.");
        }
    }

    int findBinarySearch(int left, int right){
        int mid;
        if(right >= left){
            mid = (left + right)/2;
            if(90 == listNumber[mid].number){
                return (mid);
            }else if(listNumber[mid].number > 90){
                return findBinarySearch(left, mid-1);
            }else{
                return findBinarySearch(mid+1, right);
            }
        }
        return -1;
    }

    
}
