package bank;

import java.text.DecimalFormat;


public class Main {

    public static void main(String[] args) 
    {

        DecimalFormat fp = new DecimalFormat("$###,###.00");

        Coin dollar = new Coin(1.00);
        Coin quarter = new Coin(0.25);
        Coin dime = new Coin(0.10);
        Coin nickle = new Coin(0.05);
        Coin penny = new Coin(0.01);

        // System.out.println("The value of a dollar is " + dollar.getValue());
        // System.out.println("The value of a quarter is " + dime.getValue());

        PiggyBank pb = new PiggyBank();

        pb.addCoins(1, quarter);
        pb.addCoins(1, dime);
        pb.addCoins(5, dollar);
        pb.addCoins(3, nickle);
        pb.addCoins(7, dime);
        pb.addCoins(1, dollar);
        pb.addCoins(10, penny);



        double value = pb.getMoney();
        // System.out.println(pb.getMoney());

        int numcoins = pb.getNumOfCoins();

        System.out.printf("Coin=%d, Value=%2f\n", numcoins, value);

        System.out.println("The piggy bank holds " + fp.format(pb.getMoney()));
    }
}

