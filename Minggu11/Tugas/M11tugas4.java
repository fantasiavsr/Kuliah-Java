package Minggu11.Tugas;
import java.util.Scanner;;

public class M11tugas4 {
    public static void menu(){
        System.out.println("Pilih menu: ");
        System.out.println("1. Buat Data Nasabah Baru");
        System.out.println("2. Hapus Data Nasabah");
        System.out.println("3. Print Data Nasabah");
        System.out.println("4. Exit");
        System.out.println("-------------------------------");
    }
    public static void main(String[] args) {
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        SLL singLL = new SLL();

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
                    singLL.addLast(n);
                    break;

                case 2:
                    System.out.print("Masukkan No Rekening yang akan dihapus: ");
                    int key = sc.nextInt();
                    sc.nextLine();
                    singLL.remove(key);
                    break;
                
                case 3:
                    singLL.printList();
                    break;

                case 4:
                    exit = true;
                    break;
            }
        }while(!exit);

        sc.close();
    }
}
