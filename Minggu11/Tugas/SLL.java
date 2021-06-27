package Minggu11.Tugas;

public class SLL {
    Node head;
    Node tail;

    public boolean isEmpty(){
        return head == null;
    }

    public void printList(){
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("Isi Linked List: ");
            int i = 0;
            while (tmp != null) {
                System.out.println((i+1)+". "+tmp.data.nama+" "+tmp.data.alamat+" "+tmp.data.noRek);
                tmp = tmp.next;
                i++;
            }
        }else{
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(nasabahBank input){
        Node ndInput = new Node(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        }else{
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(nasabahBank input){
        Node ndInput = new Node(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public nasabahBank getData(int index){
        Node tmp = head;
        for(int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int indexOfRekening(int key){
        Node tmp = head;
        int index = 0;
        while(tmp != null && tmp.data.noRek != key){
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

    public void remove(int key){
        if(isEmpty()){
            System.out.println("Linked list masih kosong, tidak dapat dihapus.");
        }else{
            Node temp = head;
            while(temp != null){
                if(temp.data.noRek == key && temp == head){
                    this.removeFirst();
                    break;
                }else if(temp.next.data.noRek == key){
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

}
