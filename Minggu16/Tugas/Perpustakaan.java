package Minggu16.Tugas;
import java.util.*;

public class Perpustakaan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack <Buku> bk = new Stack<>();
        boolean exit = false;
        do{
            System.out.println("======================");
            System.out.println("Data Buku Perpustakaan");
            System.out.println("======================");
            System.out.println("1. Entry Judul Buku");
            System.out.println("2. Ambil Buku Teratas");
            System.out.println("3. Cek Buku Teratas");
            System.out.println("4. Info Semua Judul Buku");
            System.out.println("5. Keluar");
            System.out.println("======================");
            System.out.print("Pilih: ");
            int opt = sc.nextInt();
            sc.nextLine();

            switch(opt){
                case 1:
                    System.out.print("Isbn: ");
                    int isbn = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Judul: ");
                    String judul = sc.nextLine();
                    System.out.print("Terbit: ");
                    int terbit = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Penerbit: ");
                    String penerbit = sc.nextLine();

                    Buku b = new Buku(isbn, judul, penerbit, terbit);
                    bk.push(b);
                    break;
                case 2:
                    System.out.println(bk.pop().toString());
                    break;
                case 3:
                    System.out.println(bk.peek().toString());
                    break;
                case 4:
                    //System.out.println(Arrays.toString(bk.toArray()));
                    bk.stream().forEach(bu ->{
                        System.out.println("" + bu.toString());
                        }
                    );
                    break;
                case 5:
                        exit = true;
                    break;
            }
        }while(!exit);
        sc.close();
    }
}
