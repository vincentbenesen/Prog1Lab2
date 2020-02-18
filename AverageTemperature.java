import java.util.Scanner;

public class AverageTemperature{
	public static void main (String  [] args){

		Scanner scan = new Scanner (System.in);
		System.out.print ("What are the Temperature for the last 3 days>");
		int temperature1 = scan.nextInt ();
		int temperature2 = scan.nextInt ();
		int temperature3 = scan.nextInt ();

		System.out.println ("\nThe temperature on the 1st Day is " + temperature1 + " Celcius" +
							"\nWhile the temperature on the 2nd Day is " + temperature2 + " Celcius" +
							"\nAnd lastly the temperature on the 3rd Day is " + temperature3 + " Celcius");

	 	int averageTemperature = (temperature1 + temperature2 +temperature3)/3;
	 	System.out.println ("\nThe Average Temperature from the past 3 days is " + averageTemperature + " Celcius");


	}
}