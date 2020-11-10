package org.example;

public class SubtractionCalculator extends AbstractCalculator{

    @Override
   public void calculateExpectedResult(){ this.result = getFirstNumber() - getSecondNumber();
    }
}
