package org.example;

import java.util.Random;

public class Calculator {
    Random rand = new Random();

    private int firstNumber = rand.nextInt(1000);
    private int secondNumber = rand.nextInt(1000);
    private int result;

    public int getFirstNumber() {
        return this.firstNumber;
    }

    public int getSecondNumber() {
        return this.secondNumber;
    }

    public int getResult() {
        return this.result = firstNumber + secondNumber;
    }


}
