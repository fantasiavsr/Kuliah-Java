package Minggu14.Praktikum;

public class BinaryTreeMain2 {
    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();
        int [] data = {6,4,8,3,7,9,0,0,0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        bta.traverseInOrder(0);
    }
}
