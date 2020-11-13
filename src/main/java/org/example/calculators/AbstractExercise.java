package org.example.calculators;

import java.util.Random;

public abstract class AbstractExercise {
    Random rand = new Random();

    private int firstNumber = rand.nextInt(100);
    private int secondNumber = rand.nextInt(100);
    protected int result;

    public AbstractExercise(){
        calculateExpectedResult();
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

    public abstract void calculateExpectedResult();



}


