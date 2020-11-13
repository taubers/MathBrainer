package org.example.calculators;

public class SubtractionCalculator extends Exercise {

    @Override
    public void calculateExpectedResult(){
        result = getFirstNumber() - getSecondNumber();
    }
}
