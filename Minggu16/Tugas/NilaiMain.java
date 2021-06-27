package Minggu16.Tugas;
import java.util.*;

public class NilaiMain {
    public int findM(LinkedList<Mahasiswa> l, int f){
        for(int i = 0; i < l.size(); i++){
            if(l.get(i).nim == f){
                return i;
            }
        }
        return -1;
    }

    public int findMK(LinkedList<MataKuliah> l, int f){
        for(int i = 0; i < l.size(); i++){
            if(l.get(i).kode == f){
                return i;
            }
        }
        return -1;
    }

    public int findNL(LinkedList<Nilai> l, int f){
        for(int i = 0; i < l.size(); i++){
            if(l.get(i).nim== f){
                return i;
            }
        }
        return -1;
    }

    static class SortC implements Comparator<Nilai> {
        public int compare(Nilai ma1, Nilai ma2)
        {
            //return ma1.nim.compareTo(ma2.nim);
            return Double.compare(ma1.nim, ma2.nim);
            //return ma1.nim - ma1.nim;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NilaiMain nm = new NilaiMain();
        LinkedList <Mahasiswa> mh = new LinkedList<>();
        LinkedList <MataKuliah> mk = new LinkedList<>();
        LinkedList <Nilai> nl = new LinkedList<>();

        //dump data1
        Mahasiswa m1 = new Mahasiswa(2001, "Alif", "021xxx");
        Mahasiswa m2 = new Mahasiswa(2002, "Zubair", "021xxx");
        Mahasiswa m3 = new Mahasiswa(2003, "Abdurrahman", "021xxx");
        Mahasiswa m4 = new Mahasiswa(2004, "Sa'ad", "021xxx");
        Mahasiswa m5 = new Mahasiswa(2005, "Sa'id", "021xxx");
        Mahasiswa m6 = new Mahasiswa(2006, "Ubaidah", "021xxx");
        mh.add(m1);
        mh.add(m2);
        mh.add(m3);
        mh.add(m4);
        mh.add(m5);
        mh.add(m6);
        //dump data2
        MataKuliah mk1 = new MataKuliah(1, "Internet of Things", 3);
        MataKuliah mk2 = new MataKuliah(2, "Algoritma & Struktur Data", 3);
        MataKuliah mk3 = new MataKuliah(3, "Algoritma & Pemograman", 3);
        MataKuliah mk4 = new MataKuliah(4, "Praktikum Algoritma & Struktur Data", 3);
        MataKuliah mk5 = new MataKuliah(5, "Praktikum Algoritma & Pemograman", 3);
        mk.add(mk1);
        mk.add(mk2);
        mk.add(mk3);
        mk.add(mk4);
        mk.add(mk5);

        boolean exit = false;
        do{
            System.out.println("======================================");
            System.out.println("Sistem Pengolahan Data Nilai Mahasiswa");
            System.out.println("======================================");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data");
            System.out.println("5. Keluar");
            System.out.println("======================================");
            System.out.print("Pilih: ");
            int opt = sc.nextInt();
            sc.nextLine();

            switch(opt){
                case 1:
                    //input nilai
                    System.out.println("Masukkan Data:");

                    System.out.println("Daftar Mahasiswa");
                    System.out.println("======================================");
                    //print mahasiswa
                    for(int i = 0; i < mh.size(); i++){
                        System.out.println(mh.get(i).toString());
                    }
                    System.out.println("--------------------------------------");
                    System.out.print("Pilih Nim: ");
                    int nim = sc.nextInt();
                    System.out.println();
                    System.out.println("Daftar Mata Kuliah");
                    System.out.println("======================================");
                    //print matakuliah
                    for(int i = 0; i < mk.size(); i++){
                        System.out.println(mk.get(i).toString());
                    }
                    System.out.println("--------------------------------------");
                    System.out.print("Pilih Kode MK: ");
                    int kode = sc.nextInt();

                    System.out.print("Masukkan Nilai: ");
                    double nilai = sc.nextDouble();

                    Nilai n = new Nilai(mh.get(nm.findM(mh, nim)).nim, mh.get(nm.findM(mh, nim)).nama, 
                    mk.get(nm.findMK(mk, kode)).nama, mk.get(nm.findMK(mk, kode)).sks, nilai);

                    nl.add(n);
                    break;
                case 2:
                    System.out.println("Daftar Nilai Mahasiswa");
                    System.out.println("======================================");
                    //print daftar nilai
                    for(int i = 0; i < nl.size(); i++){
                        System.out.println(nl.get(i).toString());
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Masukkan NIM: ");
                    int x= 0;
                    nim = sc.nextInt();
                    for(int i = 0; i < nl.size(); i++){
                        if(nl.get(i).nim == nim){
                            System.out.println(nl.get(i).toString());
                            x += nl.get(i).sks;
                        }
                    }
                    System.out.print("Total SKS yang diambil: "+x);
                    System.out.println();
                    break;
                case 4:
                    Collections.sort(nl, new SortC());
                    System.out.println("Daftar berhasil diurutkan.");
                    System.out.println();
                    System.out.println("Daftar Nilai Mahasiswa");
                    System.out.println("======================================");
                    for(int i = 0; i < nl.size(); i++){
                        System.out.println(nl.get(i).toString());
                    }
                    System.out.println();
                    break;
                case 5:
                    exit = true;
                    break;
            }
        }while(!exit);
        sc.close();
    }
}
