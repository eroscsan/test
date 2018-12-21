package com.epam.assignment_elte.lotto;

import java.util.Random;

public class RandomGenerator {

    private Random random;

    public RandomGenerator(Random random) {
        this.random = random;
    }

    /**
     * from and to are inclusive limits, so a 1,3 input can result in 1,2 and 3
     */
    public int getNumber(int from, int to) {
        if (from >= to) {
            throw new IllegalArgumentException("invalid range");
        }
        return random.nextInt(to - from) + from;
    }
}
