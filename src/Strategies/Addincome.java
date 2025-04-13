package Strategies;

import Transactions.Transactions;
import Transactions.Income;

import java.util.ArrayList;
import java.util.Scanner;

public class Addincome extends AbstractTransactionInteractions{
    @Override
    public ArrayList<Transactions> handle(ArrayList<Transactions> transactions, Scanner scanner) {
        System.out.print("Enter income description: ");
        String desc = scanner.nextLine();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        transactions.add(new Income(desc, amount));
        System.out.println("Income added.");
        return transactions;
    }
}
