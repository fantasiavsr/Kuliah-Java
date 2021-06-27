package UAS2;

public class Node2{
    Transaksi data;
    Node2 prev, next;

    Node2(Transaksi data, Node2 prev, Node2 next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
