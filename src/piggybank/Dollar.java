package piggybank;

public class Dollar extends AbstractMoney {
    public Dollar(int quantity) {
        super(quantity);
        value = 1.00;
        name = "Dollars";
    }

    public Dollar() {
        value = 1.00;
        name = "Dollar";
    }
    @Override 
    public void getCoin(){
        System.out.println("$"+ quantity + " " + name);
    }
}