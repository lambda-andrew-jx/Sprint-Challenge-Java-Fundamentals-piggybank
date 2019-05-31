package bank;


public class Main {
    public static void main(String[] args) 
    {
        Coin dollar = new Coin(1.00);
        Coin quarter = new Coin(0.25);
        Coin dime = new Coin(0.10);
        Coin nickle = new Coin(0.05);
        Coin penny = new Coin(0.01);

        // System.out.println("The value of a dollar is " + dollar.getValue());
        // System.out.println("The value of a quarter is " + dime.getValue());

        PiggyBank = new PiggyBank();

        pb.addCoins(10, quarter);
        pb.addCoins(5, penny);

        double value = pb.getMoney();

        int numcoins = pb.getNumOfCoins();

        // System.out.printf("Coin=%d, Value=%2f\n", numcoins, value);
    }
}

