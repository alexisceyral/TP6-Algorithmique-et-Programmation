package org.example;


import java.util.Random;

public class Wallet {
    private static final Random Rnd = new Random(10000);

    private final String Owner;
    private final int Token;
    private int IsepCoins;

    public Wallet(String Owner){
        this.Owner=Owner;
        this.Token= Rnd;
        this.IsepCoins=0;
    }

    public String getOwner() {
        return Owner;
    }

    public int getToken() {
        return Token;
    }

    public int getIsepCoins() {
        return IsepCoins;
    }

    public void setIsepCoins(int IsepCoins) {
        this.IsepCoins = IsepCoins;
    }
    @Override
    public String toString() {
        return Owner + " (#" + Token + ", " + IsepCoins + " IsepCoins)";
    }

}
