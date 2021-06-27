package Jobsheet3;

import java.util.Scanner;

public class DataMain{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a, i;
		double r, rata;
		String l, f;
		
		System.out.println("Data Mahasiswa");
		System.out.println("=======================");
		System.out.print("Masukkan jumlah mahasiswa: ");
		a=sc.nextInt();
		sc.nextLine();
		
		double nArr[]=new double[a];
		Mahasiswa[] mArr = new Mahasiswa[a];
		
		System.out.println("-----------------------");
		for(int z = 0; z<a; z++){
			System.out.println("Masukkan data mahasiswa ke-"+(z+1));
			System.out.print("Masukkan nama: ");
			l=sc.nextLine();
			System.out.print("Masukkan nim: ");
			i=sc.nextInt();
			sc.nextLine();
			System.out.print("Masukkan jenis kelamin: ");
			f=sc.nextLine();
			System.out.print("Masukkan ipk: ");
			r=sc.nextDouble();
			sc.nextLine();
			nArr[z]=r;
			mArr[z]=new Mahasiswa(l, i, f, r);
			System.out.println(" ");
		}
		System.out.println("------------------------");
		for(int z = 0; z<a; z++){
			System.out.println("Mahasiswa ke"+(z+1));
			System.out.println("Nama: "+mArr[z].nama);
			System.out.println("NIM: "+mArr[z].nim);
			System.out.println("Jenis kelamin: "+mArr[z].gender);
			System.out.println("Nilai IPK: "+mArr[z].ipk);
			System.out.println(" ");
		}
		System.out.println("------------------------");
		
		double x=0;
		for(int z = 0; z<a; z++){
			x+=nArr[z];
		}
		
		rata=x/a;
		System.out.println("IPK rata-rata seluruh mahasiswa: "+rata);
		System.out.println("=======================");
		sc.close();
	}
}