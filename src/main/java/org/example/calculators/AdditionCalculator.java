package org.example.calculators;

import org.example.calculators.AbstractCalculator;

public class AdditionCalculator extends AbstractCalculator {

    @Override
    public void calculateExpectedResult(){
        this.result = getFirstNumber() + getSecondNumber();
    }



}
