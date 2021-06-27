package Minggu12.Tugas.Tugas2;
import java.util.Scanner;

public class Main {
    public static void menu(){
        System.out.println("====================================================");
        System.out.println("DATA BUKU PERPUSTAKAN");
        System.out.println("====================================================");
        System.out.println("1. Entry Judul Buku");
        System.out.println("2. Ambil buku Teratas");
        System.out.println("3. Cek Buku Teratas");
        System.out.println("4. Info Semua Buku");
        System.out.println("5. Exit");
        System.out.println("====================================================");
    }
    public static void main(String[] args) throws Exception {
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        Stack stk = new Stack();

        do{
            menu();
            int pilih = sc.nextInt();
            sc.nextLine();

            switch(pilih){
                case 1://push
                    System.out.println("----------------------------------------------------");
                    System.out.println("Masukkan Judul Buku");
                    System.out.println("----------------------------------------------------");
                    String x1 = sc.nextLine();
                    stk.push(x1);
                    break;
                    
                case 2://pop
                    System.out.println("----------------------------------------------------");
                    System.out.println("Buku Teratas Telah Diambil");
                    System.out.println("----------------------------------------------------");
                    stk.pop();
                    break;

                case 3://peek
                    System.out.println("----------------------------------------------------");
                    System.out.println("Cek Buku Teratas");
                    System.out.println("----------------------------------------------------");
                    stk.peek();
                    break;  

                case 4://hapus data pertama
                    stk.print();
                    break;

                case 5://hapus data terakhir
                        exit = true;
                    break;
            }
        }while(!exit);
        sc.close();
    }
}
