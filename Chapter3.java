/*
 * Chapter 3 Discussion and example coding
 * Input and Output
*/

import java.util.Scanner; // needed for scanner class

public class Chapter3 {
	public static void main (String[] args) {
		// Section 3.1 package java.io
		// System.out.println(System.out);
		
		// Section 3.2 - Scanner class
		// declaration of variables 
		int number; // an integer variable
		String message; // a string variable
		int inch; // Section 3.4
		double cm; // Section 3.4
		//double cmPerInch = 2.54; // conversion of inches to centimeters
		final double CM_PER_INCH = 2.54;

		int inches; // Section 3.7
		int feet;
		Scanner in = new Scanner(System.in); // input needed for keyboard

		//number = 56; // assignment of variable number 
		// input value into number using keyboard
		System.out.print("Please enter a string: ");
		message = in.nextLine();

		System.out.print("Please enter an integer: ");
		number = in.nextInt(); // input an integer from keyboard and place in number
		
		System.out.println(message);
		System.out.println("My integer value is: " + number);


		// Section 3.4
		System.out.println("\nConvert inches to centimeters");
		
		// convert inches to centimeters
		System.out.print("How many inches need to be converted? ");
		inch = in.nextInt();
		System.out.println("The value for inches entered is: " + inch + " inches");

		// calculate centimeters
		cm = inch * CM_PER_INCH;
		System.out.println("The centimeters calculated is: " + cm + " cm");
		System.out.printf("%d in = %f cm\n", inch, cm);

		// Section 3.5
		System.out.println("\nCoding for section 3.5");
		System.out.println("Floating point division: " + (4.0 / 3.0));
		System.out.println("Integer division: " + (4 / 3));

		System.out.println("\nPrinting using printf");
		System.out.printf("Floating point division: %.3f\n", (4.0/3.0));

		// Section 3.7
		System.out.println("\nSection 3.7 - Remainder operator");
		System.out.print("Enter number of inches measured: ");
		inches = in.nextInt();
		// Calculate feet
		feet = inches * 12; // how many feet in inches?
		inches = inches % 12; // left over inches
		System.out.printf("%d feet and %d inches\n", feet, inches);
	} // end main
} // end class Chapter3
