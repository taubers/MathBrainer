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

        do {
            AbstractExercise exercise = AbstractExercise.getExercise();
            expression = exercise.getFirstNumber() + " " + exercise.getOperator() + " " + exercise.getSecondNumber() + " = " + "X\n";
            System.out.println("Apēķini:\n");
            System.out.println(expression);
            System.out.println("Cik ir X?");

            int answer = Integer.parseInt(br.readLine());

            while (answer != exercise.getResult()){
                System.out.println("Nav pareizi :( Mēģini vēlreiz... \n" + expression);
                answer = Integer.parseInt(br.readLine());

                }
            System.out.println("Malacis! Pareizi! :) \n");

            } while (true);



        }
}
