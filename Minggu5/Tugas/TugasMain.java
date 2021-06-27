package Minggu5.Tugas;
import java.util.Scanner;

public class TugasMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==========================");
        System.out.print("Masukkan jumlah mahasiswa: ");
        int x = sc.nextInt();
        sc.nextLine();

        NilaiAlgoritma[] mh = new NilaiAlgoritma[x];
        
        for(int i = 0; i < x; i++){
            mh[i] = new NilaiAlgoritma();
            System.out.println("--------------------------");
            System.out.println("Masukkan data mahasiswa ke-"+(i+1));
            
            System.out.print("Masukkan nama mahasiswa: ");
            mh[i].namaMhs = sc.nextLine();
            System.out.print("Masukkan nilai tugas: ");
            mh[i].nilaiTugas = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan nilai kuis: ");
            mh[i].nilaiKuis = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan nilai UTS: ");
            mh[i].nilaiUTS = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan nilai UAS: ");
            mh[i].nilaiUAS = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("==========================");
        System.out.println("Total Nilai Mahasiswa");
        System.out.println("--------------------------");
        for(int i = 0; i < x; i++){
            System.out.println("Nama: "+mh[i].namaMhs);
            System.out.println("Total nilai: "+mh[i].hitungTotal(mh[i].nilaiTugas, mh[i].nilaiKuis, mh[i].nilaiUTS, mh[i].nilaiUAS));
            System.out.println("--------------------------");
        }

        double rata;
        double temp=0;
        for(int i = 0; i < x; i++){
            temp += mh[i].hitungTotal(mh[i].
            nilaiTugas, mh[i].nilaiKuis, mh[i].nilaiUTS, mh[i].nilaiUAS);
        }
        rata = temp/x;

        System.out.println("Rata-rata: "+rata);
        System.out.println("==========================");
        sc.close();
    }
}
