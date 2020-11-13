package org.example;


// The purpose of the App is to teach to calculate numbers in the head - both for kids and adults.

import org.example.calculators.*;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        Exercise calculator = new AdditionCalculator();

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int i = 0;

        while(i == 0) {
            System.out.println("Apēķini:\n");
            System.out.println(calculator.getFirstNumber() + " + " + calculator.getSecondNumber() + " = " + "X\n");
            System.out.println("Cik ir X?");


            int answer = Integer.parseInt(br.readLine());

            while (answer != calculator.getResult()) {
                System.out.println("\nNav labi! Mēģini vēlreiz! \n\n" + "Cik ir " + calculator.getFirstNumber() + " + " + calculator.getSecondNumber() + " ?");
                answer = Integer.parseInt(br.readLine());
            }
            System.out.println("Yesss, pareizi!!! \n\n");

        }




    }
}