package BG11;

public class JahreTageStundenMinutenSekunden {

    public static void main(String[] args) {
        
        int sec = 158036522;
        int jahre = sec/60/60/24/365;
        int tage = sec/60/60/24%365;
        int stunde = sec/60/60%24;
        int minute = sec/60%60;
        int sekunden = sec%60;
        
        System.out.println(sec + " Sekunden entsprechen: ");
        System.out.println(" ");
        System.out.println(jahre + " Jahren,");
        System.out.println(" ");
        System.out.println(tage + " Tage,");
        System.out.println(" ");
        System.out.println(stunde + " Stunden,");
        System.out.println(" ");
        System.out.println(minute + " Minuten und");
        System.out.println(" ");
        System.out.println(sekunden + " Sekunden");
               

    }

}
