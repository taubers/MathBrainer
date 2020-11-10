package org.example;

public class DivisionCalculator extends AbstractCalculator{

    @Override
    public void calculateExpectedResult(){
        this.result = getFirstNumber() / getSecondNumber();
    }
}

