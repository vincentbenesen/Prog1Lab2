import java.util.Scanner;
import java.text.NumberFormat;

public class BookQuestion57{
	public static void main ( String [] args ){

		Scanner scan = new Scanner (System.in);
		System.out.print ("Write the amount of quarters, dimes and nickels that you want to convert > ");
		int quarters = scan.nextInt();
		int dimes = scan.nextInt();
		int nickels = scan.nextInt();

		double quartersToDollars = quarters * 0.25;
		double dimesToDollars = dimes * 0.10;
		double nickelsToDollars = nickels * 0.05;
		double totalAmount = quartersToDollars + dimesToDollars + nickelsToDollars;

		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println("\nYour total money is " + money.format(totalAmount));
	}
}