package org.example;

import java.util.Random;

public class Calculator {
    Random rand = new Random();

    int first_number = rand.nextInt(1000);
    int second_number = rand.nextInt(1000);
    int result = first_number + second_number;
}
