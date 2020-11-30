package org.example.calculators;

public class SubtractionExercise extends AbstractExercise {

    @Override
    protected void initializeOperator() {
        operator = "-";
    }

    @Override
    public void calculateExpectedResult() {
        result = getFirstNumber() - getSecondNumber();
    }


}
