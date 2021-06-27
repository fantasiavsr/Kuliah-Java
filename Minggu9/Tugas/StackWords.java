package Minggu9.Tugas;

public class StackWords {
    int size, top;
    String data[];


    public StackWords(int size){
        this.size = size;
        data = new String[size];
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

    public void push(String dt){
        if(!isFull()){
            top++;
            data[top] = dt;
        }else{
            System.out.println("Isi stack penuh!");
        }
    }

    public String pop(){
        if(!isEmpty()){
            String x = data[top];
            top--;
            return x;
        }else{
            return "";
        }
    }

    public void peek(){
        System.out.println("Elemen teratas: "+data[top]);
    }

    public void print(){
        System.out.println("Hasil: ");
        for(int i = top; i>=0; i--){
            System.out.print(data[i]+"");
        }
        System.out.println();
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
