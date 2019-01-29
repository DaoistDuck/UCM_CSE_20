/**
 * 
 */

/**
 * @author Daoist Duck
 *
 */
import java.util.Scanner;

public class Bobcar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Scanner kybd = new Scanner(System.in);
		int economy = 35;
		int compact = 45;
		int standard = 95;

		int price = 0;
		int userInput, rentalDays, clubMember, executivePackage;
		double base = 0;
		double discount = 0;
		double executivePackageCost = 0;
		double total = 0;
		System.out.println("Available cars: 1 for Economy, 2 for Compact, 3 for Standard");
		System.out.println("Please choose the rental car: ");
		userInput = kybd.nextInt();
		System.out.println("Please enter the number of rental days: ");
		rentalDays = kybd.nextInt();
		System.out.println("Club member?: 1 for yes, 0 for no:");
		clubMember = kybd.nextInt();
		System.out.println("Platinum Executive Package?: 1 for yes, 0 for no:");
		executivePackage = kybd.nextInt();

		switch (userInput) {

		///// economy
		case 1:
			base = rentalDays * economy;
			discount = (rentalDays / 7) * economy;
			executivePackageCost = base * .15;
			total = base - discount + executivePackageCost;
			switch (clubMember) {
			case 1:
				switch (executivePackage) {
				case 1:
					System.out.println(
							"Base: " + rentalDays + " days for a Economy @ $" + economy + " per day: $" + base);
					System.out.println("Club Member Discount: " + "                    -$" + discount);
					System.out.println("Platinum Executive Package: " + "               $" + executivePackageCost);
					System.out.println("");
					System.out.println("Total Estimate for Rental:                 $" + total);
					break;
				case 0:
					System.out.println(
							"Base: " + rentalDays + " days for a Economy @ $" + economy + " per day: $" + base);
					System.out.println("Club Member Discount: " + "                    -$" + discount);
					System.out.println("");
					System.out.println("Total Estimate for Rental:                 $" + total);

					break;
				}

				break;

			case 0:
				System.out.println("Base: " + rentalDays + " days for a Economy @ $" + economy + " per day: $" + base);
				System.out.println("");
				System.out.println("Total Estimate for Rental:                 $" + total);

				break;
			}
			break;
		///// economy

		///// compact
		case 2:
			base = rentalDays * compact;
			discount = (rentalDays / 7) * compact;
			executivePackageCost = base * .15;
			total = base - discount + executivePackageCost;
			switch (clubMember) {

			case 1:
				switch (executivePackage) {
				case 1:
					System.out.println(
							"Base: " + rentalDays + " days for a Compact @ $" + compact + " per day: $" + base);
					System.out.println("Club Member Discount: " + "                    -$" + discount);
					System.out.println("Platinum Executive Package: " + "               $" + executivePackageCost);
					System.out.println("");
					System.out.println("Total Estimate for Rental:                 $" + total);

					break;
				case 0:
					System.out.println(
							"Base: " + rentalDays + " days for a Compact @ $" + compact + " per day: $" + base);
					System.out.println("Club Member Discount: " + "                    -$" + discount);
					System.out.println("");
					System.out.println("Total Estimate for Rental:                 $" + total);

					break;
				}
				break;

			case 0:
				System.out.println("Base: " + rentalDays + " days for a Economy @ $" + compact + " per day: $" + base);
				System.out.println("");
				System.out.println("Total Estimate for Rental:                 $" + total);

				break;
			}
			break;
		////// compact

		////// standard
		case 3:
			base = rentalDays * standard;
			discount = (rentalDays / 7) * standard;
			executivePackageCost = base * .15;
			total = base - discount + executivePackageCost;
			switch (clubMember) {
			case 1:
				switch (executivePackage) {
				case 1:
					System.out.println(
							"Base: " + rentalDays + " days for a Standard @ $" + standard + " per day: $" + base);
					System.out.println("Club Member Discount: " + "                     -$" + discount);
					System.out.println("Platinum Executive Package: " + "                $" + executivePackageCost);
					System.out.println("");
					System.out.println("Total Estimate for Rental:                  $" + total);

					break;
				case 0:
					System.out.println(
							"Base: " + rentalDays + " days for a Compact @ $" + compact + " per day: $" + base);
					System.out.println("Club Member Discount: " + "                    -$" + discount);
					System.out.println("");
					System.out.println("Total Estimate for Rental:                 $" + total);

					break;
				}
				break;

			case 0:
				System.out.println("Base: " + rentalDays + " days for a Compact @ $" + compact + " per day: $" + base);
				System.out.println("");
				System.out.println("Total Estimate for Rental:                 $" + total);

				break;
			}
			break;
		/////// standard
		}

	}
}
