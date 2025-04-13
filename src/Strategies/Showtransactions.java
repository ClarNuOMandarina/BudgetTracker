package Strategies;

import Transactions.Transactions;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Showtransactions extends AbstractTransactionInteractions {
    @Override
    public ArrayList<Transactions> handle(ArrayList<Transactions> transactions, Scanner scanner) {
        System.out.println("Transaction List");

        if(transactions.isEmpty()) {
            System.out.println("No transactions yet!");
            return transactions;

        }

        IntStream.range(0, transactions.size()).forEach(i -> {
            System.out.println((i + 1) + ". " + transactions.get(i));
        });

        return transactions;
    }
}
