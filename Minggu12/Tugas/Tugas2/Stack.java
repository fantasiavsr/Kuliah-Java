package Minggu12.Tugas.Tugas2;

public class Stack {
    Node head = null;
    Node tail = null;
    int size = 0;

    public boolean isEmpty(){
        return head == null;
    }

    public void push(String data){
        tail = head;
        head = new Node(data, null, null);
        head.data=data;
        head.next= tail;
        head.prev = null;

        if(tail != null) {
            tail.prev=head;
        }
        size++;
    }

    public void pop() {
        if (!isEmpty()) {
            head = head.next;
            size--;
        } else {
            System.out.println("Entry masih kosong.");
        }
    }

    public void peek(){
        Node tmp = head;
        System.out.println("Judul buku terataas: "+tmp.data);
    }

    public void print(){
        System.out.println("----------------------------------------------------");
        System.out.println("Cetak Seluruh Judul Buku");
        System.out.println("----------------------------------------------------");
        Node tmp = head;
        for(int i = size; i>0; i--){
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
        System.out.println();
    }
}
