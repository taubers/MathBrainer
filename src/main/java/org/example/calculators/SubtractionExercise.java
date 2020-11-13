package org.example.calculators;

public class SubtractionExercise extends AbstractExercise {

    @Override
    public void calculateExpectedResult(){
        result = getFirstNumber() - getSecondNumber();
    }
}
