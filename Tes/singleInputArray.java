package Tes;
import java.util.Scanner;

class singleInpuToArray{

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Please enter data ");
      
       String data = scan.nextLine();
       String tmpDataArray[] = data.split("");
       String dataArray[] = new String[tmpDataArray.length];
    
       for (int i = 0; i < dataArray.length; i++) {
          dataArray[i] = tmpDataArray[i];
       }

       //10370311 = 8
       
       if(tmpDataArray.length<15){
            System.out.println("NIM Tidak Valid #kurang dari 15 digit");
       }else if(tmpDataArray.length>15){
            System.out.println("NIM Tidak Valid #lebih dari 15 digit");
       }else if(dataArray[4].equals("1") && dataArray[5].equals("0") &&dataArray[6].equals("3") && dataArray[7].equals("7") && dataArray[8].equals("0") 
       && dataArray[9].equals("3") && dataArray[10].equals("1") && dataArray[11].equals("1")){
            System.out.println("NIM Valid");
       }else{
            System.out.println("Bukan NIM Teknik Informatika.");
       }
       
       for(int i = 0; i < dataArray.length; i++){
            System.out.println("Array"+i+": "+dataArray[i]+" ");
       }
        scan.close();
    }
}