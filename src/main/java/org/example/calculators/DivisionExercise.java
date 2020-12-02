package org.example.calculators;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Date;


public class DivisionExercise extends AbstractExercise {
    long start;
    long finish;

    @Override
    protected void initializeArguments() {
        this.start = System.nanoTime();
        int counter = 0;


        int a;
        int b;


        do {
            a = rand.nextInt(MAX - MIN) + MIN;
            b = rand.nextInt(MAX - MIN) + MIN;
            counter++;

        } while (a == 0 || b == 0 || a % b != 0 || b >= a);


        firstNumber = a;
        secondNumber = b;


        this.finish = System.nanoTime();
        logRandomTrials(counter);

    }


    @Override
    protected void initializeOperator() {
        operator = "/";
    }

    @Override
    public void calculateExpectedResult() {
        result = getFirstNumber() / getSecondNumber();
    }

    private void logRandomTrials(int counter) {
        Date date = new Date();
        BufferedWriter bw;
        DecimalFormat df = new DecimalFormat("#.#########");
        df.setRoundingMode(RoundingMode.CEILING);
        long timeElapsed = finish - start;
        double timeElapsedSeconds = (double) timeElapsed / 1000000000;

        System.out.println("\nVienādojums uzģenerēts ar " + counter + " mēģinājumiem " + timeElapsed + " nanosekundēs" + " jeb " + df.format(timeElapsedSeconds) + " sekundēs!\n");

        //Operations to store Random trials of generating valid numbers for division into a text file
        try {
            bw = new BufferedWriter(new FileWriter("output/RandomTrialsForDivisionExercise.txt", true));
            bw.write(counter + " trials on " + date.toString() + " within " + timeElapsed + " nanoseconds" + " or " + df.format(timeElapsedSeconds) + " seconds\n");
            bw.close();
        } catch (IOException exception) {
            System.err.println("Could not process the operation" + exception.getMessage());
        }
    }
}


