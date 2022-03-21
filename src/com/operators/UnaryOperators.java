package com.operators;

public class UnaryOperators {

	public static void main(String[] args) {

//		// Variable declaration and Initialisation
//		int x = 10;
//
//		// Unary Minus - Applied on single Operand
//		// Converts a +ve to -ve value
//		int y = -x;
//
//		//Result
//		System.out.println("y value :"+ y);

		// Increment Operator
		// Used for incrementing value by 1 : It may be either Pre and Post Increment
		// Post : Value is first used for operation and then incremented ex. a++
		// Pre : Value is first incremented and then used for operation ex. ++a
		
//		int a = 10;
//		System.out.println("value of a :"+a);
//		//Incrementing the value by 1
//		a++;
//		System.out.println("after increment :"+a);

		
		int x = 10;
		int y = 20;
		int z = 30;

		int sum = x++ + --y + ++z; // 10 + 19 + 31
		System.out.println(sum); // x = 11 + 19 + 31

//		int sum = x + y + z;
//		System.out.println(sum);

//		System.out.println("x value:"+ x);
//		System.out.println("y value:"+ y);
//

	}

}
