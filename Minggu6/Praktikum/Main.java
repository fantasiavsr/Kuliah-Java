package Minggu6.Praktikum;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa m1 = new Mahasiswa("Nusa", 2017, 25, 3);
        Mahasiswa m2 = new Mahasiswa("Rara", 2012, 19, 4);
        Mahasiswa m3 = new Mahasiswa("Dompu", 2018, 19, 3.5);
        Mahasiswa m4 = new Mahasiswa("Abdul", 2017, 23, 2);
        Mahasiswa m5 = new Mahasiswa("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting =");
        list.tampil();

        // System.out.println("Data mahasiswa sesusdah sorting berdasarkan ipk=");
        // list.bubbleSort();
        //list.tampil();

        //System.out.println("Data mahasiswa sesusdah sorting asc berdasarkan ipk=");
        //list.selectionSort();
        //list.tampil();

        System.out.print("Asecending / Descending? (0=asc/1=dsc):");
        char opt;
	    opt=sc.next().charAt(0);
        System.out.println();
        switch(opt){
            case '0':
                System.out.println("Data mahasiswa sesusdah sorting asc berdasarkan ipk=");
                list.insertionSort();
                list.tampil();
                sc.close();
                break;
            case '1':
                System.out.println("Data mahasiswa sesusdah sorting dsc berdasarkan ipk=");
                list.bubbleSort();;
                list.tampil();
                sc.close();
                break;
        }

        
    }
}
