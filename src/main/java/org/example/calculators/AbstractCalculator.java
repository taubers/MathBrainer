package org.example.calculators;

import java.util.Random;

abstract class AbstractCalculator {
    Random rand = new Random();

    private int firstNumber = rand.nextInt(1000);
    private int secondNumber = rand.nextInt(1000);
    protected int result;

    public int getFirstNumber() {
        return this.firstNumber;
    }
    public int getSecondNumber() {
        return this.secondNumber;
    }

    public int getResult(){
        return this.result;
    }

    public abstract void calculateExpectedResult();


    }



