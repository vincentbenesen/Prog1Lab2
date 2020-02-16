import java.util.Scanner;

public class AverageIntegersVersion2{
	public static void main ( String [] args){

	Scanner scan = new Scanner (System.in);
	System.out.print ("Write 4 integer numbers >");
	 int number1 = scan.nextInt();
	 int number2 = scan.nextInt();
	 int number3 = scan.nextInt();
	 int number4 = scan.nextInt();

	double averageOfAllNumbers = (double)(number1 + number2 +number3 + number4) / 4;
	System.out.println ("The average of all 4 numbers is " + averageOfAllNumbers);


	}
}