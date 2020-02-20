import java.util.Random;

public class BookQuestion53{
	public static void main ( String [] args ){

		Random random = new Random ();
		int randomNumber1 = random.nextInt (101);
		int randomNumber2 = random.nextInt (101);

		System.out.println ("\nThe two random number is " + randomNumber1 + "," + randomNumber2);
		System.out.println ("The lowest number is " + Math.min(randomNumber1, randomNumber2));
	}
}