package Transactions;

public class Income extends Transactions {

    public Income(String description, double amount) {
        super(description, amount);
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public String getType() {
        return "income";
    }
}