package Minggu1;

//import java.util.Scanner;

class prak4a{
	
	static void fibo(){
		int m = 10, a = 0, l = 1;
        
		for(int i = 1; i < m; ++i){
			System.out.print(a + " ");

            int r = a + l;
            a = l;
            l = r;
		}
	}

	public static void main(String args[]){
		
        fibo();
	}//end main 

}