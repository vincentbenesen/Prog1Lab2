import java.util.Scanner;

public class BookQuestion52{
	public static void main (String [] args ){

		Scanner scan = new Scanner (System.in);
		System.out.print ("Write any word u want> ");
		String wordUwant =scan.next ();
		String allCaps = wordUwant.toUpperCase();
		String allLow = wordUwant.toLowerCase();
		System.out.println ("\n" + allCaps + "\n" + allLow +
							"\n" + wordUwant);

	}
}