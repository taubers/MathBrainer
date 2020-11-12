package org.example.calculators;

public class SubtractionCalculator extends AbstractCalculator {

    @Override
    public void calculateExpectedResult(){
        result = getFirstNumber() - getSecondNumber();
    }
}
