package org.example.calculators;

public class DivisionCalculator extends AbstractCalculator {

    @Override
    public void calculateExpectedResult(){
        result = getFirstNumber() / getSecondNumber();
    }
}

