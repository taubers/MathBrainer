package org.example.calculators;

// This Class is a second version of DivisionExercise class
// This class generates numbers instantly compared with DivisionExercise (which needs several attempts until valid numbers are generated)

public class SimplifiedDivisionExercise extends AbstractExercise {

    @Override
    protected void initializeArguments() {
        firstNumber = secondNumber * result;
    }

    @Override
    protected void initializeOperator() {
       operator = "/";
    }

    @Override
    public void calculateExpectedResult() {
        result = getFirstNumber() / getSecondNumber();
    }

}
