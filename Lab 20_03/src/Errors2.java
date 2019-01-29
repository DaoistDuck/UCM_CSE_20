import java.util.Scanner;

public class Errors2 {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int number = 0;
		//int theSquare = 0;

		//System.out.print("Enter a number and I will ")
		System.out.print("Enter a number and I will ");
		//System.out.print("square it for you:  );
		System.out.print("and square it for you: ");
		//number =  keyboard.nextInt;
		number = kbd.nextInt();
		// thesquare = number * number;

		//System.out.print(number + " squared = ";
		System.out.print(number * number);
		//System.out.println("theSquare");
		System.out.print(" is the square of " + number);
		/*
		 * there was 6 errors that I found in there
		 * I knew I found all the errors when my code worked properly
		 * yes, naming convention is important to avoid errors because
		 *  it helps you remember where this is coming from
		 */
	}
}