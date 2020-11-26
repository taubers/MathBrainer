package org.example.calculators;


public class DivisionExercise extends AbstractExercise {


    @Override
    protected void initializeArguments() {
        int a;
        int b;
        int counter = 0;

        do {

            a = rand.nextInt(max - min) + min;
            b = rand.nextInt(max - min) + min;
            counter++;
        } while (a == 0 || b == 0 || a % b != 0 || b >= a);

        firstNumber = a;
        secondNumber = b;
        operator = "/";
        System.out.println("\nVienādojums uzģenerēts ar " + counter + " mēģinājumiem!");
    }

    @Override
    public void calculateExpectedResult() {
        result = getFirstNumber() / getSecondNumber();
    }

}


