package java_examples;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lab_4 {
    
    static int [] array = new int [10];
    static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);
    static int i=0;
    
    public static int [] eleman_ekle(){
        if (i<array.length){
            array[i]=rand.nextInt(100);
            
            System.out.print(array[i]+" ");
            i++;
            
            return eleman_ekle();
        }
        else return array;
    }
    
    public static void sirala(){
        Arrays.sort(array);
    }
    
    public static void buyuk_yazdir(){
        System.out.println(array[9]);
    }
    
    public static void eleman_sil(){
        int x = scan.nextInt();
        for(i=0;i<array.length;i++){
        
            if (x==array[i]){
                array[i]=0;
                Arrays.sort(array);
                
                System.out.println("\nYeni dizi:");
            
                for(i=0;i<array.length;i++){
                System.out.print(array[i]+" ");
                }
            } 
        }
    }
    
    
    public static void eleman_yeniekle(){
        System.out.print("\nEklemek istediğiniz sayı: ");
        int x= scan.nextInt();
        array[0]=x;
        sirala();
        System.out.println("\nYeni dizi:");
        for(i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        
    }
    
    
    public static void calistir(){
        
        System.out.println("Diziye atanan rastgele elemanlar:");
        array = eleman_ekle();
        
        sirala();
        System.out.println("\nDizinin sıralı hali:");
        for(i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        
        System.out.println("\n\nSeçenekler:");
        System.out.println("1-Eleman ekle");
        System.out.println("2-Eleman sil");
        System.out.println("3-Büyük yazdır");
        System.out.print("\nSeciminiz: ");
        
        Scanner scan = new Scanner(System.in);
        int secim = scan.nextInt();
        switch (secim){
            case 1: 
                eleman_yeniekle();
                break;
            case 2:
                eleman_sil();
                break;
            case 3:
                buyuk_yazdir();
                break;
            default:
                System.out.println("Yanlış seçim yaptınız!");
                
        }
    }
}
