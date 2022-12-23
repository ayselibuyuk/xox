package xox;

import java.util.Scanner;

public class xox {
    static String[][] xoxMatris;
    static String kazanan;

    public static void main(String[] args) {
        xoxMatris = new String[3][3];
        kazanan="YOK";
        String tekrar="0";
        
            oyunBasla();
            if(kazanan!="YOK"){
               System.out.println(kazanan+" oyuncusu kazandi.");
            }else{
                System.out.println("kazanan "+kazanan);
            kazanan="YOK";
            }            
        
        System.out.println("OYUN BITMISTIR.");
    }

    public static void oyunBasla() {
        baslangıc();
        yazdir();
        for (int i = 0; i < 6; i++) {
            oyna("x ");
            yazdir();
            kontrol();
            if(kazanan!="YOK"){
                break;
            }
            if(i==5){
               
                break;
            }
            oyna("o ");
            yazdir();
            kontrol();
            if(kazanan!="YOK"){
                break;
            }
        }

    }
    
    public static void yazdir(){
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(xoxMatris[i][j]);
                
            }
            System.out.println("");
        }
    }
    
    public static void kontrol() {
        String harf = xoxMatris[1][1];
        if (!harf.equalsIgnoreCase("- ")) {
            if (xoxMatris[1][0].equals(harf) && xoxMatris[1][2].equals(harf)) {
                System.out.println("orta yatay");
                kazanan=harf;
              
            } else if (xoxMatris[2][0].equals(harf) && xoxMatris[0][2].equals(harf)) {
                System.out.println("sag ustten,sol alta capraz");
                kazanan=harf;
               
            } else if (xoxMatris[0][0].equals(harf) && xoxMatris[2][2].equals(harf)) {
                System.out.println("sol ustten,sag alta capraz");
                kazanan=harf;
            
            } else if (xoxMatris[0][1].equals(harf) && xoxMatris[2][1].equals(harf)) {
                System.out.println("orda dikey");
                kazanan=harf;
              
            }
        }

        harf = xoxMatris[0][0];
        if (!harf.equalsIgnoreCase("- ")) {
            if (xoxMatris[0][1].equals(harf) && xoxMatris[0][2].equals(harf)) {
                System.out.println("ust yatay");
                kazanan=harf;
                
            } else if (xoxMatris[1][0].equals(harf) && xoxMatris[2][0].equals(harf)) {
                System.out.println("ust dikey");
                kazanan=harf;
                
            }
        }

        harf = xoxMatris[2][0];
        if (!harf.equalsIgnoreCase("- ")) {

            if (xoxMatris[2][1].equals(harf) && xoxMatris[2][2].equals(harf)) {
                System.out.println("alt yatay");
                kazanan=harf;
            }
        }

        harf = xoxMatris[0][2];
        if (!harf.equalsIgnoreCase("- ")) {
            if (xoxMatris[1][2].equals(harf) && xoxMatris[2][2].equals(harf)) {
                System.out.println("son dikey");
                kazanan=harf;
            }
        }
        System.out.println("Siradaki oyuncu:");
    }
    
    public static void oyna(String oyuncu) {
        System.out.println("Sira " + oyuncu + " oyuncusunda lutfen satir ve sutun numarasini giriniz.");
        System.out.print("Sutun: ");
        Scanner sutunScanner = new Scanner(System.in);
        int sutunNumarası = sutunScanner.nextInt();
        System.out.print("Satir: ");
        Scanner satırScanner = new Scanner(System.in);
        int satırNumarası = satırScanner.nextInt();
        if(xoxMatris[sutunNumarası - 1][satırNumarası - 1]=="- "){
            xoxMatris[sutunNumarası - 1][satırNumarası - 1] = oyuncu;
        }else{
            System.out.println("Lutfen bos satir sutun seciniz");
            oyna(oyuncu);
        }
       
    }
    
    public static void baslangıc() {
    	
    	 for (int i = 0; i < 3; i++) {    		 
    		 for (int j = 0; j < 3; j++) {
    			 xoxMatris[i][j] = "- ";    			 
    		 }
    	 }
    }
}
