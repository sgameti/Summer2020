import java.util.Scanner;
import java.util.Random;

public class UserName {

	public static void main(String[] args) 
	{
		String FirstName, LastName;
		Random generator = new Random();
		int random;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("What is your First Name?");
		
		FirstName = scan.nextLine();
		
		System.out.println("Thank you, what is your Last Name? ");
		LastName = scan.nextLine();
		
		random = generator.nextInt(100)+10;

		System.out.println("Your new code is "+FirstName.substring(0,1) + LastName.substring(0,4) + random);

	}

}
