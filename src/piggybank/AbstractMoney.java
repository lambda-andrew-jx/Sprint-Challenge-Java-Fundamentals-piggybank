package piggybank;

public abstract class AbstractMoney {
    protected double value;
    protected int quantity;
    protected String name;
    public AbstractMoney(int quantity) {
        this.quantity = quantity;
    }

    public AbstractMoney() {
        quantity = 1;
    }

    public void getCoin()
    {
        System.out.println(quantity + " " + name);
    }
    /**
     * @return the value
     */
    public double getValue() {

        return value * quantity;
    }

    /**
     * @param value the value to set
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}