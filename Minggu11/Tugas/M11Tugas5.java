package Minggu11.Tugas;
import java.util.Scanner;

public class M11Tugas5 {
    public static void menu(){
        System.out.println("Pilih menu: ");
        System.out.println("1. Masukkan Antrian Nasabah Baru");
        System.out.println("2. Cek Antrian Terdepan");
        System.out.println("3. Cek Antrian Terbelakang");
        System.out.println("4. Keluarkan Antrian Nasabah");
        System.out.println("5. Print Antrian Nasabah");
        System.out.println("6. Exit");
        System.out.println("-------------------------------");
    }
    public static void main(String[] args) {
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        QueueSLL qsll = new QueueSLL();

        do{
            menu();
            int pilih = sc.nextInt();
            sc.nextLine();

            switch(pilih){
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = sc.nextLine();
                    System.out.print("No Rekening: ");
                    int noRek = sc.nextInt();
                    sc.nextLine();
                    nasabahBank n = new nasabahBank(nama, alamat, noRek);
                    qsll.enqueue(n);
                    break;
                    
                case 2:
                    qsll.peek();
                    break;

                case 3:
                    qsll.peekRear();
                    break;  

                case 4:
                    qsll.dequeue();
                    break;
                
                case 5:
                    qsll.printList();
                    break;

                case 6:
                    exit = true;
                    break;

            }

        }while(!exit);
        sc.close();
    }
}
