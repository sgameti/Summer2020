import java.util.Scanner;
import java.util.Random;

public class AgeGuessMod {

	public static void main(String[] args)
		{
			Scanner scan = new Scanner(System.in);
			Random generator = new Random();
			String name;
			int ageGuess;
			int age;
			 
			System.out.println("I am going to guess a number, lets see if you can get guess what I'm thinking!");
			System.out.println("Firstly, what is your name? ");
			 
			age = generator.nextInt(100);
			
			name = scan.nextLine();
			System.out.println("Thank you, what is your guess? ");
			
			ageGuess = scan.nextInt();
			System.out.println("Thank You!");
			System.out.println(name + " your guess is " +ageGuess + "!");
			System.out.println("The number was "+ age);
			 
		}

	}

