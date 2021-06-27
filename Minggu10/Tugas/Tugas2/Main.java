package Minggu10.Tugas.Tugas2;
import java.util.Scanner;

public class Main {
    public static void menu(){
        System.out.println("Pilih menu:");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek antrian terbelakang");
        System.out.println("5. Cek semua antrian");
        System.out.println("6. Cek antrian ke-berapa");
        System.out.println("7. Tampilkan berdasarkan posisi");
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;

        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Queue antri = new Queue(jumlah);

        do{
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch(pilih){
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Absen: ");
                    int absen = sc.nextInt();
                    sc.nextLine();
                    System.out.print("IPK: ");
                    double ipk = sc.nextDouble();
                    sc.nextLine();

                    Mahasiswa p = new Mahasiswa(nim, nama, absen, ipk);
                    antri.enqueue(p);

                    break;
                case 2:
                    Mahasiswa data = antri.dequeue();
                    if(!"".equals(data.nim) && !"".equals(data.nama) && data.absen != 0 && data.ipk != 0){
                        System.out.println("Antrian yang keluar adalah: "+data.nim+" "+data.nama+" "+data.absen
                        +data.ipk);
                    }
                    break;
                case 3:
                    antri.peek();
                    break;
                
                case 4:
                    antri.peekRear();
                    break;
                case 5:
                    antri.print();
                    break;

                case 6:
                    System.out.print("Masukkan nim yang dicari: ");
                    String cari = sc.nextLine();
                    antri.peekPosition(cari);
                break;

                case 7:
                    System.out.print("Masukkan posisi yang ingin dilihat: ");
                    int cari2 = sc.nextInt();
                    sc.nextLine();
                    antri.peekAt(cari2);
                break;
            }

        }while(pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
        sc.close();
    }
}
