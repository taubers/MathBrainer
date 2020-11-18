package org.example.calculators;

public class AdditionExercise extends AbstractExercise {

    @Override
    public void calculateExpectedResult(){
        result = getFirstNumber() + getSecondNumber();
    }

    @Override
    public String getOperator(){
        operator = " + ";

        return operator;
    }





}
