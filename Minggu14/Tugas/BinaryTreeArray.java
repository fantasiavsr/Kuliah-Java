package Minggu14.Tugas;

public class BinaryTreeArray {
    int data[];
    int idxLast = 0;
    int i = 0;
    
    public BinaryTreeArray(){
        data = new int [10];
    }
    
    void add(int data){
        if(data != 0){
            this.data[i] = data;
            i++;
            idxLast++;
        }
        
    }

    void populateData(int data[], int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }
    
    void traverseInOrder(int idxStart){
        if(idxStart<=idxLast){
            traverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart]+" ");
            traverseInOrder(2*idxStart+2);
        }
    }

    void traversePreOrder(int idxStart){
        if(idxStart<=idxLast){
            System.out.print(data[idxStart]+" ");
            traversePreOrder(2*idxStart+1);
            traversePreOrder(2*idxStart+2);
        }
    }

    void traversePostOrder(int idxStart){
        if(idxStart<=idxLast){
            traversePostOrder(2*idxStart+1);
            traversePostOrder(2*idxStart+2);
            System.out.print(data[idxStart]+" ");
        }
    }
}
