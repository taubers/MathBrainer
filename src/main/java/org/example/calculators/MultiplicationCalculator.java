package org.example.calculators;

public class MultiplicationCalculator extends Exercise {

    @Override
    public void calculateExpectedResult(){
        result = getFirstNumber() * getSecondNumber();
    }
}
