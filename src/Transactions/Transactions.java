package Transactions;

public abstract class Transactions {
    protected String description;
    protected double amount;

    public Transactions(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    public abstract double getAmount();
    public abstract String getType();

    @Override
    public String toString() {
        String sign = (getAmount() >= 0) ? "+" : "-";
        return String.format("%s: %s %s$%.2f", getType(), description, sign, Math.abs(amount));
    }
}
