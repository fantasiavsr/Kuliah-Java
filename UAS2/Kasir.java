package UAS2;
import java.util.Scanner;

public class Kasir {

    public static void menu(){
        System.out.println("======================================");
        System.out.println("Sistem Transaksi Barang");
        System.out.println("======================================");
        System.out.println("Pilih menu: ");
        System.out.println("1. Input Transaksi");
        System.out.println("2. Tampil Seluruh Data Transaksi");
        System.out.println("3. Urutkan data transaksi");
        System.out.println("4. Exit");
        System.out.println("======================================");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        LinkedList bll = new LinkedList();

        //data awal
        Barang b1 = new Barang(1, "Buku", 6000, 30);
        Barang b2 = new Barang(2, "Pensil", 2000, 40);
        Barang b3 = new Barang(3, "Penggaris", 7000, 20);
        Barang b4 = new Barang(4, "Bolpoin", 5000, 50);
        Barang b5 = new Barang(5, "Spidol", 10000, 50);

        bll.addLast(b1);
        bll.addLast(b2);
        bll.addLast(b3);
        bll.addLast(b4);
        bll.addLast(b5);

        int kodeT = 0;

        LinkedList2 tll = new LinkedList2();

        do{
            menu();
            int pilih = sc.nextInt();
            sc.nextLine();

            switch(pilih){
                case 1:
                    
                    
                    System.out.println("Input Transaksi");
                    System.out.println("======================================");
                    //print barang
                    bll.print();
                    System.out.println("--------------------------------------");
                    System.out.print("Masukan Kode Barang: ");
                    int kodeB = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Masukan Jumlah Barang: ");
                    int jumBarang = sc.nextInt();
                    sc.nextLine();
                    kodeT++;
                    int total = bll.getHarga(kodeB)*jumBarang;

                    Transaksi t = new Transaksi(kodeT, jumBarang, total, bll.getNama(kodeB));
                    tll.addLast(t);
                    System.out.println();
                    System.out.println("List Transaksi");
                    System.out.println("======================================");
                    tll.print();
                    System.out.println("======================================");
                    System.out.println("Berhasil Diisi");
                    System.out.println();

                    break;
                    
                case 2:
                    System.out.println("List Transaksi");
                    System.out.println("======================================");
                    tll.print();
                    System.out.println("======================================");
                    System.out.println();
                    break; 

                case 3:
                    tll.print2();
                    break;  

                case 4:
                    exit = true;
                    break;
            }

        }while(!exit);
        sc.close();
    }
}
