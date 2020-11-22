package org.example.calculators;


public class DivisionExercise extends AbstractExercise {

    @Override
    protected void initializeArguments() {
        int a;
        int b;

        do {
            a = rand.nextInt(100 + 1 - 2) + 2;
            b = rand.nextInt(100 + 1 - 2) + 2;
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


