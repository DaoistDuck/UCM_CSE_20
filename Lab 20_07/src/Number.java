import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number 0-25: ");
		double num = input.nextInt();
		
		if(num >= 0 && num <= 25)
		System.out.println("You have entered " + (char)(num+'A'));
		else
			System.out.println("The number you entered isnt within the range");
	}

}
