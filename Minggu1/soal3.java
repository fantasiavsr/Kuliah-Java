package Minggu1;

import java.util.Scanner;

class soal3{

public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Masukkan Angka: ");
		n=sc.nextInt();
		
		int l=2;
		for(int a=0;a<n;){
			int i=l%4;
			if(i==0){
				l+=2;
			}else{
				System.out.print(l+" ");
				a++;
				l+=2;
			}
		}
		sc.close();
	}//end main 

}