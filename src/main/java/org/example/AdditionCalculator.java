package org.example;

public class AdditionCalculator extends AbstractCalculator{

    @Override
    public void calculateExpectedResult(){
        this.result = getFirstNumber() - getSecondNumber();
    }



}
