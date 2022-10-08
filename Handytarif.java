package BG11;

import java.util.Scanner;

public class Handytarif {
   

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        
        double basispreis = 22.98;
        double frei = 30;
        double geaspraechsminute = 0.248;
        double minuten;
        double minutenbezahlen;
        double rechnung;
        double rechnung1;
        
        System.out.println("Bitte geben sie ihre Gesprächsminuten ein");
        minuten = scanner.nextDouble();
        
        minutenbezahlen = frei - minuten;
        
        
        
        if  (minutenbezahlen > 0) {
    System.out.println("Sie muessen keine Extragebüuehren Bezahlen.");
    
    rechnung1 = basispreis;
    
    System.out.println("Insgesamt muessen sie " + rechnung1 + " Zahlen!");
    
    
        } else if  (minutenbezahlen < 0) {
            
        minutenbezahlen = minutenbezahlen * -1;            
    System.out.println("Sie muessen " + minutenbezahlen + " Minuten extra zahlen!");
    
        rechnung = minutenbezahlen * geaspraechsminute + basispreis;
        
        System.out.println("Insgesamt muessen sie " + rechnung + " Zahlen!");

    
    
        }
        
        

        

    }

}
