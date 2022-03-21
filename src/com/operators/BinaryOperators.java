package com.operators;

public class BinaryOperators {

    public static void main(String[] args) {

//        int x = 10;
//        int y = 0;
//
//        // Arithmetic Addition
//        System.out.println(x + y);
//
//        // Arithmetic Sub
//        System.out.println(x - y);
//
//        // Arithmetic Multiplication
//        System.out.println(x * y);
//
//        // Arithmetic Division
//        System.out.println(x / y);
//
//        // Arithmetic Modulo
//        System.out.println(x % y);
//
//        // Arithmetic Division
//        System.out.println(x / y); // When divided by zero, we get arithmetic exception in Java

        int a = 10; // if -10 --> -Infinity
        double b = 0.0;
        System.out.println(a / b); // When divided by 0.0, we get infinity in Java

//        int a = 10;
//        double b = 0; // Here, 0 is considered as double data type internally hence answer will "INFINITY"
//        System.out.println(a / b); // When divided by 0.0, we get infinity in Java

//        int c = 0;
//        int d = 10;
//        System.out.println(c / d); // Result will be Zero

    }
}

class RelationalsOptr {

    // Used to check for relations like equality, lesser than or greater than and less than or equal to or greater than equal to.
    // This type of operator always returns "Boolean Results"
    /*   == Equality

         != Not equal to
         > Greater than
         < Less than
         >= Greater than or equal to
         <= Less than or equal to
     */
    public static void main(String[] args) {

//        int x = 10;
//        int y = 20;
//
//        System.out.println("X is greater than y :"+ (x > y));
//        System.out.println("X is less than y :"+ (x < y));
//        System.out.println("X is greater or equal than y :"+ (x >= y));
//        System.out.println("X is less than or equal to y :"+ (x <= y));
//        System.out.println("X is equal to y :"+ (x == y));
//        System.out.println("X is not equal to y :"+ (x != y));


        /* Relational operators can not be applied to all boolean combinations.
           Only allowed boolean combinations are : Equal To (==) and Not Equal To (!=)
         */

//        // Boolean combination not allowed
//        System.out.println(true > false);

        // Boolean combination allowed
        System.out.println(true == false);

        // Boolean combination allowed
        System.out.println(true != false);


    }
}

class LogicalOptr {

    // Logical Operators : Logical operators are used to check whether an expression is true or false.
    // They are used in decision making.
    /*
       Logical AND -  ( && ) --> If both conditions are true result will be true else false
       Logical Or - (||) --> If one of conditions is true result will be true else false
       Logical Exclusive XOR - ( ^ ) --> If both conditions are oposite to each other than result will be true else false
       Logical Not - ( ! )
     */

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

//        System.out.println("a is greater :"+ ((a < b) && (a < c))); //
//        System.out.println("b is greater :"+ ((a < b) || (b > c)));
        System.out.println("b is greater :"+ ((b > a) ^ (b < c))); // t,f -- true f,t --true
//        System.out.println("b is greater :"+ !((b < a) ^ (b > c))); // false

//        System.out.println(((a < b) && (a++ > c++)));
        System.out.println(((a < b) || (a++ < c++)));

        System.out.println("value of a :"+a);
        System.out.println("value of a :"+b);
        System.out.println("value of a :"+c);


    }
}

class BitwiseOptr {

    public static void main(String[] args) {

        int a = 20;
        int b = 4;

        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);

    }
}

class TernaryOptr {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int result = (a > b) ? (a + b) : (a - b);
        System.out.println("Result : "+result);
    }
}