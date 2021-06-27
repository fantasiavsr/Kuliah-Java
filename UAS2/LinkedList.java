package UAS2;

public class LinkedList{
    Node head;
    int size;

    LinkedList(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(Barang item){
        if(isEmpty()){
            head = new Node(item, null, null);
        }else{
            Node newNode = new Node(item, null, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Barang item){
        if(isEmpty()){
            addFirst(item);
        }else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            Node newNode = new Node(item, current, null);
            current.next = newNode;
            size++;
        }
    }


    public int size(){
        return size;
    }


    public void print(){
        if(!isEmpty()){
            Node tmp = head;
            while (tmp != null){
                System.out.println("Kode: "+tmp.data.kode+", Nama: "+tmp.data.nama+", Harga: "+tmp.data.harga);
                tmp = tmp.next;
            }
        }else{
            System.out.println("Linked Lists kosong");
        }
    }




    public String getFirst()throws Exception{
        if(isEmpty()){
            throw new Exception("Liked List kosong");
        }
        return head.data.nama;
    }

    public int getHarga(int kode)throws Exception{
        Node tmp = head;

        while(tmp.data != null){
            if(tmp.data.kode == kode){
                return tmp.data.harga;
            }
            tmp = tmp.next;
        }
        return -1;
    }

    public String getNama(int kode)throws Exception{
        Node tmp = head;

        while(tmp.data != null){
            if(tmp.data.kode == kode){
                return tmp.data.nama;
            }
            tmp = tmp.next;
        }
        return "Data tidak ada";
    }
}
