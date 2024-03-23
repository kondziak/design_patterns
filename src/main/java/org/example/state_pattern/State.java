package org.example.state_pattern;

public interface State {

    void insertCoin(OneArmBandit context);

    void pullTheLever(OneArmBandit context);

    void takeThePrize(OneArmBandit context);

    void printState();
}
