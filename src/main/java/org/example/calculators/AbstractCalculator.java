package org.example.calculators;

import java.util.Random;

public abstract class AbstractCalculator {
    Random rand = new Random();

    private int firstNumber = rand.nextInt(1000);
    private int secondNumber = rand.nextInt(1000);
    protected int result;

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public int getResult() {
        return result;
    }

    public abstract void calculateExpectedResult();

    }


