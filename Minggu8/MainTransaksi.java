package Minggu8;
import java.util.Scanner;
public class MainTransaksi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        
        //data Rekening
        RekeningService listx = new RekeningService();
        Rekening tx1 = new Rekening("16100617 0573", "Malcolm", "Keane Floyd", "623-0234", "porttitor.tellus.non@Curabitur.ca", 3);
        Rekening tx2 = new Rekening("16100617 0573", "Fuller", "Finn Dunlap", "571-7062", "convallis@Vestibulumanteipsum.org", 2);
        Rekening tx3 = new Rekening("16100617 0573", "Darius", "Julian Daniel", "1-357-843-0547", "nec@lectusjusto.org", 1);
        Rekening tx4 = new Rekening("16100617 0573", "Troy", "Damon Guerra", "897-7608", "pede.Suspendisse.dui@a.ca", 4);
        Rekening tx5 = new Rekening("16100617 0573", "Walter", "Seth Drake", "863-8209", "Pellentesque.ut.ipsum@neque.ca", 5);
        
        listx.add(tx1);
        listx.add(tx2);
        listx.add(tx3);
        listx.add(tx4);
        listx.add(tx5);

        //data Transaksi
        TransaksiService list = new TransaksiService();
        Transaksi t1 = new Transaksi("16100617 0573", 205420, 200162, 775880, "2021-06-25 10:23:00");
        Transaksi t2 = new Transaksi("16240401 2243", 838632, 350929, 328316, "2021-09-18 23:00:04");
        Transaksi t3 = new Transaksi("16270525 0112", 230659, 204434, 690503, "2022-02-02 19:10:34");
        Transaksi t4 = new Transaksi("16460329 4259", 816129, 851403, 597842, "2021-07-18 19:41:20");
        Transaksi t5 = new Transaksi("16180729 7229", 297103, 396116, 779589, "2021-07-03 01:09:49");

        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
        list.add(t5);

        do{
            System.out.println("Pilih Menu: ");
            System.out.println("1. Tampil Data Rekening");
            System.out.println("2. Tampil Data Transaksi");
            System.out.println("3. Mencari saldo > 500000");
            System.out.println("4. Sorting by name");
            System.out.println("5. Exit");
            System.out.print("Pilih: ");
            char opt;
            opt=sc.next().charAt(0);

            switch(opt){
                case '1':
                    listx.showAll();
                    System.out.println();
                    break;
                case '2':
                    list.showAll();
                    System.out.println();
                    break;
                case '3':
                    list.showLebih();
                    System.out.println();
                    break;

                case '4':
                    listx.insertionSort();
                    listx.showAll();
                    break;
                case '5':
                    exit=true;
                    break;
            }
        }while (!exit);
        sc.close();
    }
}
