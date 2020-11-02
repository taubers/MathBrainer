package org.example;

public class SubtractionCalculator extends AdditionCalculator{

    public SubtractionCalculator(){
        applyOperation();
    }

    private void applyOperation(){
        this.result = getFirstNumber() - getSecondNumber();
    }
}
