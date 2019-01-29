/**
 * 
 */

/**
 * @author Daoist Duck
 *
 */
import java.util.Scanner;

public class Bobcar2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double car, days, member, ppackage, ecobase, combase, stabase, ecodiscount, comdiscount, stadiscount,
		ecopackage, compackage, stapackage;
		int economy = 35;
		int compact = 45;
		int standard = 95;
		
		int price=0;
		
		Scanner kybd = new Scanner(System.in);
		System.out.println("Which car would you like. 1 for economy, 2 for compact, 3 for standard");
		car = kybd.nextInt();
		System.out.println("How long are you renting the car for?");
		days = kybd.nextInt();
		System.out.println("Are you a club Member? 1 for yes 2 for no");
		member = kybd.nextInt();
		System.out.println("Do you want the Platinum Executive Package? 1 for yes 2 for no.");
		ppackage = kybd.nextInt();
		String name="";
		if(car == 1)
		{
			price =35;
			name="Economy";
			if(member == 1) {
				
				if(ppackage == 1) {
					
					System.out.println("Base total of car is $" + days * economy);
					System.out.println("Discount is -$" + (days/7) * economy);
					System.out.println("Platinum Package is $" + economy*.15);
					System.out.println("Total estimate is $" + ((days * economy) - ((int)(days/7) * economy)) + (economy * .15) );
					
				} else if(ppackage == 2) {
					System.out.println("Base total of car is $" + days * economy);
					System.out.println("Discount is -$" + (days/7) * economy);
					System.out.println("Total estimate is $" + ((days * economy) - (int)(days/7) * economy));
					
				}
			} else if(member == 2){
				System.out.println("Total estimate of car is $" + days * economy);
			}
		}

		else if(car == 2)
		{
			price = 45;
			if(member == 1) {
				
				if(ppackage == 1) {
					
					System.out.println("Base total of car is $" + days * compact);
					System.out.println("Discount is -$" + (days/7) * compact);
					System.out.println("Platinum Package is $" + compact*.15);
					System.out.println("Total estimate is $" + ((days * compact) - ((int)(days/7) * compact)) + (compact * .15) );
					
				} else if(ppackage == 2){
					System.out.println("Base total of car is $" + days * compact);
					System.out.println("Discount is -$" + (days/7) * compact);
					System.out.println("Total estimate is $" + ((days * compact) - (int)(days/7) * compact));
					
				}
			} else if(member == 2){
				System.out.println("Total estimate of car is $" + days * compact);
			}
		}

		if(car == 3)
		{
			if(member == 1) {
				
				if(ppackage == 1) {
					
					System.out.println("Base total of car is $" + days * standard);
					System.out.println("Discount is -$" + (days/7) * standard);
					System.out.println("Platinum Package is $" + standard*.15);
					System.out.println("Total estimate is $" + ((days * standard) - ((int)(days/7) * standard)) + (standard * .15) );
					
				} else if(ppackage == 2) {
					System.out.println("Base total of car is $" + days * standard);
					System.out.println("Discount is -$" + (days/7) * standard);
					System.out.println("Total estimate is $" + ((days * standard) - (int)(days/7) * standard));
					
				}
			} else if(member == 2){
				System.out.println("Total estimate of car is $" + days * standard);
			}
		}
		
		
			
		
		System.out.println("Base total of car is $" + days * price);
		
		if(member==1) {
			System.out.println("Discount is -$" + (days/7) * price);
			}
		

	
	}
}

