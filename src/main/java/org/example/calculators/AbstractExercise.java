package org.example.calculators;

import java.util.Random;

public abstract class AbstractExercise {
    Random rand = new Random();

    private int firstNumber;// = 0;//rand.nextInt(100);
    private int secondNumber;// = ;
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
    
    public void renewExercise(){
        this.firstNumber = rand.nextInt(100);
        this.secondNumber = rand.nextInt(100);
    }

    public abstract void calculateExpectedResult();



}


