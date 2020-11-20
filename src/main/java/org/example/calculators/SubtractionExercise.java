package org.example.calculators;

public class SubtractionExercise extends AbstractExercise {

    @Override
    protected void initializeArguments() {
        firstNumber = rand.nextInt(100 + 1 - 2) + 2;
        secondNumber = rand.nextInt(100 + 1 - 2) + 2;
        operator = "-";
    }

    @Override
    public void calculateExpectedResult(){
        result = getFirstNumber() - getSecondNumber();
    }


}
