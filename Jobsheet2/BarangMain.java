package Jobsheet2;

import java.util.Scanner;

public class BarangMain{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//String a;
		int l, i;
		
		Barang l1=new Barang();
		
		System.out.print("Masukkan Nama: ");
		l1.nama=sc.nextLine();
		
		System.out.print("Masukkan Harga Barang: ");
		l1.hargaSatuan=sc.nextInt();
		sc.nextLine();
		
		System.out.print("Masukkan Jumlah Barang: ");
		l1.jumlah=sc.nextInt();
		sc.nextLine();
		
		l=l1.hargaSatuan;
		i=l1.jumlah;
		
		//l1.setData(a, l, i);
		
		l1.hitungHargaTotal(l, i);
		
		int x=l1.hitungHargaTotal(l, i);
		l1.hitungDiskon(x);
		
		int y=l1.hitungDiskon(x);
		l1.hitungHargaBayar(x, y);
		
		l1.tampilData();
		sc.close();
	}

}