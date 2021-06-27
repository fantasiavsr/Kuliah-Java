package Minggu7.Praktikum;
import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumMhs = 5;
        PencarianMhs data = new PencarianMhs();

        System.out.println("-------------------------------------------------------");
        System.out.println("Masukkan data mahasiswa");
        for(int i = 0; i < jumMhs; i++){
            System.out.println("---------------------");
            System.out.print("Nim\t: ");
            int nim = sc.nextInt();
            sc.nextLine();
            System.out.print("Nama\t: ");
            String nama = sc.nextLine();
            System.out.print("Umur\t: ");
            int umur = sc.nextInt();
            sc.nextLine();
            System.out.print("IPK\t: ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }

        data.bubbleSort();

        System.out.println("-------------------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa: ");
        data.tampil();

        System.out.println("-------------------------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("Masukkan Nim mahasiswa yang dicari: ");
        System.out.print("Nim: ");
        int cari = sc.nextInt();
        sc.nextLine();

        System.out.println("Masukkan Nama mahasiswa yang dicari: ");
        System.out.print("Nama: ");
        String cari2 = sc.nextLine();

        System.out.println("-------------------------------------------------------");
        System.out.println("Menggunakan sequential search");
        int posisi = data.findSeqSearch(cari2);

        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);

        System.out.println("-------------------------------------------------------");
        System.out.println("Menggunakan binary search");
        posisi = data.findBinarySearch(cari, 0, jumMhs-1);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);

        sc.close();
    }
}
