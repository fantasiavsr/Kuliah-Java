package Minggu11.Tugas.Tugas3;

public class SingeLinkedList {
    Node head;
    Node tail;

    public boolean isEmpty(){
        return head == null;
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
