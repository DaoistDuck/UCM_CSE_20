/**
 * 
 */

/**
 * @author Daoist Duck
 *
 */
import java.util.Scanner;
public class Interviewer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name; 
		String dorm;
		String reason;
		String spare_time;
		String major;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is your name? "); 
		name = input.nextLine(); 
		
		System.out.print("Their name is "); 
		System.out.println(name); 
		//
		System.out.print("What dorm are you in?");
		dorm = input.nextLine();
		
		System.out.print(name + " lives in ");
		System.out.println(dorm);
		//
		System.out.print("Why did you choose UC Merced?");
		reason = input.nextLine();
		
		System.out.print(name + " went to UC Merced ");
		System.out.println(reason);
		//
		System.out.print("What do you like to do in your spare time?");
		spare_time = input.nextLine();
		
		System.out.print(name + " likes to ");
		System.out.println(spare_time);
		//
		System.out.print("What is your major?");
		major = input.nextLine();
		
		System.out.print(name + " majors in ");
		System.out.println(major);

	}

}
