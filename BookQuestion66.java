import java.util.Scanner;
import java.text.DecimalFormat;

public class BookQuestion66{
	public static void main ( String [] args ){

		Scanner scan = new Scanner (System.in);
		System.out.print ("Write your phone number > ");
		String phoneNumber = scan.next();
		String phone1 = phoneNumber.substring (0, 3);
		String phone2 = phoneNumber.substring (3, 6);
		String phone3 =phoneNumber.substring (6);
		System.out.println ("Your number is " + "(" + phone1 + ") " + phone2 + "-" + phone3);


	}
}