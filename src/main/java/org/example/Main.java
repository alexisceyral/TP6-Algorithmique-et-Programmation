package org.example;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;


public class Main {


    static String[] students = {"Sidonie", "Alexis", "Léona", "Alessia", "Solène"};
    static Map<Integer, Wallet> wallets = new HashMap<>();
    static List<Block> blockchain = new LinkedList<>();


    static void createWallets() {
        for (String name : students) {
            Wallet w = new Wallet(name);
            w.setIsepCoins(10);
            wallets.put(w.getToken(), w);
        }
    }


    static void simulation() {
        Random rnd = new Random();
        blockchain.add(new Block());
        Integer[] tokens = wallets.keySet().toArray(new Integer[0]);
        for (int i = 0; i < 55; i++) {
            int from = tokens[rnd.nextInt(tokens.length)];
            int to = tokens[rnd.nextInt(tokens.length)];
            int amount = rnd.nextInt(10) + 1;
            Block last = blockchain.get(blockchain.size() - 1);
            last.add(new Transaction(from, to, amount));
        }
    }


    public static void main(String[] args) {
        createWallets();
        System.out.println(wallets.size() + " wallets created");
        simulation();
        System.out.println(blockchain.size() + " blocks");
        System.out.println(wallets.values());
    }
}
