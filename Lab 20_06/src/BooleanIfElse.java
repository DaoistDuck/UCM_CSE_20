import java.util.Scanner;

public class BooleanIfElse{
	public static void main(String[] args) {
		int a = 0, b = 0;

		Scanner in = new Scanner(System.in);
		System.out.print("Input the first number: ");
		a = in.nextInt();
		System.out.print("Input the second number: ");
		b = in.nextInt();

		if (a > b)
			System.out.println(a + " is greater than " + b);
		else if (a < b)
			System.out.println(a + " is less than " + b);
		else if (a == b)
			System.out.println(a + " is equal to " + b);
		else if (a >= b)
			System.out.println(a + " is greater or equal to " + b);
		else if (a <= b)
			System.out.println(a + " is less than or equal to " + b);
		else if (a != b)
			System.out.println(a + " is not equal to " + b);
	}
	//////////////////////////////////////////////////////
	/* Assessment Logic Check
	 * 
	 * Dead Code means that you repeated code, so its just wasted space
	 * 
	 * There can only be one output statement showing relation between a and b
	 * 
	 * impossible how this code is set up because you have a less than line and equal line and then a less than and equal line
	 * So it runs code, but it will run into the less than line or the equal line.
	 * 
	 * 
	 */
	//////////////////////////////////////////////////////
} 