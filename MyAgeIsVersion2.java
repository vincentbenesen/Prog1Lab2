import java.util.Scanner;

public class MyAgeIsVersion2{
	public static void main (String [] args){

		Scanner scan = new Scanner (System.in);
		System.out.print ("State the year that you were born >");
		int yearOfBirth = scan.nextInt();
		int currentYear = 2020;
		int yourAge = currentYear - yearOfBirth;
		System.out.println ("Your age is " + yourAge);



		
	} 
}