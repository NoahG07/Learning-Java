/*
 * Think Java 2nd Edition
 * Chapter 6 - Loops and Strings
 */

import java.util.Scanner;

public class Chapter6 {
	public static void main(String[] args) {
		// declaring variables
		int n;

		// while loop
		System.out.println("Testing a while loop.");

		n = 0;
		while (n < 10) { // <= this is a flag or sentinel (test)
		System.out.println("This is a set of lines.");
		System.out.println("Ending set of lines " + n + "\n");
		n = n + 1; // Or use n++ to increment the variable n by 1.
		} // end while

		// for loops (counter loops)
		System.out.println("Testing a for loop.");

		for (n = 1; n <= 10; n++) { // intialize, test, change flag
			System.out.println("This is a set of lines.");
			System.out.println("Ending set of lines " + n + "\n");
		} // end for loop
		
		// do while loop
		System.out.println("Testing a do-while loop.");
		n = 1;
		do {
			System.out.println("This is a set of lines.");
			System.out.println("Ending set of lines " + n + "\n");
			//n++;
		} while (++n <= 10);
	} // end class main
} // end class Chapter6
