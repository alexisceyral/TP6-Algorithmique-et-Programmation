package org.example;


public class Transaction {
    private final int originWallet;
    private final int destinationWallet;
    private final int IsepCoins;
    private boolean payed;


    public Transaction(int originWallet, int destinationWallet, int IsepCoins) {
        this.originWallet = originWallet;
        this.destinationWallet = destinationWallet;
        this.IsepCoins = IsepCoins;
        this.payed = false;
    }


    public int getIsepCoins() { return IsepCoins; }


    public int getOriginWallet() { return originWallet; }


    public int getDestinationWallet() { return destinationWallet; }


    public boolean isPayed() { return payed; }


    public void setPayed(boolean x) { payed = x; }


    public void pay() {
        Wallet origin = Main.wallets.get(originWallet);
        Wallet destination = Main.wallets.get(destinationWallet);
        if (origin == null || destination == null || originWallet == destinationWallet) {
            return;
        }
        if (origin.getIsepCoins() - IsepCoins < 0) {
            return;
        }
        origin.setIsepCoins(origin.getIsepCoins() - IsepCoins);
        destination.setIsepCoins(destination.getIsepCoins() + IsepCoins);
        payed = true;
    }
}
