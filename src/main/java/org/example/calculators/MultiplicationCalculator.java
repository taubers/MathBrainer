package org.example.calculators;

public class MultiplicationCalculator extends AbstractCalculator {

    @Override
    public void calculateExpectedResult(){
        result = getFirstNumber() * getSecondNumber();
    }
}
