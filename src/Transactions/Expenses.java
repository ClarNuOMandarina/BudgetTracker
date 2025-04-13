package Transactions;

public class Expenses extends Transactions{
    public Expenses(String description, double amount) {
        super(description,amount);
    }

    @Override
    public double getAmount() {
        return -amount;
    }

    @Override
    public String getType() {
        return "expenses";
    }
}
