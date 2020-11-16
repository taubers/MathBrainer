package org.example;


// The purpose of the App is to teach to calculate numbers in the head - both for kids and adults.

import org.example.calculators.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        //AbstractExercise exercise = new AdditionExercise();

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int i = 0;

        while(i == 0) {
            AbstractExercise exercise = new DivisionExercise();
            System.out.println("Apēķini:\n");
            System.out.println(exercise.getFirstNumber() + " / " + exercise.getSecondNumber() + " = " + "X\n");
            System.out.println("Cik ir X?");
            System.out.println(exercise.getResult());


            int answer = Integer.parseInt(br.readLine());

            while (answer != exercise.getResult()) {
                System.out.println("\nNav labi! Mēģini vēlreiz! \n\n" + "Cik ir " + exercise.getFirstNumber() + " / " + exercise.getSecondNumber() + " ?");
                answer = Integer.parseInt(br.readLine());
            }
            System.out.println("Yesss, pareizi!!! \n\n");

        }




    }
}