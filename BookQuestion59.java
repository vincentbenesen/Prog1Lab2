import java.util.Random;

public class BookQuestion59{
	public static void main ( String [] args ){

		Random random = new Random ();
		int randomNumber1 = random.nextInt (100 - 60 + 1) + 60;
		int randomNumber2 = random.nextInt (100 - 60 + 1) + 60;
		int randomNumber3 = random.nextInt (100 - 60 + 1) + 60;
		int randomNumber4 = random.nextInt (100 - 60 + 1) + 60;
		int randomNumber5 = random.nextInt (100 - 60 + 1) + 60;
		System.out.println ("\nNumber 1 is " + randomNumber1 + "\nNumber 2 is " + randomNumber2 + 
							"\nNumber 3 is " + randomNumber3 + "\nNumber 4 is " + randomNumber4 +
							"\nNumber 5 is " + randomNumber5);

		int smaller1 = Math.min (randomNumber1,randomNumber2);
		int smaller2 = Math.min (smaller1 , randomNumber3);
		int smaller3 = Math.min (smaller2, randomNumber4);
		int smaller4 = Math.min (smaller3, randomNumber5);
		System.out.println("The smallest number among all five number is " + smaller4);
	}
}