package org.example.state_pattern;

import java.util.Random;

public class ProbabilityCalculator {

    public static int calculateProbability(int range) {
        Random random = new Random();
        return random.nextInt(range);
    }
}
