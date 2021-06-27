package Jobsheet3;

//import java.util.Scanner;

public class Tabung{
    
	double tinggi, jari,volumeTabung, luasTabung;
	double phi = 3.14;
	
	Tabung(double t, double r){
		tinggi=t;
		jari=r;
    }
	
	void hitungVolume(){
		volumeTabung=phi*jari*jari*tinggi;
		//return volumeKubus;
	}
	
	void hitungLuas(){
		luasTabung=(2*phi*jari*(jari*tinggi));
		//return luasKubus;
	}
    
	void tampilData(){
		System.out.println("Volume tabung = "+volumeTabung);
		System.out.println("Luas permukaan tabung = "+luasTabung);
		//System.out.println(sisi);
		//System.out.println(x);
	}
    
}

