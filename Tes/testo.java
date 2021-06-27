package Tes;
import java.io.IOException;  

public class testo {
    public static void main(String[] args)throws IOException, InterruptedException {
        System.out.println("Dodo Ganteng");
        System.out.println("Dodo Ganteng");
        System.out.println("Dodo Ganteng");
        System.out.println("Dodo Ganteng");
        System.out.println("Dodo Ganteng");
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        System.out.println("Dodo Dodo");
    }
}
