package Minggu10.Tugas.Tugas2;

public class Queue {
    int max, size, front, rear;
    Mahasiswa Q[];


    public Queue(int n){
        max = n;
        create();
    }

    public void create(){
        Q = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean isFull(){
        if(size == max){
            return true;
        }else{
            return false;
        }
    }

    public void peek(){
        if(!isEmpty()){
            System.out.println("Elemen terdepan: "+Q[front].nim+" "+Q[front].nama+" "
            +Q[front].absen+" "+Q[front].ipk);
        }else{
            System.out.println("Queue masih kosong.");
        }
    }

    public void peekRear(){
        if(!isEmpty()){
            System.out.println("Elemen terbelakang: "+Q[rear].nim+" "+Q[rear].nama+" "
            +Q[rear].absen+" "+Q[rear].ipk);
        }else{
            System.out.println("Queue masih kosong.");
        }
    }

    public void print(){
        if(isEmpty()){
            System.out.println("Queue masih kosong.");
        }else{
            int i = front;
            while(i != rear){
                System.out.println(""+Q[i].nim+" "+Q[i].nama+" "
                +Q[i].absen+" "+Q[i].ipk);
                i = (i + 1) % max;
                
            }
            System.out.println(Q[i].nim+" "+Q[i].nama+" "
            +Q[i].absen+" "+Q[i].ipk + " ");
            System.out.println("Jumlah elemen: "+size);
        }
    }

    public void clear(){
        if(!isEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan.");
        }else{
            System.out.println("Queue masih kosong.");
        }
    }

    public void enqueue(Mahasiswa data){
        if(isFull()){
            System.out.println("Queue sudah penuh.");
        }else{
            if(isEmpty()){
                front = rear = 0;
            }else{
                if(rear == max-1){
                    rear = 0;
                }else{
                    rear++;
                }
            }
            Q[rear] = data;
            size++;
        }
    }

    public Mahasiswa dequeue(){
        Mahasiswa data = new Mahasiswa("", "", 0, 0);
        if(isEmpty()){
            System.out.println("Queue masih kosong.");
        }else{
            data = Q[front];
            size--;
            if(isEmpty()){
                front = rear = -1;
            }else{
                if(front == max-1){
                    front = 0;
                }else{
                    front++;
                }
            }
        }
        return data;
    }

    void peekPosition(String data){
        int i = 0;
        int x = -1;
        while (i <= rear) {            
            if(Q[i].nim.equals(data)){
                x = i;
            }
            i++;
        }
        
        if(x==-1){
            System.out.println("Tidak ketemu");
        }else{
            System.out.println("Ada di posisi "+ x);
        }
    }

    void peekAt(int pos){
        System.out.println(Q[pos].nim+" "+Q[pos].nama+" "
        +Q[pos].absen+" "+Q[pos].ipk);
    }

}
