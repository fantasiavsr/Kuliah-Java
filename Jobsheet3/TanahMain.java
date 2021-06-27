package Jobsheet3;

import java.util.Scanner;

public class TanahMain{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a,l,i;
		int terluas=0;
		
		System.out.println("Luas Tanah");
		System.out.println("=======================");
		System.out.print("Masukkan jumlah tanah: ");
		a=sc.nextInt();
		
		int pArr[]=new int[a];
		int lArr[]=new int[a];
		int luArr[]=new int[a];
		
		Tanah[] tanahArr = new Tanah[a];
		
		System.out.println("-----------------------");
		for(int z = 0; z<a; z++){
			System.out.println("Tanah"+(z+1));
			System.out.print("Panjang Tanah ke-"+(z+1)+" : ");
			l=sc.nextInt();
			pArr[z]=l;
			System.out.print("Lebar Tanah ke-"+(z+1)+" : ");
			i=sc.nextInt();
			lArr[z]=i;
		}
		System.out.println("------------------------");
		for(int z = 0; z<a; z++){
			System.out.println("Tanah"+(z+1));
			tanahArr[z] = new Tanah(pArr[z], lArr[z]);
			tanahArr[z].hitungLuas();
			tanahArr[z].tampilData();
		}
		System.out.println(" ");
		for(int z = 0; z<a; z++){
			System.out.println("Luas Tanah "+(z+1)+": "+tanahArr[z].luas);
			luArr[z]=tanahArr[z].luas;
		}
		
		int d=0;
		int temp=0;
		int max=luArr[0];
		for(int z=0; z<a-1; z++){
			d++;
			if(luArr[z]>max){
				temp=d;
				max=luArr[z];
			}
		}
		if(temp==0){
			temp=d+1;
		}
		terluas=temp;
		System.out.println(" ");
		System.out.println("Tanah terluas "+": Tanah "+terluas);
		System.out.println("=======================");
		sc.close();
	}
}