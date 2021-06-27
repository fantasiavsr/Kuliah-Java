package Minggu11.Tugas.Tugas3;

public class SLLMain {
    public static void main(String[] args)throws Exception{
        SingeLinkedList singLL = new SingeLinkedList();

        singLL.addFirst("Bahasa");
        singLL.addLast("Android");
        singLL.addLast("Komputer");
        singLL.addLast("Basis Data");
        singLL.addLast("Matematika");
        singLL.addLast("Algoritma");
        singLL.addLast("Statistika");
        singLL.addLast("Multimedia");
        singLL.printList();

        System.out.println("Data top adalah = "+singLL.getData(singLL.indexOf(singLL.tail.data)));
    }
}
