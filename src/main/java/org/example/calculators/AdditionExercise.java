package org.example.calculators;

public class AdditionExercise extends AbstractExercise {

    @Override
    protected void initializeArguments() {
        firstNumber = rand.nextInt(max - min) + min;
        secondNumber = rand.nextInt(max - min) + min;
        operator = "+";
    }

        @Override
        public void calculateExpectedResult () {
            result = getFirstNumber() + getSecondNumber();
        }



    }

