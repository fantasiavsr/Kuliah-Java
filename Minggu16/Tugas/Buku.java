package Minggu16.Tugas;

public class Buku {
    int isbn, terbit;
    String judul, penerbit;

    Buku(int isbn, String judul, String penerbit, int terbit){
        this.isbn = isbn;
        this.judul = judul;
        this.penerbit = penerbit;
        this.terbit = terbit;
    }

    @Override
    public String toString(){
        return "Buku{"+"Isbn: "+isbn+", Judul: "+judul+", penerbit: "+penerbit+", Terbit: "+terbit+"}";
    }
}
