/**
 * 
 */

/**
 * @author Daoist Duck
 *
 */
import java.util.Scanner;
import java.lang.Math;
public class Interviewer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name; 
		int weight;
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is your name and your age? "); 
		name = input.nextLine(); 
		
		
		//
		System.out.print("Enter your weight?");
		weight = input.nextInt();
		float weightkg = (float) (weight / 2.2);
		System.out.println("His name and age is " + name); 
		System.out.print("He weigh " + weightkg + " in kilograms");
	}

}
