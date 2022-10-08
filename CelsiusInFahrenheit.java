package BG11;

import java.util.Scanner;

public class CelsiusInFahrenheit {

    public static void main(String[] args) {


        Scanner scanner = new Scanner (System.in);

        double Fahrenheit;
        double Celsius;
        double Ergebnis;

        System.out.println("Bitte geben sie die Temperatur in Celsius ein!");

        Celsius =scanner.nextDouble();

        Ergebnis=9/5 * Celsius + 32;

        System.out.println("Das Ergebnis ist: " + Ergebnis);

        System.out.println(Celsius + " Grad Celsius sind " + Ergebnis + " Grad Fahrenheit!");

    
   	 }

	}