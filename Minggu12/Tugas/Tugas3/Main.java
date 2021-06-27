package Minggu12.Tugas.Tugas3;
import java.util.Scanner;

public class Main {
    public static void menu(){
        System.out.println("====================================================");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("====================================================");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Exit");
        System.out.println("====================================================");
    }
    public static void main(String[] args) throws Exception {
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        QDLL qdll = new QDLL();

        do{
            menu();
            int pilih = sc.nextInt();
            sc.nextLine();

            switch(pilih){
                case 1://enqueue
                    System.out.println("----------------------------------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("----------------------------------------------------");
                    System.out.println("Nomor Antrian: ");
                    String no = sc.nextLine();
                    System.out.println("Nama Penerima: ");
                    String nama = sc.nextLine();
                    Vaksin data = new Vaksin(no, nama);
                    qdll.enqueue(data);
                    break;
                    
                case 2://dequeue
                    System.out.println(qdll.dequeue()+" telah selesai divaksinasi.");
                    break;

                case 3://print
                    System.out.println("----------------------------------------------------");
                    System.out.println("Daftar Penerima Vaksin");
                    System.out.println("----------------------------------------------------");
                    qdll.print();
                    System.out.println("Sisa Antrian: "+qdll.size);
                    break;  

                case 4://hapus data pertama
                    exit = true;
                    break;
            }
        }while(!exit);
        sc.close();
    }
}
