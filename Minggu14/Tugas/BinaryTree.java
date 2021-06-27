package Minggu14.Tugas;

public class BinaryTree {
    Node root;

    public BinaryTree(){
        root = null;
    }

    boolean isEmpty(){
        return root == null;
    }

    void add(int data){
        if(isEmpty()){
            root = new Node(data);
        }else{
            Node current = root;
            while(true){
                if(data < current.data){
                    if(current.left != null){
                        current = current.left;
                    }else{
                        current.left = new Node(data);
                        break;
                    }
                }else if(data > current.data){
                    if(current.right != null){
                        current = current.right;
                    }else{
                        current.right = new Node(data);
                        break;
                    }
                }else{
                    break;
                }
            }
        }
    }

    boolean find(int data){
        boolean hasil = false;
        Node current = root;
        while(current != null){
            if(current.data == data){
                hasil = true;
                break;
            }else if(data < current.data){
                current = current.left;
            }else{
                current = current.right;
            }
        }
        return hasil;
   }

   void traversePreOrder(Node node){
       if(node != null){
           System.out.print(" "+node.data);
           traversePreOrder(node.left);
           traversePreOrder(node.right);
       }
   }

   void traversePostOrder(Node node){
        if(node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" "+node.data);
        }
    }

    void traverseInOrder(Node node){
        if(node != null){
            traverseInOrder(node.left);
            System.out.print(" "+node.data);
            traverseInOrder(node.right);
        }
    }

    Node getSuccessor(Node del){
        Node successor = del.right;
        Node successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor!=del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data){
        if (isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }
        
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        while(current!=null){
            if (current.data==data) {
                break;
            }else if(data<current.data){
                parent = current;
                current = current.left;
                isLeftChild = true;
            }else if (data>current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        
        if (current==null) {
            System.out.println("Couldn't find data");
            return;
        }else{
            if (current.left== null && current.right == null) {//if no child
                if (current == root) {
                    root = null;
                }else{
                    if (isLeftChild) {
                        parent.left = null;
                    }else{
                        parent.right = null;
                    }
                }
            }
            else if (current.left == null) {//if 1 child right
                if(current == root){
                    root = current.right;
                }else{
                    if (isLeftChild) {
                        parent.left = current.right;
                    }else{
                        parent.right = current.right;
                    }
                }
            }else if(current.right == null){// if 1 child left
                if (current==root) {
                    root = current.left;
                }else{
                    if (isLeftChild) {
                        parent.left = current.left;
                    }else{
                        parent.right = current.left;
                    }
                }
            }else{//if 2 child
                Node successor = getSuccessor(current);
                if (current==root) {
                    root = successor;
                }else{
                    if (isLeftChild) {
                        parent.left = successor;
                    }else{
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    void addRecursive(int data){
        root = addRe(root, data);
    }

    Node addRe(Node root, int data){
        if(root == null){
            root = new Node();
            root.data = data;
            return root;
        }
        if(root.data < data) {
            root.right = addRe(root.right,data);
        } else {
            root.left = addRe(root.left, data);
        }
        return root;
    }

    int findMax(Node r){
        if (r == null)
            return Integer.MIN_VALUE;
        
        int cari = r.data;

        int lcari = findMax(r.left);
        int rcari = findMax(r.right);

        if (lcari > cari)
            cari = lcari;
        if (rcari > cari)
            cari = rcari;

        return cari;
    }

    int findMin(Node r){
        if (r == null)
            return Integer.MAX_VALUE;
        
        int cari = r.data;

        int lcari = findMin(r.left);
        int rcari = findMin(r.right);

        if (lcari < cari)
            cari = lcari;
        if (rcari < cari)
            cari = rcari;

        return cari;
    }

    void printLeaf(Node root){
        if (root == null){
            return;
        }

        if(root.left == null && root.right == null){
            System.out.print(root.data+" ");
            return;
        }

        if (root.left != null)
        printLeaf(root.left);
        if (root.right != null)
        printLeaf(root.right);
    }

    int countLeaf(Node node){
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return 1;
        else
            return countLeaf(node.left) + countLeaf(node.right);
    }

}
