package piggybank;

public class Dime extends AbstractMoney {
    public Dime(int quantity) {
        super(quantity);
        value = 0.10;
        name = "Dimes";
    }

    public Dime() {
        value = 0.10;
        name = "Dime";
    }
}