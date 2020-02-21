import java.util.Scanner;

public class BookQuestion65{
	public static void main ( String [] args ){

		Scanner scan = new Scanner (System.in);
		System.out.print ("Write your email > ");
		String email = scan.next();
		int  at = email.indexOf('@');
		
		String username = email.substring (0, at);
		String domainName = email.substring ( at + 1);
		System.out.println ("\nYour username is " + username + "\nThe domain name is " + domainName);
		
	}
}