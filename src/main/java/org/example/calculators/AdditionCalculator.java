package org.example.calculators;

public class AdditionCalculator extends AbstractCalculator {

    @Override
    public void calculateExpectedResult(){
        result = getFirstNumber() + getSecondNumber();
    }






}
