package Strategies;

import Transactions.Transactions;

import java.util.ArrayList;
import java.util.Scanner;

public class Exit extends AbstractTransactionInteractions{
    @Override
    public ArrayList<Transactions> handle(ArrayList<Transactions> transactions, Scanner scanner) {
        System.out.println("Exiting Budget Tracker");
        return transactions;
    }
}
