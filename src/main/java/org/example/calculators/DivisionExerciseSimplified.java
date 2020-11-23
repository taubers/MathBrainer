package org.example.calculators;

public class DivisionExerciseSimplified extends AbstractExercise{

    @Override
    protected void initializeArguments() {
        secondNumber = rand.nextInt(20 + 1 - 2) + 2;
        result = rand.nextInt(20 + 1 - 2) + 2;
        firstNumber = secondNumber * result;
        operator = "/";
    }

    @Override
    public void calculateExpectedResult() {
        result = getFirstNumber() / getSecondNumber();
    }

}
