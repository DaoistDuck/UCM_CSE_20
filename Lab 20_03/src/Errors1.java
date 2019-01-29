import java.util.Scanner;
public class Errors1 {

	public static void main(String[] args) {
		//System.out.println("Can you spot and fix the errors?);
		System.out.println("Can you spot and fix the errors?");
		
		System.out.println("Enter two numbers and I ");
		System.out.println("add them for you");

		int n1, n2;

		//Scanner keyboard = new Scanner(System.in)
		Scanner keyboard = new Scanner(System.in);
		//n1 = nextInt();
		//n2 = nextint();
		n1 = keyboard.nextInt();
		n2 = keyboard.nextInt();
		//System.println("The sum of the numbers is");
		System.out.println("The sum of the numbers is");
		//System.out.println(n1 - n2);
		System.out.println(n1 + n2);
		
		/*
		 * there was 6 errors that I found in there
		 * I knew I found all the errors when my code worked properly
		 * yes, naming convention is important to avoid errors because
		 *  it helps you remember where this is coming from
		 */
	}
}