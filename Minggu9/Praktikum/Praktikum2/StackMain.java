package Minggu9.Praktikum.Praktikum2;
import java.util.Scanner;;

public class StackMain {
    public static void main(String[] args) {
        Stack st = new Stack(8);

        Scanner sc = new Scanner(System.in);
        char pilih;
        boolean exit = false;
        do{
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. Exit");
            System.out.print("Pilih:");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            switch(pilih){
                case '1':
                    System.out.print("Judul: ");
                    String judul = sc.nextLine();
                    System.out.print("Nama pengarang: ");
                    String nama = sc.nextLine();    
                    System.out.print("Jumlah halaman: ");
                    int jml = sc.nextInt();    
                    System.out.print("Tahun terbit: ");
                    int thn = sc.nextInt();    
                    System.out.print("Harga: ");
                    int hrg= sc.nextInt();   
                    Buku bk = new Buku(judul, nama, thn, jml, hrg); 
                    st.push(bk);
                    break;
                case '2':
                    st.pop();
                    break;
                case '3':
                    st.peek();
                    break;
                case '4':
                    st.print();
                    break;
                case '5':
                    exit = true;
                    break;

            }  
        }while(!exit);
        sc.close();
    }
}
