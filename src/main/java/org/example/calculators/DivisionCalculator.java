package org.example.calculators;

public class DivisionCalculator extends Exercise {

    @Override
    public void calculateExpectedResult(){
        result = getFirstNumber() / getSecondNumber();
    }
}

