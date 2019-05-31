package bank;

import java.util.ArrayList;

public class PiggyBank
{
    private ArrayList<Coin> coinList = new ArrayList<>();

        // public int getNumOfCoins()
        // {
        //     return coinList.size();
        // }

    public double getMoney()
    {
        double sum = 0;
        for (Coin c : coinList)
        {
            sum = sum + c.getValue();
        }
        return sum;
    }

    public void getNum()
    {
        for (Coin c : coinList)
        {
            System.out.println(c.getNum() + " " + c.getName());
        }
    }

    public void addCoins(int num, Coin c)
    {
        coinList.add(new Coin(c.getValue(), num, c.getName()));
    }

    // public int  dollars, 
    //             quarters,        
    //             dimes,
    //             nickels,
    //             pennies;

    // public void countCoins(int dollars, int quarters, int dimes, int nickels, int pennies) {

    //       quarters = quarters + q;
    //       dimes = dimes + d;
    //       nickels = nickels + n;
    //       pennies = pennies + p;
    //     }

    // public void printBank() {
          
    //       System.out.println("The number of quarters:  " + quarters);
    //       System.out.println("The number of dimes:  " + dimes);
    //       System.out.println("The number of nickels:  " + nickels);
    //       System.out.println("The number of pennies:  " + pennies);
    //     }
}

