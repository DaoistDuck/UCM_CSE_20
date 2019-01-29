import java.util.Scanner;

public class Errors5 {

	public static void main(String[] args) {

		int weight, age;// moved up
		Scanner keyboard = new Scanner(System.in);// moved up
		
		System.out.print("What is your weight in kg?");
		weight = keyboard.nextInt();


		System.out.print("What is your age? ");
		age = keyboard.nextInt();

		System.out.println("Wow you are " + (int) (age*6.9) + " in dog years.");
		System.out.println("Your weight in lbs is " + (int) (weight * 2.2) + " with no decimal point");// added () around weight * 2.2 to changed the whole thing to int
	}
// there were 3 errors that I found
	// I knew I found all the errors once the code run properly
	// testing to see if the weight value had decimals places in answer and seeing if code run
}