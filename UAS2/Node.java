package UAS2;

public class Node {
    Barang data;
    Node prev, next;

    Node(Barang data, Node prev, Node next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
