package Tes.tes001;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah kota: ");
        int n = sc.nextInt();
        sc.nextLine();
        Kota[] kt = new Kota[n];
        System.out.println();
        for(int i = 0; i < n; i++){
            System.out.print("Masukkan nama kota: ");
            String na = sc.nextLine();
            System.out.print("Masukkan skor limbah: ");
            int l = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan skor polusi air: ");
            int a = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan skor polusi udara: ");
            int u = sc.nextInt();
            sc.nextLine();

            kt[i] = new Kota(na, l, a, u);
            System.out.println();
            //System.out.println(kt[i].nama);
        }

        System.out.println("Nama Kota\tLimbah\t\tPolusi Air\tPolusi Udara\t\t");
        for(int i = 0; i < n; i++){
            kt[i].print();
        }
        sc.close();
    }
}
