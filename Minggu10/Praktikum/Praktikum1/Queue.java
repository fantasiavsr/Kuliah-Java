package Minggu10.Praktikum.Praktikum1;

public class Queue {
    int max, size, front, rear, Q[];


    public Queue(int n){
        max = n;
        create();
    }

    public void create(){
        Q = new int[max];
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
            System.out.println("Elemen terdepam: "+Q[front]);
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
                System.out.print(Q[i]+" ");
                i = (i + 1) % max;
            }
            System.out.println(Q[i] + " ");
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

    public void enqueue(int data){
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

    public int dequeue(){
        int data = 0;
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



}
