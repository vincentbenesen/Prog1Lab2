import java.util.Scanner;

public class BookQuestion54{
	public static void main (String [] args ){

		Scanner scan = new Scanner (System.in);
		System.out.print ("Write a number you want to calculate > ");
		double number = scan.nextDouble ();
		System.out.println ("\nThe cube root of the number that you chose is " 		
							+ Math.pow(number, 3));
	}
}