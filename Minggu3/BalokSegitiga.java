package Minggu3;

//import java.util.Scanner;

public class BalokSegitiga{
	
	public static void main(String[] args){
		//Scanner sc = new Scanner(System.in);
		
		Ukuran[] uArray = new Ukuran[3];
		
		uArray[0] = new Ukuran(100, 30, 12);
		uArray[1] = new Ukuran(120, 40, 15);
		uArray[2] = new Ukuran(210, 50, 25);
		
		for(int i = 0; i<3; i++){
			System.out.println("Volume Balok ke-"+i+" = "+uArray[i].hitungVolume());
		}
		
		uArray[0] = new Ukuran(100, 30, 12);
		uArray[1] = new Ukuran(120, 40, 15);
		uArray[2] = new Ukuran(210, 50, 25);
		
		for(int i = 0; i<3; i++){
			System.out.println("Luas Segitiga ke-"+i+" = "+uArray[i].hitungLuas());
		}
		
	}
}