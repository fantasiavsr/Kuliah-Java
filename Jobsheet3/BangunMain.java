package Jobsheet3;

import java.util.Scanner;

public class BangunMain{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
				
		int a, l, i;
		double f, r;
		boolean exit = false;
		
		do{
			System.out.println("Menghitung Bangun Ruang");
			System.out.println("=======================");
			System.out.println("1. Kubus");
			System.out.println("2. Balok");
			System.out.println("3. Tabung");
			System.out.println("4. Exit");
			System.out.println("=======================");
			System.out.print("Pilih: ");
			char opt;
			opt=sc.next().charAt(0);
			
			switch(opt){
				case '1':
					
					System.out.println("=======================");
					System.out.print("Masukkan panjang sisi kubus:");
					a=sc.nextInt();
					Kubus a1 = new Kubus(a);
					a1.hitungVolume();
					a1.hitungLuas();
					System.out.println("-----------------------");
					a1.tampilData();
					//System.out.print("Volume kubus = "+a1.hitungVolume());
					//System.out.print("Luas kubus = "+a1.hitungLuas());
					System.out.println("=======================");
					
					break;
					
				case '2':
				
					System.out.println("=======================");
					System.out.print("Masukkan panjang balok:");
					a=sc.nextInt();
					System.out.print("Masukkan lebar balok:");
					l=sc.nextInt();
					System.out.print("Masukkan tinggi balok:");
					i=sc.nextInt();
					Balok l1 = new Balok(a,l,i);
					l1.hitungVolume();
					l1.hitungLuas();
					System.out.println("-----------------------");
					l1.tampilData();
					System.out.println("=======================");
					
					break;
					
				case '3':
					
					System.out.println("=======================");
					System.out.print("Masukkan tinggi tabung:");
					f=sc.nextInt();
					System.out.print("Masukkan jari-jari tabung:");
					r=sc.nextInt();
					Tabung i1 = new Tabung(f,r);
					i1.hitungVolume();
					i1.hitungLuas();
					System.out.println("-----------------------");
					i1.tampilData();
					System.out.println("=======================");
					
					break;
					
				case '4':
					exit=true;
					break;
			}
			
		}while(!exit);
		sc.close();
	}
}