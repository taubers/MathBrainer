package org.example.calculators;

public class SimplifiedDivisionExercise extends AbstractExercise {

    @Override
    protected void initializeArguments() {
        secondNumber = rand.nextInt(max - min) + min;
        result = rand.nextInt(max - min) + min;
        firstNumber = secondNumber * result;
        operator = "/";
    }

    @Override
    public void calculateExpectedResult() {
        result = getFirstNumber() / getSecondNumber();
    }

}
