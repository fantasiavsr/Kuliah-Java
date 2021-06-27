package UAS2;

public class LinkedList2 {
    Node2 head;
    int size;

    LinkedList2(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(Transaksi item){
        if(isEmpty()){
            head = new Node2(item, null, null);
        }else{
            Node2 newNode2 = new Node2(item, null, head);
            head.prev = newNode2;
            head = newNode2;
        }
        size++;
    }

    public void addLast(Transaksi item){
        if(isEmpty()){
            addFirst(item);
        }else{
            Node2 current = head;
            while(current.next != null){
                current = current.next;
            }
            Node2 newNode2 = new Node2(item, current, null);
            current.next = newNode2;
            size++;
        }
    }


    public int size(){
        return size;
    }

    public void clear(){
        head = null;
        size = 0;
    }

    public void print(){
        if(!isEmpty()){
            Node2 tmp = head;
            while (tmp != null){
                System.out.println("Kode: "+tmp.data.kode+", Jumlah: "+tmp.data.jumBarang+", Total: "+tmp.data.total);
                tmp = tmp.next;
            }
        }else{
            System.out.println("Linked Lists kosong");
        }
    }

    public void print2(){
        if(!isEmpty()){
            Node2 tmp = head;
            while (tmp != null){
                System.out.println("Nama Barang: "+tmp.data.namaBarang+", Kode: "+tmp.data.kode+", Jumlah: "+tmp.data.jumBarang+", Total: "+tmp.data.total);
                tmp = tmp.next;
            }
        }else{
            System.out.println("Linked Lists kosong");
        }
    }
}
