package Tes;
import java.util.Scanner;;

public class test {
    

    public static void getData(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Masukan Nilai : ");
        //boolean loop = false ;
        //do{
            try{
                int nilai = input.nextInt();
                System.out.println(nilai);
                //loop = true ;
            }catch (Exception e){
                System.out.println("Error nilai");
                getData();
                //continue;
                //break;
           }
        //}while (!loop);
        input.close();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        getData();
        input.close();
    }
}
