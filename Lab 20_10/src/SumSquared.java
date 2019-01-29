import java.util.Scanner;

public class SumSquared {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int squared, result = 0;
		
		System.out.println("Please enter the max number:");
		int max = input.nextInt();
			
		int i;
		for(i = 0; i <= max; i ++) {
			squared = i * i;
			
			System.out.println("Number " + i + " squared is " + squared);
			result += squared;
		}
		
		System.out.println("Sum of squares is " + result);
	}
}
