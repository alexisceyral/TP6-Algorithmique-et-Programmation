package org.example;

public class Transaction {
    private final int originWallet;
    private final int destinationWallet;
    private final int IsepCoins;
    private boolean payed;

    public int getIsepCoins() {
        return IsepCoins;
    }
    public int getOriginWallet() {
        return originWallet;
    }
    public int getDestinationWallet() {
        return destinationWallet;
    }

    public boolean isPayed() {
        return payed;
    }
    public boolean setPayed(boolean x){
        payed=x;
    }
}
