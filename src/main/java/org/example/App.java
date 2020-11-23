package org.example;


// The purpose of the App is to teach to calculate numbers in the head - both for kids and adults.

import org.example.calculators.*;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String expression;
        int answer;

        while (true) {
            AbstractExercise exercise = AbstractExercise.getExercise();
            expression = exercise.getFirstNumber() + " " + exercise.getOperator() + " " + exercise.getSecondNumber() + " = " + "X\n";

            do {
                System.out.println("Apēķini:\n");
                System.out.println(expression);

                //temporary counter
                /*if (exercise.getOperator().equals("/")){
                    DivisionExercise counter = new DivisionExercise();
                    System.out.println("(Vienādojums uzģenerēts ar " + counter.divisionNumberGeneratorCounter + " mēģinājumiem) \n");
                }*/

                System.out.println("Cik ir X?");


                answer = Integer.parseInt(br.readLine());

                if (answer == exercise.getResult()) {
                    System.out.println("Malacis! Pareizi! :) \n");
                } else {
                    System.out.println("Nav pareizi :( Mēģini vēlreiz... \n");
                }
            } while (answer != exercise.getResult());
        }
    }
}
