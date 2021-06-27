package Tes;

public class LinkedList {
    Node head;
    int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item) {
        head = new Node(item, head);
        size++;
    }

    public void add(int item, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai Index Di Luar Batas");
        }
        if (isEmpty() || index == 0) {
            addFirst(item);
        } else {
            Node tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            Node next = (tmp == null) ? null : tmp.next;
            tmp.next = new Node(item, next);
            size++;
        }
    }
    
    public void addLast(int item) {
        if (isEmpty()) {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(item, null);
            size++;
        } else {
        }
    }

    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linkedlist Kosong");
        }
        return head.data;
    }

    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList Kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai Index diluar Batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai Index di luar batas");
        }
        Node prev = head;
        Node cur = head.next;
        for (int i = 1; i < index; i++) {
            prev = cur;
            cur = prev.next;
        }
        prev.next = cur.next;
    }

    public void removeFirst() throws Exception {
        //int tmp = getFirst();
        head = head.next;
        size--;
    }

    public void clear() {

    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + " ");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked List Kosong");
        }
    }
    
    public void removeKey(int key) throws Exception {
    if (isEmpty()) {
        throw new Exception("Nilai index diluar batas");
    }
    int index = -1;
    int i = 0;
    Node tmp = head;
    while (tmp != null) {
        if (key == tmp.data) {
            index = i;
        }
        tmp = tmp.next;
        i++;
    }
    Node prev = head;
    Node cur = head.next;
    for (int j = 1; j < index; j++) {
        prev = cur;
        cur = prev.next;
    }
    prev.next = cur.next;
    size++;
    }
}
