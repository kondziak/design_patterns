package org.example.state_pattern;

public class OneArmBandit {

    private State state;

    public OneArmBandit() {
        this.state = new NoCoinState();
    }

    public void insertCoin() {
        state.insertCoin(this);
    }

    public void pullTheLever() {
        state.pullTheLever(this);
    }

    public void takeThePrize() {
        state.takeThePrize(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
