/**
 * 
 */

/**
 * @author Daoist Duck
 *
 */
import java.util.Scanner;

public class Manipulate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kybd = new Scanner(System.in);

		/////////// -----------------------------------------------------

		int i_n1, i_n2;
		System.out.println("Hi, I am Java Helper to help you learn about manipulating variables");

		System.out.println("For starters, please type an interger");
		i_n1 = kybd.nextInt();

		System.out.println("Now, a second interger please");
		i_n2 = kybd.nextInt();

		int i_add, i_sub, i_mul, i_div, i_rem;

		i_add = i_n1 + i_n2;
		System.out.println("The two numbers add up to " + i_add);

		i_sub = i_n1 - i_n2;
		System.out.println("The two numbers subtract up to " + i_sub);

		i_mul = i_n1 * i_n2;
		System.out.println("The two numbers multiply up to " + i_mul);

		i_div = i_n1 / i_n2;
		System.out.println("The two numbers divide up to " + i_div);

		i_rem = i_n1 % i_n2;
		System.out.println("The reminder of the first number from the second number is " + i_rem);

		/////////// ------------------------------------------------------
		/////////// -------------------------------------------------------

		int s_n1, s_n2;
		System.out.println("Now I would like to ask for 2 shorts, the first one");
		s_n1 = kybd.nextInt();
		System.out.println("The second one");
		s_n2 = kybd.nextInt();

		int s_add, s_sub, s_mul, s_div, s_rem;

		s_add = (short) (s_n1 + s_n2);
		System.out.println("The two numbers add up to " + s_add);

		s_sub = (short) (s_n1 - s_n2);
		System.out.println("The two numbers subtract up to " + s_sub);

		s_mul = (short) (s_n1 * s_n2);
		System.out.println("The two numbers multiply up to " + s_mul);

		s_div = (short) (s_n1 / s_n2);
		System.out.println("The two numbers divide up to " + s_div);

		s_rem = (short) (s_n1 % s_n2);
		System.out.println("The reminder of the first number from the second number is " + s_rem);

		/////////// ---------------------------------------------------------
		/////////// --------------------------------------------------------

		float f_n1, f_n2;
		System.out.println("Also, I would like to ask for 2 floats, the first one");
		f_n1 = kybd.nextFloat();
		System.out.println("The second one");
		f_n2 = kybd.nextFloat();

		float f_add, f_sub, f_mul, f_div, f_rem;

		f_add = (f_n1 + f_n2);
		System.out.println("The two numbers add up to " + f_add);

		f_sub = (f_n1 - f_n2);
		System.out.println("The two numbers subtract up to " + f_sub);

		f_mul = (f_n1 * f_n2);
		System.out.println("The two numbers multiply up to " + f_mul);

		f_div = (f_n1 / f_n2);
		System.out.println("The two numbers divide up to " + f_div);

		f_rem = (f_n1 % f_n2);
		System.out.println("The reminder of the first number from the second number is " + f_rem);

		/////////// -------------------------------------------------------------------
		/////////// -------------------------------------------------------------------

		double d_n1, d_n2;
		System.out.println("Also, I would like to ask for 2 doubles, the first one");
		d_n1 = kybd.nextDouble();
		System.out.println("The second one");
		d_n2 = kybd.nextDouble();

		double d_add, d_sub, d_mul, d_div, d_rem;

		d_add = (d_n1 + d_n2);
		System.out.println("The two numbers add up to " + d_add);

		d_sub = (d_n1 - d_n2);
		System.out.println("The two numbers subtract up to " + d_sub);

		d_mul = (d_n1 * d_n2);
		System.out.println("The two numbers multiply up to " + d_mul);

		d_div = (d_n1 / d_n2);
		System.out.println("The two numbers divide up to " + d_div);

		d_rem = (d_n1 % d_n2);
		System.out.println("The reminder of the first number from the second number is " + d_rem);

		/////////// --------------------------------------------------------------------

		System.out.println("Thank you for taking this course on how to manipulate variables.");
		System.out.println("Good Bye");

	}

}
