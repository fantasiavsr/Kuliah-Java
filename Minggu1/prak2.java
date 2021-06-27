package Minggu1;

import java.util.Scanner;

class prak2{

public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		//int a=10;
		
		int a;
		
		String l[] = {"Senin", "Selasa", "Rabu", "Kamis",
            "Jumat", "Sabtu", "Minggu"};
		
		System.out.print("Masukkan Nim : ");
		a = sc.nextInt();
		
		int last = a%100;
		System.out.println("=========================");
		System.out.println("n : "+last);
		
		System.out.println(" ");
		
		int f=0;
		
		for(int i=0; i <=last; i++){
			
			System.out.print(l[f]+" ");
			//f++;
			
			if(f<6){
				f++;
			}else{
				f=0;
			}
			
		}
		sc.close();
	}//end main 

}