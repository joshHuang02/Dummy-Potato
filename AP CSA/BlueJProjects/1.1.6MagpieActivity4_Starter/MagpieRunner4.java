import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Josh Huang
 * @version 10/9/2019
 */
public class MagpieRunner4
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main()
	{
		Magpie4 maggie = new Magpie4();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}
