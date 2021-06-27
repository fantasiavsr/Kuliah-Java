package Minggu3;

import static java.lang.Math.sqrt;

public class Segitiga{
    public double alas;
	public double tinggi;
	public double l, k;
	
	public Segitiga(double a, double t){
		alas=a;
		tinggi=t;
	} 
	
	public double hitungLuas(){
		l=(alas*tinggi)/2;
		return l;
	}
	
	public double hitungKeliling(){
		k=sqrt((alas*alas)+(tinggi*tinggi)); 
		return k;
	}
	
}

