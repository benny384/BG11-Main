package BG11;

public class Maexchen {

    public static void main( String[] args) {
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        
        System.out.println("Eingabe: "+a+" "+b);
        if (a<1 | a>6) System.out.println("Falsche Eingabe.");
        int min = a, max = b;
        
        if (a>b) {min = b; max = a;}
        
        

        if(min == 1  &&  max == 2)      
            System.out.println(1000);
        else if(min == max)             
            System.out.println(200*min);
        else                            
            System.out.println(10*max + min);
    }
}