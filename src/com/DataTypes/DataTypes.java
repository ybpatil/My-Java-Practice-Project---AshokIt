package com.DataTypes;

// Data Types in Java :
// Boolean
    /* Boolean Data Type :
      - Mainly there are two types of Data in Java as below:
        1) Primitive data type - It stores only single value

        2) Non-Primitive data types / reference data type :
             Ex. String, Array etc
      - In java boolean is used to represent true or false
      - Size : 1 byte / VM dependent
      - Values : true or false
      - Default values : false
      - Syntax : boolean keyword & varName --> Ex boolean on = true;
      - true and false are reserved words (keywords) in java, they have to be always written in small case letter
      - Java is statically typed PL hence data type is always verified at " compilation time "
     */

public class DataTypes {

//    static boolean b; // Static or class variable

    public static void main(String[] args) {

        boolean b = true;
        System.out.println("Default value of boolean :"+b);

        boolean x = true;

        if (x == true)
            System.out.println("Yeah, it's correct");

    }

}

// Byte
/*
  - The byte data type is 8 bit signed 2's compliment integer // signed means from -ve to +ve
  - Size : 1 byte (8 bit)
  - Defalut value : 0
  - Values / range : -128 to 0, 127
  - Syntax : byte keyword followed by varName Ex. byte age = 28;
  - Java is statically typed PL hence data type is always verified at " compilation time "
 */
class ByteDataType {

    public static void main(String[] args) {

        byte age = 28;

        System.out.println("Age is: "+ age);

        //Within the range
        byte a = 126;
        System.out.println(a); // 126

        //Within the range
        a++;  // 127
        System.out.println(a);

        //Overflow --> Looping back within the range
        a++; // 128 - overflow hence looping back within the range
        System.out.println(a);

        //Overflow --> Looping back within the range
        a++;
        System.out.println(a);


    }

}

// short
/*
 - 16 bit signed 2's compliment data type
 - Size : 2 byte ( 16 bits)
 - Value / range : -32768 to 0, 32767
 - Default value : 0
 - Syntax : short keyword followed by varName Ex. short empNum = 2323233;

 */
class ShortDataType{

    public static void main(String[] args) {
        short s = 32000;
        System.out.println("Value of s : "+ s);
    }
}

// int
/*
 - 32 bit signed 2's compliment data type
 - Size : 4 byte ( 32 bits)
 - Value / range : -2147483648 to 0, 2147483647
 - Default value : 0
 - Syntax : short keyword followed by varName Ex. int empNum = 2147483647;
 - int data type id Default data type for "INTEGER Category" data type
 - char >> byte >> short >> int >> long >> float >> double

 */
class IntDatatype {

    public static void main(String[] args) {

        int num = 2147483647; // here literal  " 2147483648 " will be out range
        System.out.println("print num : "+num);

        //

        byte x = 10;
        short y = 30;

//        byte z = x  + y; // When we do operation on two byte types of variables, we will get comp. error
//        short z = x + y; // When we do operation on two short types of variables, we will get comp. error
//        System.out.println(z);
//        System.out.println(z);
//        char a = 'A';
//        int s = a + x; //When we do operation on two byte types of variables, we will get comp. error
//        System.out.println(s);

//******** For char, byte and short -->> RESULT will always be of int type (int is Default data type) ********

        int z = x + y; //
        System.out.println(z);


    }
}

// long
/*
  - The long data type is 64 bit signed 2's compliment integer // signed means from -ve to +ve
  - Size : 8 byte (64 bit)
  - Defalut value : 0
  - Values / range :
  - Syntax : long keyword followed by varName Ex. long infinity = 32323231322;
  - Java is statically typed PL hence data type is always verified at " compilation time "
 */
class LongDataType {

    public static void main(String[] args) {

        long x = 123456789l; // suffix l or L is optional
        System.out.println(x);

    }
}

// Floating point data types
// float
/*
  - Single precision 32 bit (4 byte)
  - The float data type is 32 bit signed 2's compliment integer // signed means from -ve to +ve
  - Size : 4 byte (32 bit)
  - Default value : 0.0
  - Values / range : up to 7 decimal digits Ex. 3.3333333
  - Syntax : float keyword followed by varName Ex. float marks = 87.56f;
  - default data type is "double"
 */
class  FloatDataType {

    public static void main(String[] args) {

        float f = 10.0f / 3; // When you intend to use float data type use suffix "f or F" as default
        System.out.println(f);
    }
}

// double
/*
  - Double precision 64 bit (8 byte)
  - The float data type is 64 bit signed 2's compliment integer // signed means from -ve to +ve
  - Size : 8 byte (64 bit)
  - Default value : 0.0
  - Values / range : up to 15 decimal digits Ex. 3.3333333
  - Syntax : float keyword followed by varName Ex. double marks = 3.333333333333;
  - default data type is "double"
 */
class DoubleDataType {

    public static void main(String[] args) {

        double d = 10.0 / 3;
        System.out.println(d);
    }
}


