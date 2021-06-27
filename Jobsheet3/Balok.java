package Jobsheet3;

//import java.util.Scanner;

public class Balok{
    
	int panjang, lebar, tinggi,volumeBalok, luasBalok;
	
	Balok(int p, int l, int t){
		panjang=p;
		lebar=l;
		tinggi=t;
    }
	
	void hitungVolume(){
		volumeBalok=panjang*lebar*tinggi;
		//return volumeKubus;
	}
	
	void hitungLuas(){
		luasBalok=(2*((panjang*lebar)+(panjang*tinggi)+(lebar*tinggi)));
		//return luasKubus;
	}
    
	void tampilData(){
		System.out.println("Volume balok = "+volumeBalok);
		System.out.println("Luas balok = "+luasBalok);
		//System.out.println(sisi);
		//System.out.println(x);
	}
    
}

