import java.util.Scanner;

public class BookQuestion55{
	public static void main ( String [] args){

		Scanner scan = new Scanner (System.in);
		System.out.print ("Write a file name with a format of \"character.filextension\" > ");
		String fileName = scan.next ();
		int dot = fileName.indexOf ('.');
		System.out.println ("\nThe file extension is " + fileName.substring(dot + 1));
	}
}