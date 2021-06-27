package Minggu1;

import java.util.Scanner;

class soal1{

public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		double a=4500;//harga perkg
		
		//dalam kg
		int Ani=4;
		int Budi=15;
		int Bina=6;
		int Cita=11;
		
		double l,i;
		double f=0;
		
		System.out.println("Smile Laundry");
		System.out.println("=====================");
		System.out.println("Nama	| Berat		| Harga");
		
		l=Ani;
		if(l>10){
			i=((l*a)-(l*a*0.05));
			f+=i;
		}else{
			i=l*a;
			f+=i;
		}
		
		System.out.println("Ani	 "+Ani+"kg	"+"	Rp."+(i));
		
		l=Budi;
		if(l>10){
			i=((l*a)-(l*a*0.05));
			f+=i;
		}else{
			i=l*a;
			f+=i;
		}
		
		System.out.println("Budi	 "+Budi+"kg	"+"	Rp."+(i));
		
		l=Bina;
		if(l>10){
			i=((l*a)-(l*a*0.05));
			f+=i;
		}else{
			i=l*a;
			f+=i;
		}
		
		System.out.println("Bina	 "+Bina+"kg	"+"	Rp."+(i));
		
		l=Cita;
		if(l>10){
			i=((l*a)-(l*a*0.05));
			f+=i;
		}else{
			i=l*a;
			f+=i;
		}
		
		System.out.println("Cita	 "+Cita+"kg	"+"	Rp."+(i));
		System.out.println("=====================");
		System.out.println("Total Pendapatan: Rp."+f);
		
		
		sc.close();
	}//end main 

}