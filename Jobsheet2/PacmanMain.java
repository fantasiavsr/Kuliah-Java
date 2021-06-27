package Jobsheet2;

import java.util.Scanner;

public class PacmanMain{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
				
		int a, l, i, f;
		boolean exit = false;
		
		System.out.println("=======================");
		System.out.print("Masukkan Height: ");
		a=sc.nextInt();
		System.out.print("Masukkan Width: ");
		l=sc.nextInt();
		
		System.out.print("Masukkan Posisi x: ");
		i=sc.nextInt();
		System.out.print("Masukkan Posisi y: ");
		f=sc.nextInt();
		System.out.println("=======================");
		
		Pacman a1 = new Pacman(a, l, i, f);
		do{
			System.out.println("=======================");
			System.out.println("W = Up");
			System.out.println("A = Left");
			System.out.println("S = Down");
			System.out.println("D = Right");
			System.out.println("0 = Exit");
			System.out.println("=======================");
			System.out.print("Pilih Tombol: ");
			char opt;
			opt=sc.next().charAt(0);
			
			switch(opt){
				case 'W':
				case 'w':
					a1.moveUp();
					a1.printPosition();
					break;
				case 'A':
				case 'a':
					a1.moveLeft();
					a1.printPosition();
					break;
				case 'S':
				case 's':
					a1.moveDown();
					a1.printPosition();
					break;
				case 'D':
				case 'd':
					a1.moveRight();
					a1.printPosition();
					break;
				case '0':
					exit=true;
					break;
			}
			
		}while(!exit);
		sc.close();
	}
}