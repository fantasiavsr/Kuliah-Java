package Minggu11.Praktikum;

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
        singLL.insertAfer(700, 900);
        singLL.print();
        singLL.insertBefore(700, 600);
        singLL.print();
        singLL.inserAt(3, 833);
        singLL.print();
    }
}
