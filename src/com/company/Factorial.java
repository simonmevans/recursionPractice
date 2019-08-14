package com.company;

import java.util.Scanner;

public class Factorial {
    private int n;

    Factorial() {
        long finalNum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an int and I will find factorial");
        try {
            n = input.nextInt();
            finalNum = factorial(n);
            System.out.println("The answer is : " + finalNum);

        } catch (Exception ex) {
            System.out.println("You did not enter an int.");
        }

    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
