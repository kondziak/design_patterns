package org.example.state_pattern;

public class NoCoinState implements State{

    @Override
    public void insertCoin(OneArmBandit context) {
        System.out.println("The coin was inserted");
        context.setState(new CoinInsertedState());
    }

    @Override
    public void pullTheLever(OneArmBandit context) {
        System.out.println("Insert the coin");
    }

    @Override
    public void takeThePrize(OneArmBandit context) {
        System.out.println("Insert the coin");
    }

    @Override
    public void printState() {
        System.out.println("NoCoinState");
    }
}
