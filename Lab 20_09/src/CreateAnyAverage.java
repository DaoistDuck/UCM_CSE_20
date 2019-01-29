import java.util.Scanner;

public class CreateAnyAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int result = 0;
		System.out.print("Please enter the max number:");

		int max = input.nextInt();
		int i = 0;
		while ( i <= max) {
			
			System.out.println("Number " + i);
			result += i++;	
			
		}
		
		System.out.println("Average of All: " + (result/max) );
	}
}
