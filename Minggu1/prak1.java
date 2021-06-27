package Minggu1;

import java.util.Scanner;

class prak1{

public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int l;
		int i;
		
		double f;
		String grade=" ";
		
		System.out.println("Program Menghitung Nilai Akhir");
		System.out.println("=========================");
		System.out.print("Masukkan Nilai Tugas: ");
		a = sc.nextInt(); 
		System.out.print("Masukkan Nilai UTS: ");
		l = sc.nextInt(); 
		System.out.print("Masukkan Nilai UAS: ");
		i = sc.nextInt(); 
		System.out.println("=========================");
		
		f = ((a*0.2)+(l*0.35)+(i*0.45));
		
		if(f>80 && f <=100){
			grade = "A";
		}else if(f>73 && f <=80){
			grade = "B+";
		}else if(f>65 && f <=73){
			grade = "B";
		}else if(f>60 && f <=65){
			grade = "C+";
		}else if(f>50 && f <=60){
			grade = "C";
		}else if(f>39 && f <=50){
			grade = "D";
		}else if(f <=39){
			grade = "E";
		}
		
		System.out.println("Nilai Akhir: "+f);
		System.out.println("Nilai Huruf: "+grade);
		sc.close();
		
	}//end main 

}