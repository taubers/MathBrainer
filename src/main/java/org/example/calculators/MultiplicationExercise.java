package org.example.calculators;

public class MultiplicationExercise extends AbstractExercise {

    @Override
    protected void initializeArguments() {
       firstNumber = rand.nextInt(20 + 1 - 2) + 2;
       secondNumber = rand.nextInt(20 + 1 - 2) + 2;
       operator = "*";
    }

    @Override
    public void calculateExpectedResult(){
        result = getFirstNumber() * getSecondNumber();
    }


}
