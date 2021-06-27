package Jobsheet2;

public class Lingkaran {
	
	double PHI=3.14, r;
	double luas, keliling;
	
	void tampilLingkaran(){
		System.out.println("Panjang Rusuk = "+r);
		System.out.println("Luas Lingkaran = "+luas);
		System.out.println("Keliling Lingkaran = "+keliling);
	}
	
	double hitungLuas(double rusuk){
		luas=PHI*rusuk*rusuk;
		return luas;
	}
	
	double hitungKeliling(double rusuk){
		keliling=2*PHI*rusuk;
		return keliling;
	}
}