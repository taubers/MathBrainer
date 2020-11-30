package org.example.calculators;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;


public class DivisionExercise extends AbstractExercise {
    Date date = new Date();
    BufferedWriter bw;
    int counter = 0;


    @Override
    protected void initializeArguments() {


        int a;
        int b;


        do {

            a = rand.nextInt(MAX - MIN) + MIN;
            b = rand.nextInt(MAX - MIN) + MIN;
            counter++;
        } while (a == 0 || b == 0 || a % b != 0 || b >= a);

        firstNumber = a;
        secondNumber = b;

    }

    @Override
    protected void initializeOperator() {
        operator = "/";
    }

    @Override
    public void calculateExpectedResult() {
        result = getFirstNumber() / getSecondNumber();
    }

    private void logRandomTrials(){
        System.out.println("\nVienādojums uzģenerēts ar " + counter + " mēģinājumiem!");

        //Operations to store Random trials of generating valid numbers for division into a text file
        try {
            bw = new BufferedWriter(new FileWriter("RandomTrialsForDivisionExercise.txt", true));
            bw.write(counter + " trials on " + date.toString() + "\n");
            bw.close();
        } catch (IOException exception) {
            System.out.println("Could not process the operation");
        }
    }



}


