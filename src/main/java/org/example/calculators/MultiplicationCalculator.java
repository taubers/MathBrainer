package org.example.calculators;

import org.example.calculators.AbstractCalculator;

public class MultiplicationCalculator extends AbstractCalculator {
    @Override
    public void calculateExpectedResult(){
        this.result = getFirstNumber() * getSecondNumber();
    }
}
