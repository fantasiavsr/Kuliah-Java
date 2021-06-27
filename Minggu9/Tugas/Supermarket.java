package Minggu9.Tugas;
import java.util.Scanner;

public class Supermarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah struk: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("-----------------------------------");
        struk[] str = new struk[n];

        Stack stk = new Stack(n);

        for(int i = 0; i < n; i++){
            System.out.println("Struk "+(i+1));
            System.out.print("No. Transaksi: ");
            int no = sc.nextInt();
            sc.nextLine();
            System.out.print("Tanggal Transaksi: ");
            String tgl = sc.nextLine();
            System.out.print("Jumlah Barang: ");
            int jum = sc.nextInt();
            sc.nextLine();
            System.out.print("Total Harga Barang: ");
            int t = sc.nextInt();
            sc.nextLine();

            str[i] = new struk(no, tgl, jum, t);
            stk.push(i);
        }

        
        System.out.println("-----------------------------------");
        System.out.println("Data struk yang tersimpan: ");
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.println("Struk "+(i+1));
            str[stk.choose(i)].print();
            System.out.println();
        }

        System.out.println("-----------------------------------");
        System.out.println("PENUKARAN VOUCHER");
        System.out.println();
        System.out.print("Masukkan Jumlah Struk:");
        int y = sc.nextInt();

        n=n-y;

        for(int i = 0; i < y; i++){
            stk.pop();
        }

        System.out.println("-----------------------------------");
        System.out.println("Sisa data struk yang tersimpan: ");
        for(int i = 0; i < n; i++){
            System.out.println("Struk "+(i+1));
            str[stk.choose(i)].print();
            System.out.println();
        }

        if(n == 0){
            System.out.print("Struk sudah habis.");
            System.out.println();
        }

        sc.close();
    }
}
