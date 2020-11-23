package org.example.calculators;


public class DivisionExercise extends AbstractExercise {

    @Override
    protected void initializeArguments() {
        int a;
        int b;
        max = 20;

        do {
            a = rand.nextInt(max - min) + min;
            b = rand.nextInt(max - min) + min;
            divisionNumberGeneratorCounter++;
        } while (a == 0 || b == 0 || a % b != 0 || b >= a);

        firstNumber = a;
        secondNumber = b;
        operator = "/";
    }

    @Override
    public void calculateExpectedResult() {
        result = getFirstNumber() / getSecondNumber();
    }

}


