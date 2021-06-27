package Minggu12.Tugas.Tugas3;

public class Node {
    Vaksin data;
    Node prev, next;

    Node(Vaksin data, Node prev, Node next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
