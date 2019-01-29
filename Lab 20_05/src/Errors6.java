import java.util.Scanner;

public class Errors6 {

	public static void main(String[] args) {
		System.out.println("This program will ask the user for three sets of two numbers and will calculate the average of each set.");

		Scanner input = new Scanner(System.in);

		int i_n1, i_n2;// changed so i can use n1 but the letter in front indiciates the type 

		System.out.print("Please enter the first number:");
		i_n1 = input.nextInt();

		System.out.print("Please enter the second number:");
		i_n2 = input.nextInt();

		int i_average;
		i_average = (i_n1+i_n2)/2;
		System.out.println("The average of the numbers is " + i_average);

		float f_n1, f_n2;// changed from i_n1 to f_n1 to show float

		System.out.print("Please enter the first number:");
		f_n1 = input.nextFloat();

		System.out.print("Please enter the second number:");
		f_n2 = input.nextFloat();

		float f_average;
		f_average = (f_n1+f_n2)/2;
		System.out.println("The average of the numbers is " + f_average);

		
		short s_n1, s_n2;

		System.out.print("Please enter the first number:");
		s_n1 = input.nextShort();

		System.out.print("Please enter the second number:");
		s_n2 = input.nextShort();

		int shortAvg;
		shortAvg = (int)(s_n1+s_n2)/2;
		System.out.println("The average of the numbers is " + shortAvg);
	}
// there was syntax errors 
	// I knew I found all the bugs when I run the code and it did what it was suppose to do
	// my testing strategy was to see if my run code and see if the numbers were suppose to be int or float at those moments.
}
