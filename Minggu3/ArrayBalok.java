package Minggu3;

//import java.util.Scanner;

public class ArrayBalok{
	
	public static void main(String[] args){
		//Scanner sc = new Scanner(System.in);
		
		Balok[] bArray = new Balok[3];
		
		bArray[0] = new Balok(100, 30, 12);
		bArray[1] = new Balok(120, 40, 15);
		bArray[2] = new Balok(210, 50, 25);
		
		for(int i = 0; i<3; i++){
			System.out.println("Volume Balok ke-"+i+" = "+bArray[i].hitungVolume());
		}
	}
}