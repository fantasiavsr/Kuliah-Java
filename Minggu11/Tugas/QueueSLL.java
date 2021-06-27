package Minggu11.Tugas;

public class QueueSLL {
    public Node front, rear;
    public int cSize;

    public QueueSLL(){
        front = null;
        rear = null;
        cSize = 0;
    }

    public void enqueue(nasabahBank input){
        Node tmp = new Node(input, null);
        if(this.rear == null){
            this.front = this.rear = tmp;
            System.out.println("Data berhasil ditambahkan, dengan No Rek. "+rear.data.noRek);
            cSize++;
            return;
        }
        this.rear.next = tmp;
        this.rear = tmp;
        System.out.println("Data berhasil ditambahkan, dengan No Rek. "+rear.data.noRek);
        cSize++;
    }

    public void dequeue(){
        if(this.front == null){
            System.out.println("Antrian kosong");
            return;
        }

        Node tmp = this.front;
        this.front = this.front.next;

        if(this.front == null){
            this.rear = null;
        }
        System.out.println("Data berhasil dikeluarkan, dengan No Rek. "+tmp.data.noRek);
        cSize--;
    }

    public void printList(){
        if (this.front != null) {
            Node tmp = front;
            System.out.println("Isi Antrian: ");
            int i = 0;
            while (tmp != null) {
                System.out.println((i+1)+". "+tmp.data.nama+" |\t"+tmp.data.alamat+" |\t"+tmp.data.noRek);
                tmp = tmp.next;
                i++;
            }
        }else{
            System.out.println("Antrian kosong");
        }
    }

    public void peek(){
        if(front != null){
            System.out.println("Elemen terdepan: "+front.data.nama+" |\t"+front.data.alamat+" |\t"
            +front.data.noRek);
        }else{
            System.out.println("Queue masih kosong.");
        }
    }

    public void peekRear(){
        if(front != null){
            System.out.println("Elemen terbelakang: "+rear.data.nama+" |\t"+rear.data.alamat+" |\t"
            +rear.data.noRek);
        }else{
            System.out.println("Queue masih kosong.");
        }
    }
}
