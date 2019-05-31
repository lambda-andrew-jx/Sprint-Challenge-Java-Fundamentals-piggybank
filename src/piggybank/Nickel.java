package piggybank;

public class Nickel extends AbstractMoney {
    public Nickel(int quantity) {
        super(quantity);
        value = 0.05;
        name = "Nickels";
    }

    public Nickel(){
        value = 0.05;
        name = "Nickel";
        }
}