package org.example.state_pattern;

public class WinState implements State{
    @Override
    public void insertCoin(OneArmBandit context) {
        System.out.println("Take the prize");
    }

    @Override
    public void pullTheLever(OneArmBandit context) {
        System.out.println("Take the prize");
    }

    @Override
    public void takeThePrize(OneArmBandit context) {
        System.out.println("Take the prize");
        context.setState(new NoCoinState());
    }

    @Override
    public void printState() {
        System.out.println("WinState");
    }
}
