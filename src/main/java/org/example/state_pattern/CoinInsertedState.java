package org.example.state_pattern;

import java.util.Random;

public class CoinInsertedState implements State{

    @Override
    public void insertCoin(OneArmBandit context) {
        System.out.println("The coin has already been inserted. Pull the lever");
    }

    @Override
    public void pullTheLever(OneArmBandit context) {
        boolean isWin = ProbabilityCalculator.calculateProbability(5) == 0;
        if (isWin) {
            System.out.println("You won!");
            context.setState(new WinState());
        } else {
            System.out.println("You lost!");
            context.setState(new NoCoinState());
        }
    }

    @Override
    public void takeThePrize(OneArmBandit context) {
        System.out.println("First pull the lever!");
    }

    @Override
    public void printState() {
        System.out.println("CoinInsertedState");
    }
}
