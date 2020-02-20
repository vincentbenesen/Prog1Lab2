import java.util.Scanner;

public class BookQuestion56{
	public static void main ( String [] args ){

	Scanner scan = new Scanner (System.in);
	System.out.print ("Write your name with space \"Example Vincent Benesen\" > ");
	String fullName = scan.nextLine ();
	int space = fullName.indexOf(' ');
	String firstName = fullName.substring (0, space);
	String lastName = fullName.substring (space + 1);
	System.out.println ("\nYour first name is " + firstName 
						+ "\nYour last name is " + lastName);

	}
}