package Strategies;

import Transactions.Transactions;
import Transactions.Expenses;

import java.util.ArrayList;
import java.util.Scanner;

public class Addexpenses extends AbstractTransactionInteractions{
    @Override
    public ArrayList<Transactions> handle(ArrayList<Transactions> transactions, Scanner scanner) {
        System.out.print("Enter expense description: ");
        String desc = scanner.nextLine();
        System.out.print("Enter amount : ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        transactions.add(new Expenses(desc, amount));
        System.out.print("Expense added ");
        return transactions;
    }
}
