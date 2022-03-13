package com.yogesh;

import java.util.Scanner;

class ArithmeticOp {

    public static void main(String[] args) {

        int x = 10;
        int y = 20;
//        int z = 0;
        double z = 0.0;

       //ArithmeticOp Div
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);

        System.out.println(10f / 3); // single precision - up to 7 decimal digits value
        System.out.println(10 / 3.0); // double precision - up to 15 decimal digits value

        System.out.println( x / z ); // When z = 0 >>> We will get ( divided by zero error)
        System.out.println( x / -z); // When z = 0.0 ( double value) >> we will get Infinity or -Ve Infinity value



    }
}

class RelationalOp {

    public static void main(String[] args) {
        // Relational Op always returns boolean result

        int x = 10;
        int y = 20;

        System.out.println("x is greater than y:" + (x > y));
        System.out.println("x is less than y:" + (x < y));
        System.out.println("x is greater than or equal to y:" + (x >= y));
        System.out.println("x is less than or equal to y:" + (x <= y));
        System.out.println("x is equal to y:" + (x == y));
        System.out.println("x is not equal to y:" + (x != y));

//        Relational Op can not be applied on all boolean combinations
//        Only allowed boolean combination are eithe "Equality Op" or "Not Equal op"

//        System.out.println(true > false); // Not allowed
        System.out.println(true == false); // Allowed
        System.out.println(true != false); // Allowed

    }
}

class logicalOp {

    public static void main(String[] args) {

// Logical single AND, OR and, Exclusive OR
// For these logical Op, both condition will be validated
// In case of Exclusive OR ^ both conditions must be opposite to each other then  >> we will get true result else result will be false

        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println("a is greater :"+ ((a > b) & (a > c)));
        System.out.println("b is greater :"+ ((b > a) | (b > c)));
        System.out.println("b is greater :"+ ((b > a) ^ (b > c)));
        System.out.println("b is greater :"+ ((b > a) ^ (b > c)));

    }
}

class LogicalDoubleOp {

    public static void main(String[] args) {

//  Logical double AND, OR and, Exclusive OR
// For these logical Op, if first condition is "false" then remaining condition will not be validated and will be skipped.
//  NOTE : Logical Op are applied when there are two or more conditions

        int a = 10 ;
        int b = 20;
        int c = 30;

        System.out.println((a > b) || ( a++ > c++));

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}

class BitwiseOp {

    public static void main(String[] args) {

        int x = 20;
        int y = 4;

        System.out.println(x & y); // Bitwise AND >> 4
        System.out.println(x | y); // Bitwise OR >> 20

        System.out.println(x ^ y); // Bitwise XOR ^ >> 4


    }
}

class TernaryOp {

//    static int age;
    public static void main(String[] args) {
//        Syntax >>> ?: --- Applied on there operands
//        variable = Exp1 (Condition) ? Exp2 : Exp3;
//        It is also called as If Else operator

        int age;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age : ");
//        int age = input.nextInt();
        age = input.nextInt();

        String votingEligibility = (age > 20 && age <= 100)? ("You are eligible for voting") : ("You are not eligible for voting");
        System.out.println(votingEligibility);

    }
}