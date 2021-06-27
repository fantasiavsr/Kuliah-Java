package Minggu1;

//import java.util.Scanner;

class prak4b{
	
	static int fibo(int m){

		if((m == 0) || (m == 1)){
			return m;
		}else
			return fibo(m - 1) + fibo(m - 2);
	}

	public static void main(String args[]){
		
		for(int i=0; i <9; i++){
			System.out.print(fibo(i)+" ");
			
		}
	}//end main 

}