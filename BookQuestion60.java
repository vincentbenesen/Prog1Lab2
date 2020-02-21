import java.util.Random;
import java.text.DecimalFormat;

public class BookQuestion60{
	public static void main ( String [] args ){

		Random random = new Random ();
		int randomNumber1 = random.nextInt (51);
		int randomNumber2 = random.nextInt (51);
		int randomNumber3 = random.nextInt (51);
		System.out.println ("\n1st number is " + randomNumber1 + "\n2nd number is " + randomNumber2
							+ "\n3rd number is " + randomNumber3);
		
		double averageNumber = (double) (randomNumber1 + randomNumber2 + randomNumber3) /  3;
		DecimalFormat oneDecimal = new DecimalFormat ("0.0");
		System.out.println ("The average of the three random number is " + oneDecimal.format(averageNumber));



	}
}