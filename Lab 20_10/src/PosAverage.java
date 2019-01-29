import java.util.Scanner;

public class PosAverage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int result = 0;
		int max = 0;
		int i = 0;
		do{
			result += max;	
			System.out.print("Enter " + i++ + " number: ");
			 max = input.nextInt();
								
		}while ( max > 0); 
		
		System.out.println("Average is: " + result/--i );
	}
}
