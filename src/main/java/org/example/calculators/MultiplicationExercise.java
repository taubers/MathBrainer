package org.example.calculators;

public class MultiplicationExercise extends AbstractExercise {

    @Override
    public void calculateExpectedResult(){
        result = getFirstNumber() * getSecondNumber();
    }
}
