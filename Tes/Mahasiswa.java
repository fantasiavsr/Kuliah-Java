package Tes;

public class Mahasiswa {
    String Nama, Kelas, Jurusan;
	
	void setNama(String n){
		this.Nama=n;
	}
	
	void setKelas(String k){
		this.Kelas=k;
	}
	
	void setJurusan(String j){
		this.Jurusan=j;
	}
	
	String getNama(){
		return this.Nama;
	}
	
	String getKelas(){
		return this.Kelas;
	}
	
	String getJurusan(){
		return this.Jurusan;
	}
	
	void TampilData(){
		System.out.println("Nama	: " + getNama());
		System.out.println("Kelas	: " + getKelas());
		System.out.println("Jurusan	: " + getJurusan());
	}
	
}
