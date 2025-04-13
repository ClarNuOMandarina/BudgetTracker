package Strategies;

import Transactions.Transactions;

import java.util.ArrayList;
import java.util.Scanner;

public class Showbalance extends AbstractTransactionInteractions{

    @Override
    public ArrayList<Transactions> handle(ArrayList<Transactions> transactions, Scanner scanner) {
        double balance = 0;
        for (Transactions transaction : transactions) {
            balance += transaction.getAmount();
        }

        System.out.println("Current balance: " + balance);
        return transactions;
    }
}
