package Minggu11.Praktikum.Prasktikum2;

public class SLLMain {
    public static void main(String[] args)throws Exception{
        SingeLinkedList singLL = new SingeLinkedList();

        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfer(700, 999);
        singLL.print();
        singLL.inserAt(3, 833);
        singLL.print();

        System.out.println("Data pada indekx ke-1 = "+singLL.getData(1));
        System.out.println("Data 3 berada pada indeks ke-"+singLL.indexOf(760));

        singLL.remove(999);
        singLL.print();
        singLL.removeAt(0);
        singLL.print();
        singLL.removeFirst();
        singLL.print();
        singLL.removeLast();
        singLL.print();
    }
}
