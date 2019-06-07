package piggybank;

public abstract class PiggyBank{
    int penny;

    public PiggyBank(int penny){
        this.penny = penny;
    }

    public PiggyBank(){
        this.penny = 0;
    }

    public abstract String getName();
    public abstract double getValue();

    @Override
    public String toString(){
        return getName();
    }

} 