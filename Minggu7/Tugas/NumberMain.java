package Minggu7.Tugas;
import java.util.Scanner;

public class NumberMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int total = 5;

        SearchNumber data = new SearchNumber();

        System.out.println("-------------------------------------------------------");
        System.out.println("Masukkan data dari");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
            System.out.println("---------------------");
            System.out.print("Number\t: ");
            int number = sc.nextInt();
            Number n = new Number(number);
            data.add(n);
            }
        }

        System.out.println("-------------------------------------------------------");
        System.out.println("Data keseluruhan: ");
        data.show();

        System.out.println("-------------------------------------------------------");
        System.out.println("Pencarian Data");
        System.out.print("Masukkan angka yang dicari: ");
        int cari = sc.nextInt();
        //int position;
        data.findSeqSearch(cari);

        data.showPosition(cari, data.rowPos, data.colPos);
        //data.showData(cari, data.rowPos, data.colPos);

        sc.close();
    }
}

//1 2 7 17 18 21 40 45 50 65 78 80 90 100 200 