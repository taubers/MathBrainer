package org.example.calculators;

import java.security.SecureRandom;
import java.util.Random;

public abstract class AbstractExercise {
/*    AbstractExercise additionExercise = new AdditionExercise();
    AbstractExercise subtractionExercise = new SubtractionExercise();
    AbstractExercise divisionExercise = new DivisionExercise();
    AbstractExercise multiplicationExercise = new MultiplicationExercise();*/

    Random rand = new Random();

    protected int firstNumber;
    protected int secondNumber;
    protected String operator;
    protected int result;

    public AbstractExercise(){
        initializeArguments();
        calculateExpectedResult();
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

    public String getOperator(){
        return operator;
    };

    public abstract void calculateExpectedResult();

    public static AbstractExercise getExercise(){
        int exercisePicker = new SecureRandom().nextInt(4);
        AbstractExercise exercise;
        switch (exercisePicker){
            case 0:
                exercise = new AdditionExercise();
                break;
            case 1:
                exercise = new SubtractionExercise();
                break;
            case 2:
                exercise = new DivisionExercise();
                break;
            case 3:
                exercise = new MultiplicationExercise();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + exercisePicker);
        }

    return exercise;
    }


}


