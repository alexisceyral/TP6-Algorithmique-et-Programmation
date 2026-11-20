package org.example;
import java.util.ArrayDeque;
import java.util.Queue;



public class Block {
    public static final int taillemax = 10;

    private final Queue<Transaction> transactions;

    public Block() {
        this.transactions = new ArrayDeque<>();
    }

    public Queue<Transaction> getTransactions() {
        return transactions;
    }

    public Block add(Transaction transaction) {
        transactions.offer(transaction);
        if (transactions.size() == taillemax) {
            for (Transaction t : transactions) {
                t.isPayed();
            }
            Main.blockchain.add(new Block());
        }
        return this;
    }


}
