package Minggu12.Tugas.Tugas4;
import java.util.Scanner;

public class Main {
    public static void menu(){
        System.out.println("====================================================");
        System.out.println("DATA MAHASISWA");
        System.out.println("====================================================");
        System.out.println("1. Tambah Data Awal");
        System.out.println("2. Tambah Data Akhir");
        System.out.println("3. Tambah Data Index Tertentu");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Terakhir");
        System.out.println("6. Hapus Data Tertentu");
        System.out.println("7. Cetak");
        System.out.println("8. Cari NIM");
        System.out.println("9. Urut Data IPK-DESC");
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
                    System.out.println("Masukkan Data Mahasiswa Posisi Awal");
                    System.out.print("NIM: ");
                    int nim = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("IPK: ");
                    double ipk = sc.nextDouble();
                    sc.nextLine();

                    Mahasiswa item = new Mahasiswa(nama, nim, ipk);
                    dll.addFirst(item);
                    
                    break;
                    
                case 2://tambah tail
                    System.out.println("Masukkan Data Mahasiswa Posisi Akhir");
                    System.out.print("NIM: ");
                    nim = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama: ");
                    nama = sc.nextLine();
                    System.out.print("IPK: ");
                    ipk = sc.nextDouble();
                    sc.nextLine();

                    item = new Mahasiswa(nama, nim, ipk);
                    dll.addLast(item);
                    
                    break;

                case 3://tambah data
                    System.out.println("Masukkan Data Mahasiswa Posisi Tertentu");
                    System.out.print("NIM: ");
                    nim = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama: ");
                    nama = sc.nextLine();
                    System.out.print("IPK: ");
                    ipk = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Data Mahasiswa Ini akan Dimasukkan di Dalam Urutan ke: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    System.out.println(index);
                    item = new Mahasiswa(nama, nim, ipk);
                    dll.add(item, index);
                    
                    break;  

                case 4://hapus data pertama
                    dll.removeFirst();
                    break;
                
                case 5://hapus data terakhir
                    dll.removeLast();
                    break;

                case 6://hapus data tertentu
                    System.out.println("Hapus Data");
                    System.out.println("Hap;us Data pada Urutan ke-");
                    int n1 = sc.nextInt();
                    sc.nextLine();
                    dll.remove(n1);
                    break;

                case 7://cetak
                    dll.print();
                    break;

                case 8://cari
                    System.out.println("Cari Data");
                    System.out.print("Masukkan Data yang Dicari: ");
                    int cari = sc.nextInt();
                    System.out.println("Data "+cari+" berada di urutan ke-"+(dll.search(cari)+1));
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
