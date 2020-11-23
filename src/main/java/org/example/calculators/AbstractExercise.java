package org.example.calculators;

import java.security.SecureRandom;
import java.util.Random;

public abstract class AbstractExercise {

    Random rand = new Random();

    protected int firstNumber;
    protected int secondNumber;
    protected String operator;
    protected int result;
    public int divisionNumberGeneratorCounter = 0;
    protected int min = 2;
    protected int max = 100;

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

    // will be deleted later
    public static AbstractExercise getExercise() {
        int exercisePicker = new SecureRandom().nextInt(4);
        switch (exercisePicker) {
            case 0:
                return new AdditionExercise();
            case 1:
                return new SubtractionExercise();
            case 2:
                return new DivisionExerciseSimplified();
            case 3:
                return new MultiplicationExercise();
            default:
                throw new IllegalStateException("Unexpected value: " + exercisePicker);
        }

    }
}


