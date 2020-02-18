import java.util.Scanner;

public class NameIdentifier{
	public static void main (String [] args){

		Scanner scan = new Scanner (System.in);
		System.out.print ("What is your lastname, firstname >");
		String fullName = scan.nextLine ();

		int comma = fullName.indexOf(",");
		String firstName = fullName.substring (comma + 2);
		String firstLetter = firstName.substring (0,1);
		firstLetter = firstLetter.toUpperCase();
		String firstRemainder = firstName.substring(1);
		firstName = firstLetter + firstRemainder;

		String lastName = fullName.substring (0, comma);
		String lastNameFirstLetter = lastName.substring (0,1);
		lastNameFirstLetter = lastNameFirstLetter.toUpperCase();
		String lastNameRemainder = lastName.substring (1);
		lastName = lastNameFirstLetter + lastNameRemainder;

		fullName = firstName + " " + lastName;
		System.out.println ("Your full name is " + fullName);
	}
}