import java.util.Scanner;

public class BookQuestion51{
	public static void main ( String [] args ){

		Scanner scan = new Scanner (System.in);
		System.out.print ("Write a name you want to put as your email > ");
		String domainName = scan.next ();
		System.out.println("Your Internet domain name is www." 
							+ domainName + ".com");

	}
}