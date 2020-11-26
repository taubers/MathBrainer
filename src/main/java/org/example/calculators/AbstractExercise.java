package org.example.calculators;

import java.security.SecureRandom;
import java.util.Random;

public abstract class AbstractExercise {

    Random rand = new Random();

    protected int firstNumber;
    protected int secondNumber;
    protected String operator;
    protected int result;
    protected static final int min = 2;
    protected static final int max = 100;

    public AbstractExercise() {
        initializeArguments();
        calculateExpectedResult();
    }


    protected void initializeArguments() {
        firstNumber = rand.nextInt(max - min) + min;
        secondNumber = rand.nextInt(max - min) + min;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public int getResult() {
        return result;
    }

    public String getOperator() {
        return operator;
    }

    public abstract void calculateExpectedResult();

}


