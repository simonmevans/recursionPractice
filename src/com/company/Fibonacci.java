package com.company;

import java.util.Scanner;

public class Fibonacci {
    int n;

    public long fib(int num) {
        System.out.println(num);
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        } else
            return (fib(num - 1) + fib(num - 2));
    }

    Fibonacci() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to compute Fibonacci sequence.");
        try {
            n = input.nextInt();
            System.out.println("The sequence is " + fib(n));
        } catch (Exception ex) {
            System.out.println("Int not entered");
        }
    }
}
