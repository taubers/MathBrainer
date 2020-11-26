package org.example.calculators;

// This Class is a second version of DivisionExercise class
// This class generates numbers instantly compared with DivisionExercise (which needs several attempts until valid numbers are generated)

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
