package piggybank;

public class Penny extends AbstractMoney {
    public Penny(int quantity) {
        super(quantity);
        value = 0.01;
        name = "Pennies";
    }

    public Penny() {
        value = 0.01;
        name = "Penny";
    }
}