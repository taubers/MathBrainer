package org.example.calculators;

public class DivisionExerciseSimplified extends AbstractExercise{

    @Override
    protected void initializeArguments() {
        max = 20;
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
