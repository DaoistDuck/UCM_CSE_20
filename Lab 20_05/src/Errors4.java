import java.util.Scanner;

public class Errors4 {

	public static void main(String[] args) {

		int n1, n2;

		Scanner keyboard;

		System.out.println("Enter two ints and we print out sum as an int.");

		keyboard = new Scanner(System.in);

		n1 = keyboard.nextInt();

		System.out.print("Enter the first number: ");

		System.out.print("Enter the second number: ");
		n2 = keyboard.nextShort();

		System.out.println("The sum of the numbers is " + (int)(n1+n2));// change float to int
	}
// there was only 1 error in this code
	// I knew I found all the error once my code ran properly
	// test the program and see if the answer was in int or float.
}