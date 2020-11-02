package org.example;

import java.util.Random;

public class AdditionCalculator {
    Random rand = new Random();

    private int firstNumber = rand.nextInt(1000);
    private int secondNumber = rand.nextInt(1000);
    int result;

public AdditionCalculator(){
    applyOperation();
}

    public int getFirstNumber() {
        return this.firstNumber;
    }

    public int getSecondNumber() {
        return this.secondNumber;
    }

    private void applyOperation(){
    this.result = firstNumber + secondNumber;
    }

    public int getResult() {
        return this.result;
    }


}
