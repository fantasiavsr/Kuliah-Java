package Minggu12.Tugas.Tugas2;

public class Node {
    String data;
    Node prev, next;

    Node(String data, Node prev, Node next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
