package Minggu16.Praktikum;
import java.util.*;

public class ListMahasiswa {
    List<Mahasiswa> m = new ArrayList<>();

    public void tambah(Mahasiswa... mahasiswa){
        m.addAll(Arrays.asList (mahasiswa));
    }
        
    public void hapus(int index){
        m.remove(index) ;
    }
        
    public void update(int index, Mahasiswa mhs){
        m.set(index,mhs);
    }
        
    public void tampil(){
        m.stream().forEach(mhs ->{
                System.out.println("" + mhs.toString());
            }
        );
    }



    int linearSearch(String nim){
        for(int i =0; i < m.size(); i++){
            if(nim.equals(m.get(i).nim)){
                return i;
            }
        }
        return -1;
    }

    int binarySearch(String n){
        Comparator<Mahasiswa> c = new Comparator<Mahasiswa>() {
            public int compare(Mahasiswa ma1, Mahasiswa ma2)
            {
                return ma1.getNim().compareTo(ma2.getNim());
            }
        };

        int index = Collections.binarySearch(
            m, new Mahasiswa(n, null, null), c);
        System.out.println("Found at index  " + index);

        return index;
    }

    void sortASC(){
        Collections.sort(m, new SortC());
    }

    void sortDSC(){
        Collections.reverseOrder(new SortC());
    }

    public class SortC implements Comparator<Mahasiswa> {
        public int compare(Mahasiswa ma1, Mahasiswa ma2)
        {
            return ma1.getNim().compareTo(ma2.getNim());
        }
    }

    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");

        lm.tambah(m, m1, m2);
        lm.tampil();
        lm.update(lm.binarySearch("201235"), new Mahasiswa("201235", "Akhelma Leia", "021xx2"));
        //lm.update(lm.linearSearch("201235"), new Mahasiswa("201235", "Akhelma Leia", "021xx2"));
        System.out.println();
        lm.tampil();
        System.out.println();

        Mahasiswa m3 = new Mahasiswa("201234", "Alif", "021xx4");
        lm.tambah(m3);
        System.out.println("Data sebelum di Sorting: ");
        lm.tampil();
        System.out.println();

        lm.sortASC();
        System.out.println("Data setelah di Sorting: ");
        lm.tampil();
        //lm.update(lm.binarySearch("201235"), new Mahasiswa("201235", "Akhelma Leia", "021xx2"));
        
    }

}
