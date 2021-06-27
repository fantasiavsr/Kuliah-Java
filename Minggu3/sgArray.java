package Minggu3;

//import java.util.Scanner;

public class sgArray{
	
	public static void main(String[] args){
		//Scanner sc = new Scanner(System.in);
		
		Segitiga[] sgArray = new Segitiga[4];
		
		sgArray[0] = new Segitiga(10, 5);
		sgArray[1] = new Segitiga(20, 10);
		sgArray[2] = new Segitiga(15, 6);
		sgArray[3] = new Segitiga(25, 10);
		
		for(int i = 0; i<3; i++){
			System.out.println("Luas Segitiga ke-"+i+" = "+sgArray[i].hitungLuas());
			System.out.println("Keliling Segitiga ke-"+i+" = "+sgArray[i].hitungKeliling());
		}
	}
}