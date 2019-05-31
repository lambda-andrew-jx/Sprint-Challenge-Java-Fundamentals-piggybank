package piggybank;

import java.text.DecimalFormat;

public class Main 
{
    public static void handlePiggyBank(){
        DecimalFormat fp = new DecimalFormat("$###,###.00");
        Quarter quarter =  new Quarter(10);
        System.out.println(quarter.getValue());
        // System.out.println("The piggy bank holds " + fp.format(myValue));
    }
    public static void main(String[] args) {
        handlePiggyBank();
        
    }
}