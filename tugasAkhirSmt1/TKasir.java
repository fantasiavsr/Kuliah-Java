package tugasAkhirSmt1;

import java.util.Scanner;

class TKasir{
	
	public static void main(String args[]){
		title();
		data();
		System.out.println("TERIMA KASIH");
	}//end main 
	
	static void title(){
		System.out.println(" ");
        System.out.println("=== UAS PRAKTIKUM DASAR PEMROGRAMAN TI - 1A ===");
        System.out.println("   Nama : Muhamad Alif Rizki");
        System.out.println("   NIM  : 2041720196");
		System.out.println("   Tema : Kasir Bioskop");
        System.out.println("===============================================");
	}//end title
	
	static void option1(){
		//main menu
		System.out.println(" ");
		System.out.println("===============================================");
		System.out.println("Pilih Menu: ");
		System.out.println("1. Daftarkan Menu");
		System.out.println("2. List Menu");
		System.out.println("3. Pemesanan");
		System.out.println("4. Nota Pemesanan");
		System.out.println("5. Pembayaran");
		System.out.println("6. Nota Pembelian");
		System.out.println("7. Riwayat Transaksi");
		System.out.println("8. Exit");
		System.out.print("Pilih: ");
	}//end option1

	static void data(){
		Scanner sc = new Scanner(System.in);
		
			boolean exit = false;
			//int a=2147483647,b=2147483647; //besar array
			int a=100,b=999; //besar array
			
			//----------------------------------daftarkan menu----------------------------------//
			//film
			int xF=0; //batas bnyk film
			String [] namaF = new String[a]; //array nama film
			int [] hargaF = new int[a]; //array harga film
			namaF[0]="-";
			hargaF[0]=0;
			//makanan
			int xMa=0; //batas bnyk makanan
			String [] namaMa = new String[a]; //array nama makanan
			int [] hargaMa = new int[a]; //array harga makanan
			namaMa[0]="-";
			hargaMa[0]=0;
			//minuman
			int xMi=0; //batas bnyk minuman
			String [] namaMi = new String[a]; //array nama minuman
			int [] hargaMi = new int[a]; //array harga minuman
			namaMi[0]="-";
			hargaMi[0]=0;
			
			//----------------------------------pesan menu----------------------------------//
			boolean FC=false;
			int yP;//choose
			int yH=0;//count
			//pesan film
			String yPF; //temp nama pesan film
			int yHF; //temp harga pesan film
			int yHFx;//temp jumlah
				
			yPF="-";
			yHF=0;
			yHFx=0;
			//pesan makanan
			String yPMa;//temp nama makanan
			int yHMa;//temp
			int yHMax;//temp jumlah
			//pesan minuman
			String yPMi;//temp nama minuman
			int yHMi;//temp
			int yHMix;//temp jumlah
			
			yPMa="-";
			yHMa=0;
			yHMax=0;
						
			yPMi="-";
			yHMi=0;
			yHMix=0;
			
			//----------------------------------nota----------------------------------//
			//nota pemesanan
			boolean PC=false;
			//nota pembayaran
			boolean BC=false;

			//----------------------------------pembayaran----------------------------------//
			int totalB;
			totalB=0;
			int tunai;
			tunai=0;
			
			//----------------------------------history----------------------------------//
			//film
			int z=0;//
			String [] zF = new String[b]; //array  
			int [] zHF = new int[b]; //array 
			//makanan
			String [] zMa = new String[b]; //array 
			int [] zHMa = new int[b]; //array 
			//minuman
			String [] zMi = new String[b]; //array 
			int [] zHMi = new int[b]; //array 
			//total
			int xyz=0;	

		do{//loop main menu

			//main menu
			option1();
			char opt1;
			opt1=sc.next().charAt(0);
			
			switch(opt1){
				
				case '1'://DAFTAR
						
						//sub menu 1
						System.out.println(" ");
						System.out.println("===============================================");
						System.out.println("Pilih Menu yang Ingin Didaftarkan: ");
						System.out.println("1. Film");
						System.out.println("2. Makanan");
						System.out.println("3. Minuman");
						System.out.print("Pilih: ");
						char opts1;
						opts1=sc.next().charAt(0);
						
						switch(opts1){
				
							case '1'://FILM
							
								xF=0;//reset count
								System.out.println(" ");
								System.out.println("------Masukkan Daftar Menu Film------");
								System.out.print("Masukkan Banyak Film: ");
								//batas bnyk film
								int xFp;
								xFp = sc.nextInt(); 
								sc.nextLine();// \n
								xF+=xFp;
								
								//input desc film
								System.out.println(" ");
								for (int i = 0; i < xF; i++){
									System.out.print("Masukkan Nama Film ke-"+(i+1)+" :");
									namaF[i+1] = sc.nextLine();
									System.out.print("Masukkan Harga Tiket Film ke-"+(i+1)+" : Rp.");
									hargaF[i+1] = sc.nextInt();
									sc.nextLine();// \n
									System.out.println();
								}
								
								//print list film
								//System.out.println(" ");
								System.out.println("Daftar Film:");
								for (int j = 1; j <= xF; j++){
									
									if(namaF[j]!=null && hargaF[j]!=0){
										System.out.println((j)+". "+namaF[j]+"\t	Rp."+hargaF[j]);
									}
								}
								
								break;
								
							case '2'://MAKANAN
								
								xMa=0;//reset count
								System.out.println(" ");
								System.out.println("------Masukkan Daftar Menu Makanan------");
								System.out.print("Masukkan Bnyk Makanan: ");
								//batas bnyk makanan
								int xMap;
								xMap = sc.nextInt(); 
								sc.nextLine();// \n
								xMa+=xMap;
								
								//input desc makanan
								System.out.println(" ");
								for (int i = 0; i < xMa; i++){
									System.out.print("Masukkan Nama Makanan- ke-"+(i+1)+" :");
									namaMa[i+1] = sc.nextLine();
									System.out.print("Masukkan Harga Makanan- ke-"+(i+1)+" : Rp.");
									hargaMa[i+1] = sc.nextInt();
									sc.nextLine();// \n
									System.out.println();
								}
								
								//print list makanan
								//System.out.println(" ");
								System.out.println("Daftar Makanan:");
								for (int j = 1; j <= xMa; j++){
									
									if(namaMa[j]!=null && hargaMa[j]!=0){
										System.out.println((j)+". "+namaMa[j]+"\t	Rp."+hargaMa[j]);
									}
								}
								
								break;
								
							case '3'://MINUMAN
				
								xMi=0;//reset count
								System.out.println(" ");
								System.out.println("------Masukkan Daftar Menu Minuman------");
								System.out.print("Masukkan Bnyk Minuman: ");
								//batas bnyk minuman
								int xMip;
								xMip = sc.nextInt(); 
								sc.nextLine();// \n
								xMi+=xMip;
								
								//input desc minuman
								System.out.println(" ");
								for (int i = 0; i < xMi; i++){
									System.out.print("Masukkan Nama Minuman- ke-"+(i+1)+" :");
									namaMi[i+1] = sc.nextLine();
									System.out.print("Masukkan Harga Minuman- ke-"+(i+1)+" : Rp.");
									hargaMi[i+1] = sc.nextInt();
									sc.nextLine();// \n
									System.out.println();
								}
								
								//print list minuman
								//System.out.println(" ");
								System.out.println("Daftar Minuman:");
								for (int j = 1; j <= xMi; j++){
									
									if(namaMi[j]!=null && hargaMi[j]!=0){
										System.out.println((j)+". "+namaMi[j]+"\t	Rp."+hargaMi[j]);
									}
								}
								
								break;	
						}
						FC=true;
						break;//break case 1
						
				case '2'://LIST MENU
						
						if(FC == true){
							System.out.println(" ");
							System.out.println("===============================================");
							System.out.println("List Menu");
							System.out.println(" ");
							//print list film
							System.out.println("Daftar Film:");
							for (int j = 1; j <= xF; j++){
							
								if(namaF[j]!=null && hargaF[j]!=0){
									System.out.println((j)+". "+namaF[j]+"\t	Rp."+hargaF[j]);
								}
							}
							//print list makanan
							System.out.println(" ");
							System.out.println("Daftar Makanan:");
							for (int j = 1; j <= xMa; j++){
								
								if(namaMa[j]!=null && hargaMa[j]!=0){
									System.out.println((j)+". "+namaMa[j]+"\t	Rp."+hargaMa[j]);
								}
							}
							//print list minuman
							System.out.println(" ");
							System.out.println("Daftar Minuman:");
							for (int j = 1; j <= xMi; j++){
										
								if(namaMi[j]!=null && hargaMi[j]!=0){
									System.out.println((j)+". "+namaMi[j]+"\t	Rp."+hargaMi[j]);
								}
							}	
						}else{
							System.out.println(" ");
							System.out.println("===============================================");
							System.out.println("Silahkan lakukan pendaftaran terlebih dahulu");
						}
						break;
						
				case '3'://PEMESANAN
						
						if(FC == true){
							boolean baru = false;
							
							System.out.println(" ");
							System.out.println("===============================================");
							System.out.print("Mulai pemesanan baru? (0=tidak/1=ya): ");
							char opts2;
							opts2=sc.next().charAt(0);
							
							switch(opts2){
											
								case '1':
									baru=false;
									//reset temp
									yPF="-";
									yHF=0;
									yHFx=0;
									
									yPMa="-";
									yHMa=0;
									yHMax=0;
												
									yPMi="-";
									yHMi=0;
									yHMix=0;
									
									yH=0;
									tunai=0;
									
									
									do{//perulangan pesan baru atau tidak
										System.out.println(" ");
										System.out.println("Pilih Pemesanan: ");
										System.out.println("1. Film");
										System.out.println("2. Makanan & Minuman");
										System.out.println("3. Selesai Pemesanan");
										System.out.print("Pilih: ");
										char opts3;
										opts3=sc.next().charAt(0);
										
										switch(opts3){
											
											case '1'://FILM
											
													//BC=false;
													
													//print list film
													System.out.println(" ");
													System.out.println("Daftar Film:");
													for (int j = 1; j <= xF; j++){
															
														if(namaF[j]!=null && hargaF[j]!=0){
															System.out.println((j)+". "+namaF[j]+"\t	Rp."+hargaF[j]);
														}
													}
													
													//pilih film 
													System.out.println(" ");
													System.out.print("Pilih Tiket(1-"+xF+")(0 untuk tidak pesan): ");
													yP=sc.nextInt();//temp string film
													
													if(yP!=0){
														System.out.print("Jumlah Tiket: ");
														yH=sc.nextInt();//temp int jumlah film
													}
													 
													//temp data
													yPF=namaF[yP];//-1, karena array mulai dari[0]
													yHF=hargaF[yP]*yH;//-1, karena array mulai dari[0]
													yHFx=yH;
													
													//print temp Film
													System.out.println(" ");
													System.out.println("Film yang dipesan: "+yPF+"	x"+yHFx);
													System.out.println("Total: Rp "+yHF);
													System.out.println(" ");
														
													break;
											
											case '2'://MAKANAN MINUMAN
											
													//BC=false;
													yH=0;//reset
													//print list makanan
													System.out.println(" ");
													System.out.println("Daftar Makanan:");
													for (int j = 1; j <= xMa; j++){
														
														if(namaMa[j]!=null && hargaMa[j]!=0){
															System.out.println((j)+". "+namaMa[j]+"\t	Rp."+hargaMa[j]);
														}
													}
													
													//print list minuman
													//System.out.println(" ");
													System.out.println("Daftar Minuman:");
													for (int j = 1; j <= xMi; j++){
														
														if(namaMi[j]!=null && hargaMi[j]!=0){
															System.out.println((j)+". "+namaMi[j]+"\t	Rp."+hargaMi[j]);
														}
													}
													
													//pilih makanan
													System.out.println(" ");
													System.out.print("Pilih Makanan(1-"+xMa+")(0 untuk tidak pesan): ");
													yP=sc.nextInt();//temp string makanan
													
													if(yP!=0){
														System.out.print("Jumlah Makanan: ");
														yH=sc.nextInt();//temp int jumlah makanana
													}
													 
													//temp data
													yPMa=namaMa[yP];//-1, karena array mulai dari[0]
													yHMa=hargaMa[yP]*yH;//-1, karena array mulai dari[0]
													yHMax=yH;
													
													yH=0;//reset
													
													//pilih minuman
													System.out.println(" ");
													System.out.print("Pilih Minuman(1-"+xMi+")(0 untuk tidak pesan): ");
													yP=sc.nextInt();//temp string minuman
													
													if(yP!=0){
														System.out.print("Jumlah Minuman: ");
														yH=sc.nextInt();//temp int jumlah minuman
													}
													 
													//temp data
													yPMi=namaMi[yP];//-1, karena array mulai dari[0]
													yHMi=hargaMi[yP]*yH;//-1, karena array mulai dari[0]
													yHMix=yH;
													
													//print temp makanan & minuman
													System.out.println(" ");
													System.out.println("Makanan yang dipesan: "+yPMa+"	x"+yHMax);
													System.out.println("Minuman yang dipesan: "+yPMi+"	x"+yHMix);
													System.out.println("Total: Rp "+(yHMa+yHMi));
													System.out.println(" ");
											
													break;
													
											case '3'://SELESAI
													PC=true;
													BC=false;
													baru = true;
													
													break;
													
										}//end sub 2 switch
										
									}while(!baru);//end loop
									
									break;// break case 1
								
								case '0':
								
									break;//break case 0
									
							}//end sub 1 switch
							
						}else{
							System.out.println(" ");
							System.out.println("===============================================");
							System.out.println("Silahkan lakukan pendaftaran terlebih dahulu");
						}
						break;//break case 3
						
				case '4'://NOTA PEMESANAN
				
						if(PC == true && yPF!="-" || yPMa!="-" || yPMi!="-"){
							
							System.out.println(" ");
							System.out.println("===============================================");
							System.out.println("Nota Pemesanan");
							System.out.println("--------------------------------------");
							System.out.println("Film yang dipesan: "+yPF+"	x"+yHFx);
							System.out.println("Harga tiket: Rp "+yHF);
							System.out.println("--------------------------------------");
							
							System.out.println("Makanan yang dipesan: "+yPMa+"	x"+yHMax);
							System.out.println("Minuman yang dipesan: "+yPMi+"	x"+yHMix);
							System.out.println("Harga makanan/minuman: Rp "+(yHMa+yHMi));
							System.out.println("--------------------------------------");
							System.out.println("Total: "+(yHF+yHMa+yHMi));
							
						}else{
							System.out.println(" ");
							System.out.println("===============================================");
							System.out.println("Silahkan lakukan pemesanan terlebih dahulu");
						}
						break;//break case 4
						
				case '5'://PEMBAYARAN
				
						if(PC == true && yPF!="-" || yPMa!="-" || yPMi!="-"){
							//print nota
							System.out.println(" ");
							System.out.println("===============================================");
							System.out.println("Film yang dipesan: "+yPF+"	x"+yHFx);
							System.out.println("Harga tiket: Rp "+yHF);
							System.out.println("--------------------------------------");
							
							System.out.println("Makanan yang dipesan: "+yPMa+"	x"+yHMax);
							System.out.println("Minuman yang dipesan: "+yPMi+"	x"+yHMix);
							System.out.println("Harga makanan/minuman: Rp "+(yHMa+yHMi));
							System.out.println("--------------------------------------");
							totalB=yHF+yHMa+yHMi;
							System.out.println("Total: "+totalB);
							
							System.out.println(" ");
							System.out.println("Silahkan bayar sesuai dengan ketentuan.");
							
							//input bayar;
							System.out.print("Masukkan uang: ");
							yH=sc.nextInt();//temp byar makanan
							tunai=yH;
							
							System.out.println(" ");
							
							if(tunai>=yHF+yHMa+yHMi){
								System.out.print("Pembayaran berhasil!");
								System.out.println(" ");
								
								//record ke history transaksi
								//zF zHF zMa zHMa zMi zHMi
								zF[z]=yPF;
								zHF[z]=yHF;
								
								zMa[z]=yPMa;
								zHMa[z]=yHMa;
								
								zMi[z]=yPMi;
								zHMi[z]=yHMi;
								
								z++;//next slot riwayat
								BC=true;
							}else{
								System.out.println("Maaf uang yang anda masukkan tidak mencukupi.");
								System.out.println("Mohon pilih menu pembayaran kembali untuk mengulang.");
							}
						}else{
							System.out.println(" ");
							System.out.println("===============================================");
							System.out.println("Silahkan lakukan pemesanan terlebih dahulu");
						}
						break;//break case 5	
				
				case '6'://NOTA PEMBAYARAN
						
						if(BC == true){
							
							System.out.println(" ");
							System.out.println("===============================================");
							System.out.println("Nota Pembayaran");
							System.out.println("--------------------------------------");
							System.out.println("Film yang dipesan: "+yPF+"	x"+yHFx);
							System.out.println("Harga tiket: Rp "+yHF);
							System.out.println("--------------------------------------");
							
							System.out.println("Makanan yang dipesan: "+yPMa+"	x"+yHMax);
							System.out.println("Minuman yang dipesan: "+yPMi+"	x"+yHMix);
							System.out.println("Harga makanan/minuman: Rp "+(yHMa+yHMi));
							System.out.println("--------------------------------------");
							System.out.println("Total: "+(yHF+yHMa+yHMi));
							System.out.println("--------------------------------------");
							System.out.println("Tunai: "+tunai);
							System.out.println("Kembalian: "+(tunai-(yHF+yHMa+yHMi)));
							
							//tunai=0;//reset
						}else{
							System.out.println(" ");
							System.out.println("===============================================");
							System.out.println("Silahkan lakukan pembayaran terlebih dahulu");
						}
						break;//break case 6
				
				case '7'://HISTORY
				
						System.out.println(" ");
						System.out.println("===============================================");
						System.out.println("Histori pembayaran:");
						for (int j = 0; j < a; j++){
							
							//print history transaksi berhasil
							if(zF[j]!=null && zHF[j]!=0		&& zMa[j]!=null && zHMa[j]!=0	&& zMi[j]!=null && zHMi[j]!=0){
								System.out.println((j+1)+". "+zF[j]+"	x"+yHFx+"\t	Rp."+zHF[j]);
								System.out.println("   "+zMa[j]+"	x"+yHMax+"\t	Rp."+zHMa[j]);
								System.out.println("   "+zMi[j]+"	x"+yHMix+"\t	Rp."+zHMi[j]);
								System.out.println("   "+"--------------------------------------");
								System.out.println("   "+"Total"+"\t	Rp."+(zHF[j]+zHMa[j]+zHMi[j]));
								xyz+=(zHF[j]+zHMa[j]+zHMi[j]);
								System.out.println(" ");
							}else if(zF[j]!=null && zHF[j]!=0		&& zMa[j]!=null && zHMa[j]!=0){
								System.out.println((j+1)+". "+zF[j]+"	x"+yHFx+"\t	Rp."+zHF[j]);
								System.out.println("   "+zMa[j]+"	x"+yHMax+"\t	Rp."+zHMa[j]);
								System.out.println("   "+"--------------------------------------");
								System.out.println("   "+"Total"+"\t	Rp."+(zHF[j] + zHMa[j] + zHMi[j]));
								xyz+=(zHF[j] + zHMa[j] + zHMi[j]);
								System.out.println(" ");
							}else if(zF[j]!=null && zHF[j]!=0		&& zMi[j]!=null && zHMi[j]!=0){
								System.out.println((j+1)+". "+zF[j]+"	x"+yHFx+"\t	Rp."+zHF[j]);
								System.out.println("   "+zMi[j]+"	x"+yHMix+"\t	Rp."+zHMi[j]);
								System.out.println("   "+"--------------------------------------");
								System.out.println("   "+"Total"+"\t	Rp."+(zHF[j] + zHMa[j] + zHMi[j]));
								xyz+=(zHF[j] + zHMa[j] + zHMi[j]);
								System.out.println(" ");
							}else if(zMa[j]!=null && zHMa[j]!=0	&& zMi[j]!=null && zHMi[j]!=0){
								System.out.println((j+1)+". "+zMa[j]+"	x"+yHMax+"\t	Rp."+zHMa[j]);
								System.out.println((j+1)+". "+zMi[j]+"	x"+yHMix+"\t	Rp."+zHMi[j]);
								System.out.println("   "+"--------------------------------------");
								System.out.println("   "+"Total"+"\t	Rp."+(zHF[j] + zHMa[j] + zHMi[j]));
								xyz+=(zHF[j] + zHMa[j] + zHMi[j]);
								System.out.println(" ");
							}
							//----
							else if(zF[j]!=null && zHF[j]!=0){
								System.out.println((j+1)+". "+zF[j]+"	x"+yHFx+"\t	Rp."+zHF[j]);
								System.out.println("   "+"--------------------------------------");
								System.out.println("   "+"Total"+"\t	Rp."+(zHF[j] + zHMa[j] + zHMi[j]));
								xyz+=(zHF[j] + zHMa[j] + zHMi[j]);
								System.out.println(" ");
							}else if(zMa[j]!=null && zHMa[j]!=0){
								System.out.println((j+1)+". "+zMa[j]+"	x"+yHMax+"\t	Rp."+zHMa[j]);
								System.out.println("   "+"--------------------------------------");
								System.out.println("   "+"Total"+"\t	Rp."+(zHF[j]+zHMa[j]+zHMi[j]));
								xyz+=(zHF[j]+zHMa[j]+zHMi[j]);
								System.out.println(" ");
							}else if(zMi[j]!=null && zHMi[j]!=0){
								System.out.println((j+1)+". "+zMi[j]+"	x"+yHMix+"\t	Rp."+zHMi[j]);
								System.out.println("   "+"--------------------------------------");
								System.out.println("   "+"Total"+"\t	Rp."+(zHF[j] + zHMa[j] + zHMi[j]));
								xyz+=(zHF[j] + zHMa[j] + zHMi[j]);
								System.out.println(" ");
							}
						}
						
						System.out.println("-----------------------------------------");
						System.out.println("Total semua transaksi: Rp "+xyz);
						break;//break case 7
						
				case '8'://EXIT
						System.out.println("===============================================");
						exit=true;
						break;//break case 8 >> exit program
						
			}
	
		}while (!exit);//end loop main menu
		sc.close();
	}//end data

}