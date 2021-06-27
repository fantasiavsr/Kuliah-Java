package Jobsheet2;

import java.util.Scanner;

public class LingkaranMain{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		Lingkaran l1=new Lingkaran();
		
		int i;
		System.out.print("Masukkan panjang rusuk: ");
		i=sc.nextInt();
		
		l1.r=i;
		l1.hitungLuas(i);
		l1.hitungKeliling(i);
		l1.tampilLingkaran();
		sc.close();
	}
}