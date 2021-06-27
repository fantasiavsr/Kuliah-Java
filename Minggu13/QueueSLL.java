package Minggu13;

public class QueueSLL {
     // Nama: Muhamad Alif Rizki
    // Kelas: TI 1A/14
    // NIM: 2041720196

    public Node front, rear;
    public int cSize;
    public int count = 0;

    public QueueSLL(){
        front = null;
        rear = null;
        cSize = 0;
    }

    public void enqueue(imigrasi input){
        Node tmp = new Node(input, null);
        if(this.rear == null){
            this.front = this.rear = tmp;
            System.out.println("Data berhasil ditambahkan, dengan nama "+rear.data.nama);
            cSize++;
            return;
        }
        this.rear.next = tmp;
        this.rear = tmp;
        System.out.println("Data berhasil ditambahkan, dengan nama "+rear.data.nama);
        cSize++;
    }

    public void dequeue(){
        if(this.front == null){
            System.out.println("Antrian kosong");
            return;
        }

        Node tmp = this.front;

        if(count > 2){
            if(tmp.data.usia > 5 && tmp.data.usia < 60){
                tmp = tmp.next;
                System.out.println(this.front.data.nama);
                this.front.next = null;
                this.rear = this.front;
                //this.rear = this.front.next;
                System.out.println("Data berhasil dikeluarkan, dengan nama "+tmp.data.nama);
                return;
            }
        }
        
        this.front = this.front.next;

        if(this.front == null){
            this.rear = null;
        }
        System.out.println("Data berhasil dikeluarkan, dengan nama "+tmp.data.nama);
        cSize--;
        count++;
    }

    public void printList(){
        if (this.front != null) {
            Node tmp = front;
            System.out.println("Isi Antrian: ");
            int i = 0;
            while (tmp != null) {
                System.out.println((i+1)+". "+tmp.data.nama+" |\t"+tmp.data.usia);
                tmp = tmp.next;
                i++;
            }
        }else{
            System.out.println("Antrian kosong");
        }
    }

}
