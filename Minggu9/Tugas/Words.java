package Minggu9.Tugas;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split("");

        //System.out.println(words[0]); //cek split

        StackWords stk = new StackWords(words.length);

        for(int i = 0; i < words.length; i++){
            stk.push(words[i]);
        }

        for (int i = 0; i < words.length; i++){ 
            String ch = stk.pop();
            stk.push(ch);
        }
        stk.print();
        sc.close();
    }
}
