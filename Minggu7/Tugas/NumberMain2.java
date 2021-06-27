package Minggu7.Tugas;
import java.util.Scanner;

public class NumberMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SearchNumber2 data = new SearchNumber2();

        System.out.println("-------------------------------------------------------");
        System.out.println("Masukkan data dari");
        for(int i = 0; i < 10; i++){
            System.out.println("---------------------");
            System.out.print("Number\t: ");
            int number = sc.nextInt();
            Number n = new Number(number);
            data.add(n);
        }

        System.out.println("-------------------------------------------------------");
        System.out.println("Data keseluruhan: ");
        data.show();

        int posisi = data.findBinarySearch(0, 9);
        System.out.println("-------------------------------------------------------");
        data.showPosition(90, posisi);
        //data.showData(90, posisi);
        sc.close();
    }
}
// 12 17 2 1 70 50 90 17 2 90