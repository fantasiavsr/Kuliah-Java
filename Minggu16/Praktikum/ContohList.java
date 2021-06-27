package Minggu16.Praktikum;
import java.util.*;

public class ContohList {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);

        for(int i =0; i < l.size();i++){
            System.out.print(l.get(i)+" ");
        }
        System.out.println();
        System.out.println("Elemen 0: "+l.get(0)+", Total Elemen: "+l.size()+
        ", Elemen 0: "+l.get(l.size()-1));

        l.add(4);
        l.remove(0);
        System.out.println("Elemen 0: "+l.get(0)+", Total Elemen: "+l.size()+
        ", Elemen 0: "+l.get(l.size()-1));

        LinkedList <String> names = new LinkedList<>();
        names.add("Noureen");
        names.add("Akhlemaa");
        names.add("Shannum");
        names.add("Uwais");
        names.add("Al-Qarni");

        System.out.println("Elemen 0: "+names.get(0)+", Total Elemen: "+names.size()+
        ", Elemen 0: "+names.get(names.size()-1));

        names.set(0, "My Kid");

        System.out.println("Elemen 0: "+names.get(0)+", Total Elemen: "+names.size()+
        ", Elemen 0: "+names.get(names.size()-1));

        System.out.println("Names: "+names.toString());
        System.out.println();
        
        names.push("Mei-mei");
        System.out.println("Elemen 0: "+names.get(0)+", Total Elemen: "+names.size()+
        ", Elemen 0: "+names.get(names.size()-1));

        System.out.println("Names: "+names.toString());

    }
}   
