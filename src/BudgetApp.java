
import MenuState.MenuState;
import Strategies.AbstractTransactionInteractions;
import Transactions.Transactions;

import java.util.ArrayList;
import java.util.Scanner;

public class BudgetApp {
    static ArrayList<Transactions> transactions = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuState choice = MenuState.CHOOSING;

        while (choice == MenuState.CHOOSING) {
            System.out.println("\n=== Budget Tracker ===");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. Show Transactions");
            System.out.println("4. Show Balance");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = MenuState.fromValue(scanner.nextInt());
                scanner.nextLine(); // consume newline
            } catch (Exception e) {
                System.out.println("Invalid input.");
                scanner.nextLine();
                choice = MenuState.CHOOSING;
                continue;
            }

            AbstractTransactionInteractions action = AbstractTransactionInteractions.getStrategy(choice);
            transactions = action.handle(transactions, scanner);

            if (choice != MenuState.EXIT) {
                choice = MenuState.CHOOSING;
            }
        }

        scanner.close();
    }
}
