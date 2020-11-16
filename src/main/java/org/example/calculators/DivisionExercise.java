package org.example.calculators;


public class DivisionExercise extends AbstractExercise {

    @Override
    public void initializeArguments(){
        firstNumber = 51;
        secondNumber = 3;
    }

    @Override
    public void calculateExpectedResult() {
        result = getFirstNumber() / getSecondNumber();

    }
}

