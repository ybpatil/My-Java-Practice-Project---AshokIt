package com.DecisionMaking;

import java.util.Scanner;

public class DecisionMaking {

    public static void main(String[] args) {

//        If (condition )
//        block of statement to be executed if condition is evaluated to true
//        Condition should return a boolean result

        int age;
        boolean isAlive;
        Scanner input = new Scanner(System.in); // take input by creating a object of Scanner class
        System.out.print("Enter your age : ");
        age = input.nextInt();
        char a = input.

        if (age > 18 )
            System.out.println("Eligible for voting");
        else
            System.out.println("Not eligible for voting");
        System.out.println("How are you felling ?"); // This is ordinary statement and will be executed even if "If block's condition is not evaluated to true

    }
}
