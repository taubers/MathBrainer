package org.example;

// The purpose of the App is to teach to calculate numbers in the head - both for kids and adults.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class App {
    public static void main(String[] args) throws IOException {
        //JOptionPane pane = new JOptionPane();
        // Any easy way to add UI?

        Random rand = new Random();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        int first_number = rand.nextInt(1000);
        int second_number = rand.nextInt(1000);
        int result = first_number + second_number;

        System.out.println("Apēķini:\n");
        System.out.println(first_number + " + " + second_number + " = " + "X\n");
        System.out.println("Cik ir X?");

        int answer = Integer.parseInt(br.readLine());

        while (answer != result) {
            System.out.println("\nNav labi! Mēģini vēlreiz! \n\n" + "Cik ir " + first_number + " + " + second_number + " ?");
            answer = Integer.parseInt(br.readLine());
        }
        System.out.println("Nu, ta beidzot!!! :)");
    }
}