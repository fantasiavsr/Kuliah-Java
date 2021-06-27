package Minggu11.Tugas.Tugas2;

public class SLLMain {
    public static void main(String[] args)throws Exception{
        SingeLinkedList singLL = new SingeLinkedList();

        singLL.addFirst("A");
        singLL.addLast("B");
        singLL.insertAfer("B", "D");
        singLL.insertBefore("D", "C");
        singLL.inserAt(4, "E"); 
        singLL.print();

        System.out.println("Data head adalah = "+singLL.getData(singLL.indexOf(singLL.head.data)));
    }
}
