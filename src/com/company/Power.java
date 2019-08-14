package com.company;

import java.util.Scanner;

public class Power {

    public long findPower(int baseNum, int num) {

        if (num == 1)
            return baseNum;
        else
            return baseNum * findPower(baseNum, num - 1);
    }

    Power() {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter a base number");
            int baseNum = input.nextInt();
            System.out.println("Enter a power");
            int n = input.nextInt();
            System.out.println(findPower(baseNum, n));
        }catch(Exception ex){
            System.out.println("you did not enter an int");
        }
    }
}
