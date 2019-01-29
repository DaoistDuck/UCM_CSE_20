import java.util.Scanner;

public class Errors3
{
	public static void main(String[] args) 
	{
		//Scanner kbd = new Scanner System.in;
		Scanner kbd = new Scanner(System.in);
		//Int numerator;
		//integer denominator;
		int numerator, denominator;
		
		//System.println("This program divides two numbers.");
		System.out.println("This program divides two numbers.");
		
		//System.print("Enter the numerator: ");
		System.out.print("Enter the numberator ");
		numerator = kbd.nextInt();
		System.out.print("Enter the denominator: ");
		//denomintaor = kbd.nextInt();
		denominator = kbd.nextInt();

		//system.out.print(numerator);
		System.out.print(numerator);
		System.out.print("/");
		//system.out.Print(denominator);
		System.out.print(denominator);
		System.out.print(" = ");
		//System.out.Println((double) numerator/denominator);
		System.out.println((double) numerator/denominator);
		/*
		 * there was 10 errors that I found in there
		 * I knew I found all the errors when my code worked properly
		 * yes, naming convention is important to avoid errors because
		 *  it helps you remember where this is coming from
		 */
	}
}