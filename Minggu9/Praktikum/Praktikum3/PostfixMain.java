package Minggu9.Praktikum.Praktikum3;
import java.util.Scanner;

public class PostfixMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p, q;

        System.out.println("Masukkan ekspresi amtematika (infix): ");
        q = sc.nextLine();
        q = q.trim();
        q = q + ")";

        int total = q.length();

        Postfix post = new Postfix(total);
        p = post.konversi(q);
        System.out.println("Postfix: "+ p);

        sc.close();
    }
}
