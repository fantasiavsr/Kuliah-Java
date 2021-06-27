package Minggu3;

//import java.util.Scanner;

public class Ukuran{
    public int panjang;
	public int lebar;
	public int tinggi;
	
	public Ukuran(int p, int l, int t){
		panjang=p;
		lebar=l;
		tinggi=t;
	}
	
	public Ukuran(int p, int t){
		panjang=p;
		tinggi=t;
	}
	
	public int hitungVolume(){
		return panjang*lebar*tinggi;
	}
	
	public int hitungLuas(){
		return panjang*tinggi;
	}
	  
}

