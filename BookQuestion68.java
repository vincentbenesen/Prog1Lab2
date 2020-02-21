import java.util.Scanner;

public class BookQuestion68{
	public static void main ( String [] args ){

		Scanner scan = new Scanner (System.in);
		System.out.print ("Write an URL > ");
		String url = scan.next();
		int dot = url.indexOf('.');
		String siteName = url.substring (dot + 1 );
		int dot2 = siteName.indexOf('.');
		String siteName2 = siteName.substring (0, dot2 + 1);

		System.out.println ("The sitename is " + siteName2);
	}
}
