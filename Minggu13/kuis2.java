package Minggu13;
import java.util.Scanner;

public class kuis2 {
    // Nama: Muhamad Alif Rizki
    // Kelas: TI 1A/14
    // NIM: 2041720196

    public static void menu(){
        System.out.println("Pilih menu: ");
        System.out.println("1. Tambah Antrian (enqueue-addLast)");
        System.out.println("2. Pemanggilan Antrian (dequeue)");
        System.out.println("3. Cetak Antrian");
        System.out.println("4. Exit");
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        QueueSLL qsll = new QueueSLL();

        //data awal
        imigrasi a1 = new imigrasi("Alif", 20);
        imigrasi a2 = new imigrasi("Riski", 17);
        imigrasi a3 = new imigrasi("Alia", 4);
        imigrasi a4 = new imigrasi("Darmawan", 17);
        imigrasi a5 = new imigrasi("Tio", 58);

        qsll.enqueue(a1);
        qsll.enqueue(a2);
        qsll.enqueue(a3);
        qsll.enqueue(a4);
        qsll.enqueue(a5);

        do{
            menu();
            int pilih = sc.nextInt();
            sc.nextLine();

            switch(pilih){
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    imigrasi im = new imigrasi(nama, usia);

                    qsll.enqueue(im);
                    break;
                    
                case 2:
                    qsll.dequeue();
                    break;

                case 3:
                qsll.printList();
                    break;  

                case 4:
                    exit = true;
                    break;
            }

        }while(!exit);
        sc.close();
    }
}
