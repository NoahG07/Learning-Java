/*
 * Chapter 6 - Part 2 
 * Related to strings and characters 
 */

import java.util.Scanner; 
public class Chapter6Part2 {
	public static void main (String[] args) {
		// declaring variables
		int number = 34; // 4 bytes of RAM
		double realNumber = 4.56; // 8 bytes of RAM
		String message = "Hello World!";
		String msg1 = "Banana";
		String msg2 = "banana";
		String temp;
		
		// example of iteration
		for (int index = 0; index < message.length(); index++) {
			System.out.print("The character at index: " + index);
			System.out.println(" is: " + message.charAt(index));
		}
		
		// example from textbook
		System.out.print("Roman Alphabet: ");
		for (char c = 'A'; c <= 'Z'; c++) { // variables do not work with double quotations ""
			System.out.print(c);
		}
		System.out.println();

		// indexOf method 
		System.out.println("Position of first o in message: " + message.indexOf("o"));
		System.out.println("Position of second o in message: " + message.indexOf("o", 5));

		// substring method - variablename.substring(x,y)
		System.out.println(message.substring(0, 3)); // Hel
		System.out.println(message.substring(6, 10)); // Worl

		// comparison equals 
		System.out.println(msg1 == msg2);
		// String variables are objects
		System.out.println(msg1.equals(msg2)); // equals method is better for strings

		temp = String.format("%s %s %s", message, msg1, msg2);
		System.out.println(temp);
	} // end main
} // end class Chapter 6 Part 2
