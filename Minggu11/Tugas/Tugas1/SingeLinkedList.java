package Minggu11.Tugas.Tugas1;

public class SingeLinkedList {
    Node head;
    Node tail;

    public boolean isEmpty(){
        return head == null;
    }

    public void print(){
        if (!isEmpty()) {
            Node tmp = head;
            System.out.print("Isi Linked List:\t");
            while (tmp != null) {
                System.out.print(tmp.data+"\t");
                tmp = tmp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linked list kosong");
        }
    }

    public void printList(){
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("Isi Linked List: ");
            int i =0;
            while (tmp != null) {
                System.out.println((i+1)+". "+tmp.data);
                tmp = tmp.next;
                i++;
            }
        }else{
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(String input){
        Node ndInput = new Node(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        }else{
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(String input){
        Node ndInput = new Node(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfer(String key, String input){
        Node ndInput = new Node(input, null);
        Node temp = head;
        do{ 
            if(temp.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null){
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }while(temp != null);
    }

    public void insertBefore(String key, String input){
        Node temp = head;
        do{ 
            if(temp.data == key){
                Node ndInput = new Node(input, null);
                ndInput.next = head;
                head = ndInput;
                return;
            }else{
                if(temp.next.data == key){
                    Node ndInput = new Node(input,null);
                    ndInput.next = temp.next;
                    temp.next = ndInput;
                    return;
                }
                temp = temp.next;
            }
        }while(temp != null);
    }

    public void inserAt(int index, String input){
        if(index < 0){
            System.out.println("Indeks salah.");
        }else if(index == 0){
            addFirst(input);
        }else{
            Node temp = head;
            for(int i = 0; i < index-1; i++){
                temp = temp.next;
            }
            temp.next = new Node(input, temp.next);
            if(temp.next.next == null){
                tail = temp.next;
            };
        }
    }

    public String getData(int index){
        Node tmp = head;
        for(int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int indexOf(String key){
        Node tmp = head;
        int index = 0;
        while(tmp != null && tmp.data != key){
            tmp = tmp.next;
            index++;
        }

        if(tmp == null ){
            return -1;
        }else{
            return index;
        }
    }

    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked list masih kosong, tidak dapat dihapus.");
        }else if(head == tail){
            head = tail = null;
        }else{
            head = head.next;
        }
    }

    public void removeLast(){
        if(isEmpty()){
            System.out.println("Linked list masih kosong, tidak dapat dihapus.");
        }else if(head == tail){
            head = tail = null;
        }else{
            Node temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(String key){
        if(isEmpty()){
            System.out.println("Linked list masih kosong, tidak dapat dihapus.");
        }else{
            Node temp = head;
            while(temp != null){
                if(temp.data == key && temp == head){
                    this.removeFirst();
                    break;
                }else if(temp.next.data == key){
                    temp.next = temp.next.next;
                    if(temp.next == null){
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index){
        if(index == 0){
            removeFirst();
        }else{
            Node temp = head;
            for(int i = 0; i < index-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if(temp.next == null){
                tail = temp;
            }
        }
    }
    
}
