import java.util.Scanner;

public class BookQuestion50{
	public static void main ( String [] args){

		Scanner scan = new Scanner (System.in);
		System.out.print ("Write to words your want to ");
		String word1 = scan.next ();
		String word2 = scan.next ();
		int word1Length = word1.length();
		int word2Length = word2.length();
		int smaller = Math.min(word1Length, word2Length);
		System.out.println ("The smaller is " + smaller);

	}
}