package Minggu14.Tugas;

public class BinaryTreeMain2 {
    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();
        //int [] data = {6,4,8,3,7,9,0,0,0};
        //int idxLast = 6;
        bta.add(6);
        bta.add(4);
        bta.add(8);
        bta.add(3);
        bta.add(7);
        bta.add(9);
        bta.add(0);
        bta.add(0);
        bta.add(0);
        System.out.println("InOrder: ");
        bta.traverseInOrder(0);
        System.out.println();
        System.out.println("PreOrder: ");
        bta.traversePreOrder(0);
        System.out.println();
        System.out.println("PostOrder: ");
        bta.traversePostOrder(0);
    }
}
