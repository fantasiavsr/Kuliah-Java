package Jobsheet3;

//import java.util.Scanner;

public class Tanah{
    
	int panjang, lebar, luas, terluas;
	
	Tanah(int p, int l){
		panjang=p;
		lebar=l;
    }
	
	Tanah(int l){
		luas=l;
	}
	
	void hitungLuas(){
		luas=panjang*lebar;
	}
    
	void tampilData(){
		System.out.println("Panjang: "+panjang);
		System.out.println("Lebar: "+lebar);
	}
}

