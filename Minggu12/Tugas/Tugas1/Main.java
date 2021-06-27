package Minggu12.Tugas.Tugas1;
import java.util.Scanner;

public class Main {
    public static void menu(){
        System.out.println("====================================================");
        System.out.println("PROGRAM PENGOLAHAN ANGKA DENGAN DOUBLE LINKED LIST");
        System.out.println("====================================================");
        System.out.println("1. Tambah Head");
        System.out.println("2. Tambah Tail");
        System.out.println("3. Tambah Data");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari");
        System.out.println("9. Urut Data");
        System.out.println("10. Exit");
        System.out.println("====================================================");
    }
    public static void main(String[] args) throws Exception {
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        DoubleLinkedList dll = new DoubleLinkedList();

        do{
            menu();
            int pilih = sc.nextInt();
            sc.nextLine();

            switch(pilih){
                case 1://tambah head
                    System.out.println("Masukkan Data");
                    System.out.print("Data Node:");
                    int x1 = sc.nextInt();
                    dll.addFirst(x1);
                    break;
                    
                case 2://tambah tail
                    System.out.println("Masukkan Data");
                    System.out.print("Data Node:");
                    int x2 = sc.nextInt();
                    dll.addLast(x2);
                    break;

                case 3://tambah data
                    System.out.println("Masukkan Data");
                    System.out.print("Alamat Pointer:");
                    int n = sc.nextInt();
                    System.out.print("Data Node:");
                    int x3 = sc.nextInt();
                    dll.add(x3, n);
                    break;  

                case 4://hapus data pertama
                    dll.removeFirst();
                    break;
                
                case 5://hapus data terakhir
                    dll.removeLast();
                    break;

                case 6://hapus data tertentu
                    System.out.println("Hapus Data");
                    System.out.print("Alamat Pointer:");
                    int n1 = sc.nextInt();
                    dll.remove(n1);
                    break;

                case 7://cetak
                    dll.print();
                    break;

                case 8://cari
                    System.out.println("Cari Data");
                    System.out.print("Masukkan Data yang Dicari:");
                    int cari = sc.nextInt();
                    System.out.println("Data "+cari+" berada di urutan ke-"+dll.search(cari));
                    break;
                case 9://urut data
                    dll.sort();
                    break;

                case 10://exit
                    exit = true;
                    break;
            }
        }while(!exit);
        sc.close();
    }
}
