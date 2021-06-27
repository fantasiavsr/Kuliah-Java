package Minggu1;

import java.util.Scanner;

class soal4{
	
public static void main(String args[]){
		data();
		System.out.println("TERIMA KASIH");
}//end main

static void pilih(){
		System.out.println(" ");
		System.out.println("==================================");
		System.out.println("Menghitung Luas ");
		System.out.println("==================================");
		System.out.println("Pilihan Bangun: ");
		System.out.println("1. Segitiga");
		System.out.println("2. Persegi Panjang");
		System.out.println("3. Lingkaran");
		System.out.println("4. Exit");
		System.out.print("Pilih: ");
}//end pilih

static void data(){
		
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		
		
		do{//loop main menu
			pilih();
			char opt1;
			opt1=sc.next().charAt(0);
			
			switch(opt1){
				case '1':
					int a,l;
					double LuasSegitiga;
					
					System.out.println(" ");
					System.out.println("==================================");
					System.out.println("Menghitung Luas Segitiga");
					System.out.println(" ");
					System.out.print("Masukan Alas : ");
					a=sc.nextInt();
					System.out.print("Masukan Tinggi : ");
					l=sc.nextInt();
					LuasSegitiga=0.5*a*l;
					System.out.println("==================================");
					System.out.println("Luas Segitiga : "+LuasSegitiga);
					
					break;
					
				case '2':
					int i,f;
					double LuasPersegiP;
					
					System.out.println(" ");
					System.out.println("=================================");
					System.out.println("Menghitung Luas Persegi Panjang");
					System.out.println(" ");
					System.out.print("Masukan Panjang : ");
					i=sc.nextInt();
					System.out.print("Masukan Lebar : ");
					f=sc.nextInt();
					LuasPersegiP=i*f;
					System.out.println("==================================");
					System.out.println("Luas Persegi Panjang : "+LuasPersegiP);
					
					break;
					
				case '3':
				
					double LuasLingkaran,r , phi=3.14;
					
					System.out.println(" ");
					System.out.println("=================================");
					System.out.println("Menghitung Luas Lingkaran");
					System.out.println(" ");
					System.out.print("Masukan Jari-jari : ");
					r=sc.nextDouble();
					
					LuasLingkaran=phi*r*r;;
					System.out.println("==================================");
					System.out.println("Luas Lingkaran : "+LuasLingkaran);
	
					break;
					
				case '4':
					exit=true;
					break;

			}
		
		}while (!exit);
		sc.close();
	}//end main 

}