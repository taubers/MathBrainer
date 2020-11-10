package org.example;

public class MultiplicationCalculator extends AbstractCalculator{
    @Override
    public void calculateExpectedResult(){
        this.result = getFirstNumber() * getSecondNumber();
    }
}
