package Jobsheet3;

//import java.util.Scanner;

public class Kubus{
    
	int sisi,volumeKubus, luasKubus;
	
	Kubus(int s){
		sisi=s;
    }
	
	void hitungVolume(){
		volumeKubus=sisi*sisi*sisi;
		//return volumeKubus;
	}
	
	void hitungLuas(){
		luasKubus=6*sisi*sisi;
		//return luasKubus;
	}
    
	void tampilData(){
		System.out.println("Volume kubus = "+volumeKubus);
		System.out.println("Luas kubus = "+luasKubus);
		//System.out.println(sisi);
		//System.out.println(x);
	}
    
}

