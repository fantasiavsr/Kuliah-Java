package Jobsheet2;

//import java.util.Scanner;

public class Pacman{
    
	int x, y, width, height;
	
	Pacman(int lebar, int panjang, int posX, int posY){
		height = lebar;
        width = panjang;
        x = posX;
        y = posY;
    }
	
	void moveUp(){
		if (y>0&&y+1<height){
			y = y+1;
		}else{
			System.out.println("Pacman berada di pojok area.");
		}
	}
    
	void moveDown(){
		if (y-1>0&&y+1<height){
			y = y-1;
		}else{
			System.out.println("Pacman berada di pojok area.");
		}
	}
	
	void moveRight(){
		if (x>0&&x+1<width){
			x = x+1;
		}else{
			System.out.println("Pacman berada di pojok area.");
		}
	}
	
	void moveLeft(){
		if (x-1>0&&x+1<width){
			x = x-1;
		}else{
			System.out.println("Pacman berada di pojok area.");
		}
	}
    
	void printPosition(){
		System.out.println("======================="); 
		System.out.println("Posisi Pacman : ");
		System.out.println("x = "+ x);
		System.out.println("y = "+ y);
		System.out.println(" "); 
		System.out.println("Area Permainan: "+width + "x"+ height);
		System.out.println("=======================");
	}
    
}

