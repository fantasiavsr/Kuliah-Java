package Minggu3;

import java.util.Scanner;

public class ArrayObject{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("Masukkan panjang array = ");
		n = sc.nextInt();

		PersegiPanjang[] ppArray = new PersegiPanjang[n];
		
		for(int i = 0; i<n ; i++){
			ppArray[i] = new PersegiPanjang();
			System.out.println("Persegi Panjang ke-"+i);
			System.out.print("Masukkan panjang: ");
			ppArray[i].panjang = sc.nextInt();
			System.out.print("Masukkan lebar: ");
			ppArray[i].lebar = sc.nextInt();
		}
		
		for(int i = 0; i<n; i++){
			System.out.println("Persegi ke-"+i);
			System.out.println("Panjang = "+ppArray[i].panjang+", Lebar = "+ppArray[i].lebar);
		}
		sc.close();
	}
}