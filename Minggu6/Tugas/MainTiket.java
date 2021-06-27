package Minggu6.Tugas;
//import java.util.Scanner;

public class MainTiket {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);

       TiketService list = new TiketService();
       Tiket t1 = new Tiket ("Lion Air", 1500000, "Malang", "Batam");
       Tiket t2 = new Tiket ("Sriwijaya Air", 900000, "Malang", "Jakarta");
       Tiket t3 = new Tiket ("AirAsia", 2000000, "Malang", "Singapura");
       Tiket t4 = new Tiket ("Citilink", 700000, "Malang", "Batam");
       Tiket t5 = new Tiket ("Garuda Indonesia", 750000, "Malang", "Bandung");

       list.tambah(t1);
       list.tambah(t2);
       list.tambah(t3);
       list.tambah(t4);
       list.tambah(t5);

       System.out.println("Data tiket sebelum sorting :");
       list.tampilAll();

       System.out.println("Data tiket yang sudah diurutkan sesuai harga: ");
       list.bubbleSort();;
       list.tampilAll();
       //sc.close();
    }
}
