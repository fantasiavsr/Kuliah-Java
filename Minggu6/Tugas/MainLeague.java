package Minggu6.Tugas;

public class MainLeague {
    public static void main(String[] args) {

       PermiereLeagueService list = new PermiereLeagueService();
       PremiereLeague t1 = new PremiereLeague("Liverpool\t\t", 29, 45, 82);
       PremiereLeague t2 = new PremiereLeague("Manchester City\t", 27, 39, 57);
       PremiereLeague t3 = new PremiereLeague("Leichester\t\t", 28, 26, 50);
       PremiereLeague t4 = new PremiereLeague("Chelsea\t\t", 29, 9, 48);
       PremiereLeague t5 = new PremiereLeague("Wolverchampion Wanderers", 29, 7, 43);
       PremiereLeague t6 = new PremiereLeague("Sheffield United\t", 28, 5, 43);
       PremiereLeague t7 = new PremiereLeague("Manchester United\t", 28, 12, 42);
       PremiereLeague t8 = new PremiereLeague("Tottenham Hotspur\t", 29, 7, 41);
       PremiereLeague t9 = new PremiereLeague("Arsenal\t\t", 28, 4, 40);
       PremiereLeague t10 = new PremiereLeague("Burnley\t\t", 29, -6, 39);
       PremiereLeague t11 = new PremiereLeague("Crystal Pallace\t", 29, -6, 39);
       PremiereLeague t12 = new PremiereLeague("Everton\t\t", 29, -6, 37);
       PremiereLeague t13= new PremiereLeague("Newcaslte United\t", 29, -16, 35);
       PremiereLeague t14 = new PremiereLeague("Southampton\t\t", 29, -16, 34);
       PremiereLeague t15 = new PremiereLeague("Brighton & Hove Albion", 29, -8, 29);
       PremiereLeague t16 = new PremiereLeague("West Ham United\t", 29, -15, 27);
       PremiereLeague t17 = new PremiereLeague("Walford\t\t", 29, -17, 27);
       PremiereLeague t18 = new PremiereLeague("AFC Bournemouth\t", 29, -18, 27);
       PremiereLeague t19 = new PremiereLeague("Aston Villa\t\t", 27, -18, 25);
       PremiereLeague t20 = new PremiereLeague("Norwich City\t", 29, -27, 21);

       list.tambah(t1);
       list.tambah(t2);
       list.tambah(t3);
       list.tambah(t4);
       list.tambah(t5);
       list.tambah(t6);
       list.tambah(t7);
       list.tambah(t8);
       list.tambah(t9);
       list.tambah(t10);
       list.tambah(t11);
       list.tambah(t12);
       list.tambah(t13);
       list.tambah(t14);
       list.tambah(t15);
       list.tambah(t16);
       list.tambah(t17);
       list.tambah(t18);
       list.tambah(t19);
       list.tambah(t20);

       System.out.println("Data liga sebelum sorting :");
       list.tampilAll();
       System.out.println();
       System.out.println("Data liga yang sudah ascending point: ");
       list.insertionSort();
       list.tampilAll();
    }
}
