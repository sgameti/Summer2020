import java.util.Scanner;
import java.util.Random;
		
public class AgeGuessWk2Ex4 {

	public static void main(String[] args) {

					Scanner scan = new Scanner(System.in);
					Random generator = new Random();
					String name;
					int ageGuess;
					int age;
					 
					System.out.println("Lets guess my age!");
					System.out.println("Firstly, what is your name? ");
					 
					age = generator.nextInt(100);
					
					name = scan.nextLine();
					do {
					System.out.println("Thank you, what is your guess? Pick between 10 -100. ");
					
					ageGuess = scan.nextInt();
					
					if (age == ageGuess)
						System.out.println ("your guess was correct. Good Job!");
					else if (age < ageGuess)
						System.out.println( "guess younger");
					else if (age > ageGuess)
						System.out.println ("guess older");
					}
					 while (age != ageGuess);
				}

			}
