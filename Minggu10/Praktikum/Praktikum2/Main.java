package Minggu10.Praktikum.Praktikum2;
import java.util.Scanner;

public class Main {
    public static void menu(){
        System.out.println("Pilih menu:");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Cek semua terbelakang");
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;

        System.out.print("Masukkan kapasiste queue: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Queue antri = new Queue(jumlah);

        do{
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch(pilih){
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kota asal: ");
                    String asal = sc.nextLine();
                    System.out.print("Kota tujuan: ");
                    String tujuan = sc.nextLine();
                    System.out.print("Jumlah tiket: ");
                    int jml = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Jumlah harga: ");
                    int hrg = sc.nextInt();
                    sc.nextLine();

                    Penumpang p = new Penumpang(nama, asal, tujuan, jml, hrg);
                    antri.enqueue(p);

                    break;
                case 2:
                    Penumpang data = antri.dequeue();
                    if(!"".equals(data.nama) && !"".equals(data.kotaAsal) && !"".equals(data.kotaTujuan) 
                    && data.jumlahTiket != 0 && data.harga != 0){
                        System.out.println("Antrian yang keluar adalah: "+data.nama+" "+data.kotaAsal+" "+data.kotaTujuan
                        +data.jumlahTiket+" "+data.harga);
                    }
                    break;
                case 3:
                    antri.peek();
                    break;
                
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
            }

        }while(pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
        sc.close();
    }
}
