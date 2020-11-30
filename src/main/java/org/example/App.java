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


        while (true) {
            int answer;
            AbstractExercise exercise = ExerciseFactory.getExercise();

            String expression = exercise.getFirstNumber() + " " + exercise.getOperator() + " " + exercise.getSecondNumber() + " = " + "X\n";

            do {
                System.out.println("Apēķini:\n");
                System.out.println(expression);
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
