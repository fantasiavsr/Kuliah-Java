package Minggu12.Tugas.Tugas3;

public class QDLL {
    Node head, tail;
    int size = 0;

    public QDLL(){
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty(){
        return head == tail;
    }

    public void enqueue(Vaksin data){
        Node tmp = new Node(data, null, null);
        tmp.next = null;
        if(head == null){
            head=tail=tmp;
            head.prev = null;
        }else{
            tail.next = tmp;
            tmp.prev = tail;
            tail = tmp;
        }
        size++;
    }

    public String dequeue(){
        if(this.head == null){
            return "Antrian kosong";
        }

        Node tmp = this.head;
        this.head = this.head.next;

        if(this.head == null){
            this.tail = null;
        }
        size--;
        return tmp.data.nama;
    }

    public void print(){
        if (this.head != null) {
            Node tmp = head;
            System.out.println("No. |\t Nama");
            //int i = 0;
            while (tmp != null) {
                System.out.println(tmp.data.no+" |\t"+tmp.data.nama);
                tmp = tmp.next;
                //i++;
            }
        }else{
            System.out.println("Antrian kosong");
        }
    }
}
