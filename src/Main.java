import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<CurrencyUnit> piggyBank = new ArrayList<>();

        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

        DecimalFormat fp = new DecimalFormat("$###,###.00");

        double totalAmount = piggyBank.stream().map(CurrencyUnit::getTotalValue).reduce(0.0, Double::sum);

        System.out.println("The piggy bank holds " + fp.format(totalAmount));
    }
}
