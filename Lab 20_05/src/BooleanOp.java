import java.util.Scanner;

public class BooleanOp{
	public static void main(String[] args) {
		
		int a = 0, b = 0 , c = 0;
        
		System.out.println('A' + " is character");
		Scanner in = new Scanner(System.in);
		System.out.print("Input the first number: ");
		a = in.nextInt();
		System.out.print("Input the second number: ");
		b = in.nextInt();
		System.out.print("Input the third number: ");

		System.out.println("a = " + a + " and b = " + b + " and c = " + c);
		System.out.println(a + " is greater than " + b + " : " + (a > b));
		System.out.println(a + " is less than " + b + " : " + (a < b));
		System.out.println(a + " is equal to " + b + " : " + (a == b));
		System.out.println(a + " is greater or equal to " + b + " : " + (a >= b));
		System.out.println(a + " is less than or equal to " + b + " : " + (a <= b));
		System.out.println(a + " is not equal to " + b + " : " + (a != b));

		System.out.println(a + " is greater than " + b + " OR " + a + " is equal to " + c + " : " + (a > b || a == c));
		System.out.println(a + " is less than " + b + " OR " + a + " is equal to " + c + " : " + (a < b || a == c));
		System.out.println(a + " is equal to " + b + " OR " + a + " is equal to " + c + " : " + (a == b || a == c));
		System.out.println(a + " is greater or equal to " + b + " AND " + a + " is equal to " + c + " : " + (a >= b && a == c));
		System.out.println(a + " is less than or equal to " + b + " AND " + a + " is equal to " + c + " : " + (a <= b && a == c));
		System.out.println(a + " is not equal to " + b + " AND " + a + " is equal to " + c + " : " + (a != b && a == c));

		System.out.println(a + " is less than " + b + " OR " + a + " is greater than " + c + " : " + (a < b || a > c));
		System.out.println(a + " is less than " + b + " OR " + a + " is less than " + c + " : " + (a < b || a < c));
		System.out.println(a + " is less than " + b + " OR " + a + " is equal to " + c + " : " + (a < b || a == c));
		System.out.println(a + " is less than " + b + " AND " + a + " is greater or equal to " + c + " : " + (a < b && a >= c));
		System.out.println(a + " is less than " + b + " AND " + a + " is less than or equal to " + c + " : " + (a < b && a <= c));
		System.out.println(a + " is less than " + b + " AND " + a + " is not equal to " + c + " : " + (a < b && a != c));
/*
 * 4 + 5 * 6 + 7 / 8
 * first thing we need to do is to multiply the 5 and 6 and also divide the 7 and 8
 * so the next line is 
 * 4+30+.875
 * now we just add all the numbers together
 * 34+.875
 * The results say that it is 34.875
 * 
 * Next, we have 
 * 4 + 5 * 6 < 7 / 8
 * First, we still multiply and divide out the numbers
 * 4+ 30 < .875
 * Then we add the 30 and 4
 * 34 < .875
 * The results say that 34 is less than .875
 * False
 * 
 * Next, we have
 * 4 + 5 > 6 && 7 < 8
 * first, add the 4 and 5
 * 9 > 6 && 7 < 8
 * The results say that 9 is greater than 6 and 7 is less than eight, so its true.
 * 
 * Final equation is 1 && 0
 * sno result because wrong statement
 *
 *Collaborator = Adrian Sanchez
 */
	}
} 