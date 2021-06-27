package Minggu12.Tugas.Tugas4;

public class Node {
    Mahasiswa data;
    Node prev, next;

    Node(Mahasiswa data, Node prev, Node next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
