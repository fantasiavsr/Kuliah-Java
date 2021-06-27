package Minggu12.Tugas.Tugas4;

public class DoubleLinkedList {
    Node head;
    int size;

    DoubleLinkedList(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(Mahasiswa item){
        if(isEmpty()){
            head = new Node(item, null, null);
        }else{
            Node newNode = new Node(item, null, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa item){
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

    public void add(Mahasiswa item, int ind)throws Exception{
        int index = ind - 1;
        if(isEmpty()){
            addFirst(item);
        }else if(index < 0 || index > size){
            throw new Exception("Nilai index di luar batas");
        }else{
            Node current = head;
            int i = 0;
            while (i < index){
                current = current.next;
                i++;
            }

            if(current.prev == null){
                Node newNode = new Node(item, null, current);
                current.prev = newNode;
                head = newNode;
            }else{
                Node newNode = new Node(item, current.prev, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size(){
        return size;
    }

    public void clear(){
        head = null;
        size = 0;
    }

    public void print(){
        System.out.println("Cetak Data.");
        if(!isEmpty()){
            Node tmp = head;
            while (tmp != null){
                System.out.println("NIM: "+tmp.data.nim);
                System.out.println("    Nama: "+tmp.data.nama);
                System.out.println("    IPK: "+tmp.data.ipk);
                tmp = tmp.next;
            }
        }else{
            System.out.println("Linked Lists kosong");
        }
    }

    public void removeLast()throws Exception{
        if(isEmpty()){
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        }else if(head.next == null){
            head = null;
            size--;
            return;
        }
        Node current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void removeFirst()throws Exception{
        if(isEmpty()){
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        }else if(size == 1){
            removeLast();
        }else{
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void remove(int index)throws Exception{
        if(isEmpty() || index >= size){
            throw new Exception("Nilai index diluar batas");
        }else if(index == 0){
            removeFirst();
        }else{
            Node current = head;
            int i = 0;
            while(i < index){
                current = current.next;
                i++;
            }

            if(current.next == null){
                current.prev.next = null;
            }else if(current.prev == null){
                current = current.next;
                current.prev = null;
                head = current;
            }else{
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public int getFirst()throws Exception{
        if(isEmpty()){
            throw new Exception("Liked List kosong");
        }
        return head.data.nim;
    }

    public int getLast()throws Exception{
        if(isEmpty()){
            throw new Exception("Liked List kosong");
        }
        Node tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        return tmp.data.nim;
    }

    public int get(int index)throws Exception{
        if(isEmpty() || index >= size){
            throw new Exception("Nilai index diluar batas");
        }
        Node tmp = head;
        for(int i = 0; i< index; i++){
            tmp = tmp.next;
        }
        return tmp.data.nim;
    }

    public int search(int cari){
        Node temp = head;
        int pos = 0;

        while(temp.data.nim != cari && temp.next != null){
            pos++;
            temp = temp.next;
        }
        if(temp.data.nim != cari){
            return -1;
        }
        return (pos);
    }

    public void sort(){
        Node current = null, index = null;
        Mahasiswa temp;

        if(head == null){
            return;
        }else{
            for(current = head; current.next !=null; current = current.next){
                for(index = current.next; index != null; index = index.next){
                    if(current.data.ipk > index.data.ipk){
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                }
            }
        }
        System.out.println("Data diurutkan Descending.");
        print();
    }
}
