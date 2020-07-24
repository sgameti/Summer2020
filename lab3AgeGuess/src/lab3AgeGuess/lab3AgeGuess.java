package lab3AgeGuess;

import java.util.Scanner;
import java.util.Random;

public class lab3AgeGuess {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		String name;
		int ageGuess;
		int age;
		 
		System.out.println("Guess my age!");
		System.out.println("Firstly, what is your name? ");
		 
		age = generator.nextInt(100);
		name = scan.nextLine();
		
		System.out.println("Thank you, " +name+ " what is your guess? ");
		
		ageGuess = scan.nextInt();
		
		while (ageGuess != age)
		{
			System.out.println ("Thanks, but your are wrong!\ntry again");
			ageGuess = scan.nextInt();
		}
		System.out.println("Well Done!");
		System.out.println(name + " you guessed " +ageGuess + " years old!");
		System.out.println("I am "+age+" years old");
	}

}
