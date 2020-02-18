import java.util.*;

public class BodyMassIndex{
	public static void main ( String [] args ){

		Scanner scan = new Scanner (System.in);
		System.out.print ("What is your weight in pounds >");
		float weight = scan.nextFloat();
		System.out.println ("Your weight is " + weight + " " + "pounds");
		float kiloGram = weight * (0.454f);
		System.out.println ("Your weight when converted to kilogram is equal to " + kiloGram + " Kilogram");

		System.out.print("\nWhat is your height in feet >");
		float height = scan.nextFloat ();
		System.out.println ("Your height is " + height + "ft");
		float meters = height * (0.3048f);
		System.out.println ("Your Height when converted to meters is equal to " + meters + " meters");

	 	float bmi = kiloGram/ (meters * meters);
	 	System.out.println ("\nTherefore your BMI is equal to" + bmi);



	}
}