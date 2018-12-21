package com.epam.assignment_elte.utils;

public class Math {

    /**
     * We can assume that the inputs are valid (e.g. years is positive)
     * I used double for easier testing, but:
     * https://dzone.com/articles/never-use-float-and-double-for-monetary-calculatio
     */
    public long interestRate(double base, double interestRate, int years) {
        for (int i = 0; i < years; i++) {
             base += base*interestRate;
        }
        return (long) base;
    }

    public int greatesCommonDivisor(int a, int b) {
        if (b == 0) {
            return a;
        }
        if (a == 0) {
            return b;
        }
        return greatesCommonDivisor(b, a % b);
    }

}
