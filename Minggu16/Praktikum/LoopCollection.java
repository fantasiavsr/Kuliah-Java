package Minggu16.Praktikum;
import java.util.*;

public class LoopCollection {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.push("Salak");

        for(String fruit : fruits){
            System.out.print(fruit+" ");
        }
        System.out.println();
        System.out.println(fruits.toString()+" ");

        while(!fruits.empty()){
            System.out.print(fruits.pop()+" ");
        }
        System.out.println();

        fruits.push("Melon");
        fruits.push("Durian");

        for(Iterator<String> it = fruits.iterator(); it.hasNext();){
            String fruit = it.next();
            System.out.print(fruit+" ");
        }
        System.out.println();

        fruits.stream().forEach(e -> {
            System.out.print(e+" ");
        });
        System.out.println();

        for(int i = 0; i < fruits.size(); i++){
            System.out.print(fruits.get(i)+" ");
        }
        System.out.println();

        fruits.add(fruits.size(), "Strawberry");
        System.out.println(fruits.toString()+" ");
        System.out.println();

        fruits.push("Mango");
        fruits.push("Guava");
        fruits.push("Avocado");
        System.out.println("Data seebelum sorting:");
        System.out.println(fruits.toString()+" ");
        Collections.sort(fruits);
        System.out.println("Data setelah sorting:");
        System.out.println(fruits.toString()+" ");
    }
}
