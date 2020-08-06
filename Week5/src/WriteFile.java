import java.io.*;
import java.util.Scanner;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		String userInput = "";

		String file = "userString.txt";

		Scanner scan = new Scanner(System.in);

		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter outFile = new PrintWriter(bw);

		while (!userInput.equalsIgnoreCase("done")) {
			try {
				System.out.println("Please enter your string: ");
				userInput = scan.nextLine();

				if (userInput.equalsIgnoreCase("done")) {
					outFile.close();
				}
				outFile.print(userInput);
			} catch (NumberFormatException exception) {
				System.out.print("Please provide correct input. ");
			}
		}
		System.out.println("Program terminated by user");
		System.out.println("Output file has been created: " + file);
		System.out.println("user input: " + userInput);
		scan.close();

	}

}
