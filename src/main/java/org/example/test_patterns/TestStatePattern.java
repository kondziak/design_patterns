package org.example.test_patterns;

import org.example.state_pattern.OneArmBandit;

public class TestStatePattern {

    public static void testStatePattern() {
        OneArmBandit oneArmBandit = new OneArmBandit();
        oneArmBandit.insertCoin();
        oneArmBandit.pullTheLever();
        oneArmBandit.takeThePrize();
    }
}
