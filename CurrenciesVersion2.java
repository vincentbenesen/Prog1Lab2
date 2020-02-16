import java.util.Scanner;

public class CurrenciesVersion2{

	public static void main( String [] args){

 	Scanner scan = new Scanner (System.in);
 	System.out.println ("Write the amount of Canadian dollars you want to convert >");
 	 double canadianDollars = scan.nextDouble();


	double  cadToUsd, cadToEur;
	 cadToUsd =  canadianDollars* 0.75;
	 cadToEur = canadianDollars * 0.68;

	System.out.println (canadianDollars + " " + "canadian is equal to" + " "+ cadToUsd + " " +"Usd" +
			"\nWhile" + " " + canadianDollars + " " + "canadian is equal to " + " " + cadToEur + " " + "Eur");

	System.exit(0);


	}

	 
}	