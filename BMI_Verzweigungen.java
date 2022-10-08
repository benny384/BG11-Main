package BG11;

import java.util.Scanner;

public class BMI_Verzweigungen {


    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
       
       
        double gewicht;
        double groesse;
        double bmi;
       
        System.out.println("Geben sie Ihr Gewicht an:");
        gewicht = scanner.nextDouble();

    System.out.println("Geben sie Ihre Groesse  an:");
        groesse = scanner.nextDouble();

        bmi = gewicht / (groesse * groesse);

    System.out.println("Ihr BMI ist:" + bmi);


        if  (bmi < 18.5) {
    System.out.println("Sie sind untergewichtig!");

        } else if (bmi >= 25) {
    System.out.println("Sie haben Uebergewicht!");      

         } else  {
    System.out.println("Sie haben Normalgewicht!");      

     }

    }
}