import java.util.Scanner;

public class Bobcar3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner kybd = new Scanner(System.in);
		String name = "";
		int userInput = 0, rentalDays = 0, clubMember = 0, executivePackage = 0, price = 0;
		double base = 0, discount = 0, executivePackageCost = 0, total = 0;

		System.out.println("Available cars: 1 for Economy, 2 for Compact, 3 for Standard");
		System.out.println("Please choose the rental car: ");
		userInput = kybd.nextInt();
		System.out.println("Please enter the number of rental days: ");
		rentalDays = kybd.nextInt();
		System.out.println("Club member?: 1 for yes, 0 for no:");
		clubMember = kybd.nextInt();

		if (clubMember == 1) {
			System.out.println("Platinum Executive Package?: 1 for yes, 0 for no:");
			executivePackage = kybd.nextInt();
		}

		if (userInput == 1) {
			price = 35;
			name = "Economy ";
		} else if (userInput == 2) {
			price = 45;
			name = "Compact ";
		} else {
			price = 95;
			name = "Standard";
		}

		base = price * rentalDays;
		System.out.println("Base: " + rentalDays + " days for a " + name + " @ $" + price + " per day: $" + base);

		if (clubMember == 1) {
			discount = (rentalDays / 7) * price;
			System.out.println("Club Member Discount: " + "                     -$" + discount);
			if (executivePackage == 1) {
				executivePackageCost = base * .15;
				System.out.println("Platinum Package is                         $" + executivePackageCost);
			}
		}

		total = base - discount + executivePackageCost;
		System.out.println("Total Estimate for Rental:                  $" + total);
	}
}
