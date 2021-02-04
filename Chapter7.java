/*
 * Chapter 7 - Arrays and References 
 * Think Java, 2nd Edition 
 * Demonstration to create and use arrays, a data structure 
 */

import java.util.*; // imports java.util.Scanner, java.util.Random and all other packages

public class Chapter7 {
	public static void main(String[] args) {
		// array 
		/*
		int[] number; // declare an int array with identifier
		number = new int[10]; // assigning memory space (10 elements) to number
		*/
		// or it can be declared in a single line
		final int MAX_INDEX = 10;
		int[] number = new int[MAX_INDEX];
		int[] temp = new int[MAX_INDEX];
		Random rand = new Random();

		// initialize arrays with random numbers
		for (int index = 0; index < number.length; index++) {
			number[index] = rand.nextInt(101); // returns an integer between 1 and 100
		}
		
		for (int index = 0; index < temp.length; index++) {
			temp[index] = rand.nextInt(101);
		}

		// printing array without index
		System.out.println(number);
		System.out.println(temp);

		for (int index = 0; index < number.length; index++) {
			System.out.print(number[index] + " ");
		}
		System.out.println();

		for (int index = 0; index < temp.length; index++) {
			System.out.print(temp[index] + " ");
		}
		System.out.println();

		//number = temp; // copying temp array to number array - shallow copy
		System.out.println();

		// deep copy - temp array to number array 
		for (int index = 0; index < number.length; index++) {
			number[index] = temp[index];
		}

		// output arrays
		for (int index = 0; index < number.length; index++) {
			System.out.print(number[index] + " ");
		}
		System.out.println();

		for (int index = 0; index < temp.length; index++) {
			System.out.print(temp[index] + " ");
		}
		System.out.println();


		/*
		// output array - ascending order by index
		System.out.print("Array in ascending index order: ");
		for (int index = 0; index < number.length; index++) {
			System.out.print(number[index] + " ");
		}
		System.out.println();

		// output array - descending order by index
		System.out.print("Array in descending index order: ");
		for (int index = number.length - 1; index >= 0; index--) {
			System.out.print(number[index] + " ");
		}
		System.out.println();

		// using an enhanced for loop to traverse in ascending order
		for (int value : number) {
			System.out.print(value + " ");
		}
		System.out.println();
		*/
	} // end main
} // end class Chapter 7
