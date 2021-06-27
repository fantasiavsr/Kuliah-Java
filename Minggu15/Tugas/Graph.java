package Minggu15.Tugas;
import java.util.*;

public class Graph {
    int vertex;
    LinkedList list[];

    public Graph(int vertex){
        this.vertex = vertex;
        list = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++){
            list[i] = new LinkedList();
        }
    }

    public void addEdge(int source, int destination){
        list[source].addFirst(destination);
        list[destination].addFirst(source);
    }

    public void degree(int source)throws Exception{
        System.out.println("degree vertex "+source+" : "+list[source].size());
        int k, totalIn = 0, totalOut=0;

        for(int i = 0; i < vertex; i++){
            for (int j = 0; j < list[i].size(); j++){
                if (list[i].get(j) == source) ++totalIn;
            }

            for (k = 0; k < list[source].size(); k++){
                list[source].get(k);
            }

            totalOut = k;
        }

        System.out.println("InDegree dari vertex " + source + " : " + totalIn);
        System.out.println("OutDegree dari vertex " + source + " : " + totalOut);
        System.out.println("Degree vertex " + source + " : " + (totalIn+totalOut));
    }

    public void removeEdge(int source, int destination)throws Exception{
        if(!graphType()){
            for(int i = 0; i < list[source].size; i++){
                if(list[source].get(i) == destination){
                    list[source].remove(i);
                    break;
                }
            }

            for(int i = 0; i < list[destination].size; i++){
                if(list[destination].get(i) == source){
                    list[destination].remove(i);
                    break;
                }
            }
        }
    }

    public void removeAllEdges(){
        if(!graphType()){
            for(int i = 0; i < vertex; i++){
                list[i].clear();
            }
            System.out.println("Graph Berhasil Dikosongkan");
        }
    }

    public void printGraph()throws Exception{
        if(!graphType()){
            for(int i = 0; i < vertex; i++){
                if (list[i].size()>0){
                    System.out.print("Vertex " + i + " terhubung dengan: ");
                    for (int j = 0; j < list[i].size(); j++) {
                        System.out.print(list[i].get(j) + " ");
                    }
                    System.out.println();
                }
            }
            System.out.println();
        }
    }

    public boolean graphType(){
        for(int i = 0; i < vertex; i++){
            if(list[i].head == null){
                return false;
            }
        }
        return true;
    }

    public void isDirected(){
        if(graphType()){
            System.out.println("Merupakan Directed Graph.");
        }else{
            System.out.println("Merupakan Undirected Graph.");
        }
    }

    public static void main(String[] args) throws Exception{
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah vertices: ");
        int v = sc.nextInt();
        Graph graph = new Graph(v);
        do{
            System.out.println();
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Graph Type");
            System.out.println("6. Exit");
            System.out.println("--------------------");
            char opt=sc.next().charAt(0);

            switch(opt){
                case '1':
                    System.out.println("Masukkan edge: <to> <from>");
                    int to = sc.nextInt();
                    int from = sc.nextInt();

                    graph.addEdge(to,from);
                    break;
                case '2':
                    System.out.println("Masukkan edge: <to> <from>");
                    to = sc.nextInt();
                    from = sc.nextInt();

                    graph.removeEdge(to,from);
                    break;
                case '3':
                    System.out.println("Masukkan vertex: ");
                    int src = sc.nextInt();
                    graph.degree(src);
                    break;
                case '4':
                    graph.printGraph();
                    break;
                case '5':
                    graph.isDirected();
                    break;
                case '6':
                    exit = true;
                    break;
            }
        }while(!exit);
        sc.close();
    }

}
