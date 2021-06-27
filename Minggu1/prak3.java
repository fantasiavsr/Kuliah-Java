package Minggu1;

import java.util.Scanner;

class prak3{

public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);

		int [] a = new int[4];
		a[0]=9; a[1]=3; a[2]=15; a[3]=2;
		
		int [] l = new int[4];
		l[0]=6; l[1]=11; l[2]=9; l[3]=12;
		
		int [] i = new int[4];
		i[0]=2; i[1]=10; i[2]=10; i[3]=5;
		
		int [] f = new int[4];
		f[0]=5; f[1]=7; f[2]=12; f[3]=9;
		
		int hA = 75000;
		int hL = 50000;
		int hI = 60000;
		int hF = 10000;
		
		//System.out.println("1. Aglonema");
		//System.out.println("2. Keladi");
		//System.out.println("3. Alocasia");
		//System.out.println("4. Mawar");
		//System.out.print("Masukkan Jenis bunga : ");
		//char x;
		//int y;
		//x=sc.next().charAt(0);
		//System.out.println("==============");
		
		//switch(x){
		//	case '1':
		//		y=a[0]+l[0]+i[0]+f[0];
		//		System.out.println("Jumlah Stok Aglonema adalah : "+y);
		//		break;
		//	case '2':
		//		y=a[1]+l[1]+i[1]+f[1];
		//		System.out.println("Jumlah Stok Keladi adalah : "+y);
		//		break;
		//	case '3':
		//		y=a[2]+l[2]+i[2]+f[2];
		//		System.out.println("Jumlah Stok Alocasia adalah : "+y);
		//		break;
		//	case '4':
		//		y=a[3]+l[3]+i[3]+f[3];
		//		System.out.println("Jumlah Stok Mawar adalah : "+y);
		//		break;
		//}
		
		int z=((a[0]*hA)+(a[1]*hL)+(a[2]*hI)+(a[3]*hF));
		System.out.println("RoyalGarden1");
		System.out.println("==============");
		System.out.println("Aglonema	|"+a[0]+"	x Rp"+hA);
		System.out.println("Keladi		|"+a[1]+"	x Rp"+hL);
		System.out.println("Alocasia	|"+a[2]+"	x Rp"+hI);
		System.out.println("Mawar		|"+a[3]+"	x Rp"+hF);
		System.out.println("==============");
		System.out.println("Penghasilan dari RoyalGarden1 = Rp."+z);
		sc.close();
	}//end main 

}