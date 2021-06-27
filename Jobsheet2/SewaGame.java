package Jobsheet2;

import java.util.Scanner;

public class SewaGame{
	
	int id, lama_pinjam, harga_sewa, hargaAkhir;
	String nama_member, nama_game;
	
	Scanner sc = new Scanner(System.in);
	
	void inputData(){
		System.out.print("Masukkan ID: ");
		id=sc.nextInt();
		sc.nextLine();
		System.out.print("Masukkan Nama: ");
		nama_member=sc.nextLine();
		System.out.print("Masukkan Nama Game: ");
		nama_game=sc.nextLine();
		System.out.print("Masukkan Lama Pijam(hari): ");
		lama_pinjam=sc.nextInt();
		sc.nextLine();
		System.out.print("Masukkan harga pinjam/hari: ");
		harga_sewa=sc.nextInt();
		sc.nextLine();
	}
	
	void tampilData(){
		System.out.println("=======================");
		System.out.println("ID = "+id);
		System.out.println("Nama = "+nama_member);
		System.out.println("Nama Game = "+nama_game);
		System.out.println("Lama Pinjam = "+lama_pinjam);
		System.out.println("Harga = "+hargaAkhir);
		System.out.println("=======================");
	}
	
	void hitungHarga(){
		hargaAkhir=harga_sewa*lama_pinjam;
		//return hargaAkhir;
	}
	
}