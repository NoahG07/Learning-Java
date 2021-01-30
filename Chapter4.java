/*
 * Chapter 4
 * Example coding to provide clarity to concepts with methods and testing 
*/

public class Chapter4 {

	/*
	 * Method that takes as a parameter the radius of a circle and 
	 * returns the value of the area of the circle 
	 */
	public static double area(double radius) {
		double temp; // holds the value of area
		temp = Math.PI * Math.pow(radius, 2.0);
		return temp; // return the area of the circle based on radius
	} // end area

	public static void printTime(int hour, int minute) {
		System.out.print("The current time is: ");
		System.out.print(hour);
		System.out.print(":");
		System.out.println(minute);
	} // end printTime

	public static void printTwice(String s) {
		System.out.println(s);
		System.out.println(s);
	} // end printTwice

	public static void newLine() {
		System.out.println(); // prints a blank line
	} // end newLine

	public static void main(String[] args) {
		// variable declarations
		double value = 45.598594703;
		double x; // Section 4.2
		double angle = 32; // Section 4.2
		
		// Section 4.1
		System.out.printf("The square root of 17 is: %.6f\n", Math.sqrt(17.0));
		System.out.printf("The value of PI to 7 digits is: %.7f\n", Math.PI);
		System.out.printf("The value of E to 8 digits is: %.8f\n", Math.E);
		System.out.printf("The value variabled rounded is: %d\n", Math.round(value));
		
		// Section 4.2
		x = Math.cos(angle + (Math.PI / 2.0)); // order of precedence
		System.out.println("Cosing of angle + PI/2: " + x); //
		System.out.println("12 to the power of 4 is: " + Math.pow(12,4));

		// Section 4.3 - Defining your own methods (4.4 and 4.6)
		newLine(); // prints a blank line

		// Secions 4.5 and 4.7
		// printTwice
		System.out.println("\nSection 4.5 and 4.7");
		printTwice("The quick brown fox jumps over the lazy dog.");
		
		// printTime
		printTime(12, 50);

		// area of a circle
		System.out.println("The area of a circle is: " + area(4.5));

	} // end main
} // end class Chapter4
