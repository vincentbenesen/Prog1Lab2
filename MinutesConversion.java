import java.util.Scanner;
import java.text.DecimalFormat;

public class MinutesConversion{
	public static void main (String [] args ){


		Scanner scan = new Scanner (System.in);
		System.out.print ("How many seconds do you want to convert in minutes >");
		int timeInSeconds = scan.nextInt ();
		System.out.println ("\nThe amount amount of seconds you want to convert in minutes is " + timeInSeconds + " seconds");

		double minutes = timeInSeconds/60;
		int seconds = timeInSeconds%60;
	
	
		System.out.println ((int) minutes + ":" + seconds);

	}
}