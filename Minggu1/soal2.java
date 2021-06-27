package Minggu1;

import java.util.Scanner;

class soal2{

public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		double a,l;
		int f=0;
		
		System.out.println("Masukkan Jumlah Tabungan: ");
		a=sc.nextInt();
		System.out.println("=====================");
		System.out.println("Jumlah tabungan: Rp."+a);
		System.out.println("Bunga: 2%/bulan");
		System.out.println("=====================");
		
		l=a*0.02;
		
		for(double x=a+l; x<1500000;){
			x+=l;
			f++;
		}
		
		System.out.println("Jumlah bulan hingga Rp.1500000 adalah "+f+" bulan.");
		sc.close();
	}//end main 

}