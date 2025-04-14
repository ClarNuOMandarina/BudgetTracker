package Strategies;
import MenuState.MenuState;
import Transactions.Transactions;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class AbstractTransactionInteractions {
    public abstract ArrayList<Transactions> handle(ArrayList<Transactions> transactions, Scanner scanner);

    public static AbstractTransactionInteractions getStrategy(MenuState state) {
        try {
            String className = state.name().charAt(0) + state.name().substring(1).toLowerCase();  // ADD_INCOME -> Add_income
            String fullClassName = "Strategies." + className;
            Class<?> strategy = Class.forName(fullClassName);
            return (AbstractTransactionInteractions) strategy.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Strategy not found");
        }
    }
}
