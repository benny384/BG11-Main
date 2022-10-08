package BG11;

import java.util.Scanner;

public class VerzweigungenAufg2 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner (System.in);

        double umsatz;

        System.out.println("Bitte geben sie den Umsatz!");

        umsatz =scanner.nextDouble();

        if  (umsatz < 500) {
    System.out.println("Sie bekommen keine Prozente!");

        } else if (umsatz >= 500) {
    System.out.println("Ihr Umsatz mit Rabatt betraegt: " + umsatz * 1.01);    
    
        } else if (umsatz >= 1000) {
    System.out.println("Ihr Umsatz mit Rabatt betraegt: " + umsatz * 1.02); 
    
        } else if (umsatz >= 2000) {
    System.out.println("Ihr Umsatz mit Rabatt betraegt: " + umsatz * 1.05); 

        } else if (umsatz >= 5000) 
    System.out.println("Ihr Umsatz mit Rabatt betraegt: " + umsatz * 1.10);    

     }

    
     }

 