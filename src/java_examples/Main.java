package java_examples;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        
        System.out.println("Uygulamaların listesi:");
        
        for (int i=0;i<4;i++){
            System.out.println((i+1) + "- Lab_" + (i+1) );
        }
        System.out.print("\nÇalıştırmak istediğiniz lab uygulamasını seçiniz:");
        Scanner scan = new Scanner(System.in);
        int choose = scan.nextInt();
        switch(choose){
            case 1:
            case 2:
            case 3:
            case 4: lab_4.calistir();
            case 5: 
            default:System.out.println("Yanlış seçim yaptın!");
        }     
    }
}
