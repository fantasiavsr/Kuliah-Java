package Minggu14.Tugas;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.addRecursive(6);
        //bt.add(6);
        bt.addRecursive(4);
        bt.addRecursive(8);
        bt.addRecursive(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        
        bt.traversePreOrder(bt.root);
        System.out.println();
        bt.traverseInOrder(bt.root);
        System.out.println();
        bt.traversePostOrder(bt.root);
        System.out.println();
        System.out.println("Find " + bt.find(5));
        bt.delete(8);
        bt.traversePreOrder(bt.root);
        System.out.println();

        System.out.println("Nilai Maximum: "+bt.findMax(bt.root));
        System.out.println("Nilai Minimum: "+bt.findMin(bt.root));
        System.out.print("Data Leaf: ");
        bt.printLeaf(bt.root);
        System.out.println();
        int jumLeaf = bt.countLeaf(bt.root);
        System.out.println("Banyak Data Leaf: "+jumLeaf);
    }
}
