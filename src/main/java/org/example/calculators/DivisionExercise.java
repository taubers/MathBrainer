package org.example.calculators;

public class DivisionExercise extends AbstractExercise {

    @Override
    public void calculateExpectedResult(){
        result = getFirstNumber() / getSecondNumber();
    }
}

