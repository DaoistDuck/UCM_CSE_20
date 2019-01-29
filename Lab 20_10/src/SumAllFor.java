import java.util.Scanner;

public class SumAllFor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int result = 0;
		System.out.print("Please enter the max number:");

		int max = input.nextInt();
		int i;
		for(i = 0; i <= max; i++) {
			
			System.out.println("Number " + i);
			result += i;	
			
		}
		
		System.out.println("Sum of All: " + result );
	}
}
