package Jobsheet2;

//import java.util.Scanner;

public class Barang{
	
	int hargaSatuan, jumlah, hargaTotal, diskon, hargaBayar;
	String nama;
	
	void tampilData(){
		System.out.println("=======================");
		System.out.println("Nama Produk = "+nama);
		System.out.println("Harga = "+hargaSatuan);
		System.out.println("Jumlah = "+jumlah);
		System.out.println("=======================");
		System.out.println("Diskon = "+diskon);
		System.out.println("Harga Bayar = "+hargaBayar);
		System.out.println("=======================");
	}
	
	int hitungHargaTotal(int l, int i){
		hargaTotal=l*i;
		return hargaTotal;
	}
	
	int hitungDiskon(int x){
		if(x>100000){
			diskon=((x*10)/100);
			return diskon;
		}else if(x>=50000&&x<=100000){
			diskon=((x*5)/100);
			return diskon;
		}else{
			return diskon=0;
		}
	}
	
	int hitungHargaBayar(int x, int y){
		hargaBayar=x-y;
		return hargaBayar;
	}
	
}