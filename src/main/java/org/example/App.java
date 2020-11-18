package org.example;


// The purpose of the App is to teach to calculate numbers in the head - both for kids and adults.

import org.example.calculators.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class App {

    public static void main(String[] args) throws IOException {
        AbstractExercise additionExercise = new AdditionExercise();
        AbstractExercise subtractionExercise = new SubtractionExercise();
        AbstractExercise divisionExercise = new DivisionExercise();
        AbstractExercise multiplicationExercise = new MultiplicationExercise();


        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        while(true) {
            AbstractExercise[] exercise = {additionExercise, subtractionExercise,divisionExercise,multiplicationExercise};
            int randomClassIndex = new Random().nextInt(exercise.length);

            System.out.println("Apēķini:\n");
            System.out.println(exercise[randomClassIndex].getFirstNumber() +
                    exercise[randomClassIndex].getOperator() +
                    exercise[randomClassIndex].getSecondNumber() + " = " + "X\n");
            System.out.println("Cik ir X?");


            int answer = Integer.parseInt(br.readLine());

            while (answer != exercise[randomClassIndex].getResult()) {
                System.out.println("\nNav labi! Mēģini vēlreiz! \n\n" + "Cik ir " +
                        exercise[randomClassIndex].getFirstNumber() +
                        exercise[randomClassIndex].getOperator() +
                        exercise[randomClassIndex].getSecondNumber() + " ?");
                answer = Integer.parseInt(br.readLine());
            }
            System.out.println("Yesss, pareizi!!! \n\n");

        }




    }
}