import java.util.*;

public class CreateAnyAverageArr {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(
				"This program will find the average of any numbers. Please choose amount of numbers to average:");
		System.out.println("Please choose amount of numbers to average:");

		int max = input.nextInt();

		int[] arr1 = new int[max];

		int i;
		int total = 0;
		int average = 0;
		for (i = 0; i < max; i++) {

			System.out.println("Please enter " + i + " number:");
			arr1[i] = input.nextInt();
			total += arr1[i];

		}
		System.out.println("The numbers being averaged:");
		for (i = 0; i < max; i++) {
			System.out.print(arr1[i ]);
			System.out.print("\t");

			if ((i % 5) == 0 && (i != 0)) {
				System.out.println();
			}
		}
		System.out.println();
		average = total/max;
		System.out.println("Average is: "+ average);

	}
}
