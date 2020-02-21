import java.util.Scanner;
import java.text.DecimalFormat;

public class BookQuestion58{
	public static void main ( String [] args ){

		Scanner scan = new Scanner (System.in);
		System.out.print ("Write the radius of the circle > ");
		double radius = scan.nextDouble ();
		double PI = Math.PI;
		double area = PI * (Math.pow(radius, 2));

		DecimalFormat twoDecimals = new DecimalFormat ("0.00");
		System.out.println ("The Area of the circle is " + twoDecimals.format(area));





	}
}