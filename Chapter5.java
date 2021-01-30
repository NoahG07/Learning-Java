/*
 * Chapter 5
 * Conditionals and Logic
 * Demonstrations and Coding Examples using Java
 */

import java.util.Scanner;

public class Chapter5 {
	public static void main(String[] args) {
		// variables section
		int x = 12; // variable x and y used in examples
		int y = 4;
		boolean evenFlag;
		double a;
		double b;
		Scanner in = new Scanner(System.in); // for keyboard input as needed

		// Section 5.1 relational operators: ==, !=, <, <=, >, >=
		/*
		 * x == y    // x is equal to y
		 * x != y    // x is not equal to y
		 * x > y     // x is greater than y
		 * x >= y    // x is greater than or equal to y
		 * x < y     // x is less than y
		 * x <= y    // x is less than or equal to y
		 */

		// test out return value of relational operators
		/*
		System.out.println(x == y);
		System.out.println(x != y);
		System.out.println(x < y);
		System.out.println(x > y);
		System.out.println(x <= y);
		System.out.println(x >= y);
		*/


		// Section 5.2
		// if and if-else statements

		// check if x is greater than 0
		// conditional of x is greater than 0
		/*if (x > 0) {
			System.out.println("x is positive");
		}
		// x is less than or equal to 0
		else {
			System.out.println("x is not positive");
		}

		// check if x is an even or an odd number 
		// use of modulus operator (remainder operator)
		if (x % 2 == 0) {
			System.out.println("x is even");
		}
		else {
			System.out.println("x is odd");
		}
		*/


		// Section 5.3
		// chaining and nesting if-else statements
		/*
		x = 0;
		if (x > 0) {
			System.out.println("x is positive");
		}
		else {
			if (x < 0) {
				System.out.println("x is negative");
			}
			else {
				System.out.println("x is zero");
			}
		}
		*/


		// Section 5.4
		// Logical operators: && (and), || (or), ! (not)
		/*
		x = 0; y = 0;

		if (x == 0) {
			if (y == 0) {
				System.out.println("Both x and y are zero");
			}
		}

		// combined
		if (x == 0 && y == 0) {
			System.out.println("Both x and y are zero");
		}
		*/


		// Section 5.5 
		// De Morgan's Law
		/*
		 * !(A && B) is the same as !A || !B
		 * !(A || B) is the same as !A && !B
		 *
		 * !(x < 5 && y == 3) is the same as x >= 5 || y != 3 
		 * !(x >= 1 || y != 7) is the same as x < 1 && y == 7 
		 *
		 */

		/*
		x = 1;
		y = 1;
		// Example 1
		if (!(x == 0 || y == 0)) {
			System.out.println("Neither x nor y is zero");
		}

		// Example 2
		if (x != 0 && y != 0) {
			System.out.println("Neither x nor y is zero.");
		}
		*/

		// Section 5.6 and 5.7 
		// Boolean values and methods
		
		// check if x is an even or odd number 
		/*x = 24;
		//evenFlag = (x % 2) ==0;
		if (isEven(x)) {
			System.out.println(x + " is even");
		}
		else {
			System.out.println(x + " is odd");
		}*/

		// Section 5.8
		System.out.print("Enter a number: ");
		
		if (!in.hasNextDouble()) {
			String word = in.next();
			System.err.println(word + " is not a number");
			return;
		}

		a = in.nextDouble();
		b = Math.log(a);
		System.out.println("The log is " + b);
		
		// check if value is greater than or equal to zero
		if (a >= 0) {
			b = Math.log(a);
			System.out.println("The log is " + b);
		}
		else {
			System.out.println("The log is undefined.");
		}
	} // end main

	// method that returns true if integer is true
	public static boolean isEven(int number) {
		return ((number % 2) == 0);
	} // end isEven

} // end class Chapter5
