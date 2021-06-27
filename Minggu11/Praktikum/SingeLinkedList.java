package Minggu11.Praktikum;

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
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(int input){
        Node ndInput = new Node(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        }else{
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(int input){
        Node ndInput = new Node(input, null);
        if(isEmpty()){
            head = ndInput;
            tail = ndInput;
        }else{
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfer(int key, int input){
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

    public void insertBefore(int key, int input){
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

    public void inserAt(int index, int input){
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

}
