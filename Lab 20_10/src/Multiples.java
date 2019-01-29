import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the max number:");
		int max = input.nextInt();
		
		System.out.println("Enter the Base");
		int base = input.nextInt();
		
		int i;
		for(i = 0; i <= max; i += base) {
			
			System.out.println("Number " + i);
			
		}
		
	
	}
}
