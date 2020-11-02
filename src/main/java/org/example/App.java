package org.example;

// The purpose of the App is to teach to calculate numbers in the head - both for kids and adults.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {

        Calculator calculator = new Calculator();

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Apēķini:\n");
        System.out.println(calculator.first_number + " + " + calculator.second_number + " = " + "X\n");
        System.out.println("Cik ir X?");

        int answer = Integer.parseInt(br.readLine());

        while (answer != calculator.result) {
            System.out.println("\nNav labi! Mēģini vēlreiz! \n\n" + "Cik ir " + calculator.first_number + " + " + calculator.second_number + " ?");
            answer = Integer.parseInt(br.readLine());
        }
        System.out.println("Nu, ta beidzot!!! :)");
    }
}