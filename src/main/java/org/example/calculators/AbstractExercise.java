package org.example.calculators;

import java.util.Random;

public abstract class AbstractExercise {
    Random rand = new Random();

    protected int firstNumber;
    protected int secondNumber;
    protected String operator;
    protected int result;

    public AbstractExercise(){
        initializeArguments();
        calculateExpectedResult();
        getOperator();

    }


    protected void initializeArguments(){
        firstNumber = rand.nextInt(100);
        secondNumber = rand.nextInt(100);
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

    public abstract String getOperator();

    public abstract void calculateExpectedResult();


}


