package Minggu7.Tugas;

public class PencarianMhs {
    int idx;
    
    Mahasiswa listMhs[] = new Mahasiswa[5];
        
    void tambah(Mahasiswa m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
             System.out.println("Data sudah penuh.");
        }
    }
    
    void tampil(){
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("----------------------");
        }
    }
    
    int findSeqSearch(String cari){
        int posisi=-1;
        for(int j = 0; j < listMhs.length; j++){
            if(listMhs[j].nama.equals(cari)){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(int x, int pos){
        if(pos != -1){
            System.out.println("Data: "+x+" ditemkukan pada indeks "+pos);
        }else{
            System.out.println("Data "+x+" tidak ditemukan.");
        }
    }

    void tampilPosisi2(String x, int pos){
        if(pos != -1){
            System.out.println("Data: "+x+" ditemkukan pada indeks "+pos);
        }else{
            System.out.println("Data "+x+" tidak ditemukan.");
        }
    }

    void tampilData(int x, int pos){
        if(pos != -1){
            System.out.println("Nim\t: "+listMhs[pos].nim);
            System.out.println("Nama\t: "+listMhs[pos].nama);
            System.out.println("Umur\t: "+listMhs[pos].umur);
            System.out.println("Ipk\t: "+listMhs[pos].ipk);
        }else{
            System.out.println("Data "+x+" tidak ditemukan.");
        }
    }

    int findBinarySearch(int cari, int left, int right){
        int mid;
        if(right >= left){
            mid = (left + right)/2;
            if(cari == listMhs[mid].nim){
                return (mid);
            }else if(listMhs[mid].nim > cari){
                return findBinarySearch(cari, left, mid-1);
            }else{
                return findBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }

    void bubbleSort(){
        for(int i = 0; i < listMhs.length-1; i++){
            for(int j=0; j < listMhs.length-i-1; j++){
                if(listMhs[j].nim > listMhs[j+1].nim){
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j+1];
                    listMhs[j+1] = tmp;
                }
            }
        }
    }
}
