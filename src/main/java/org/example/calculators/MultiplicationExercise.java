package org.example.calculators;

public class MultiplicationExercise extends AbstractExercise {

    protected void initializeArguments() {
       firstNumber = rand.nextInt(20 + 1 - 2) + 2;
       secondNumber = rand.nextInt(20 + 1 - 2) + 2;
    }

    @Override
    public void calculateExpectedResult(){
        result = getFirstNumber() * getSecondNumber();
    }

    @Override
    public String getOperator(){
        operator = " * ";

        return operator;
    }

}
