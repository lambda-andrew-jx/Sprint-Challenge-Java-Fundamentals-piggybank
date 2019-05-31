package piggyBank;

public class Main
{
    public static void main(String[] args) {

        ArrayList<CoinAbstract> piggyBank = new ArrayList<CoinAbstract>();

        piggyBank.add(new Quarter());

        System.out.println();
    }
}