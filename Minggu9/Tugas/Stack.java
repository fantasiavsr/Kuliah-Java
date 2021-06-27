package Minggu9.Tugas;

public class Stack {
    int size, top, data[];

    public Stack(int size){
        this.size = size;
        data = new int[size];
        top = -1;
    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){
        if(top == size -1){
            return true;
        }else{
            return false;
        }
    }

    public void push(int dt){
        if(!isFull()){
            top++;
            data[top] = dt;
        }else{
            System.out.println("Isi stack penuh!");
        }
    }

    public void pop(){
        if(!isEmpty()){
            //int x = data[top];
            top--;
            //System.out.println("Data yang keluar adalah "+x);
        }else{
            System.out.println("Stack masih kosong.");
        }
    }

    public void peek(){
        System.out.println("Elemen teratas: "+data[top]);
    }

    public void print(){
        System.out.println("Isi stack: ");
        for(int i = top; i>=0; i--){
            System.out.println(data[i]+" ");
        }
        System.out.println();
    }

    public int choose(int j){
        int x = data [j];
        return x;
        
    }

    public void clear(){
        if(!isEmpty()){
            for(int i = top; i >= 0; i--){
                top--;
            }
            System.out.println("Stack sudah dikosongkan.");
        }else{
            System.out.println("Gagal! Stack masih kosong.");
        }
    }
}
