import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = in.nextLine();
		String rev_string = reverseString(s);
		System.out.println("Reversed string is: " + rev_string);

	}

	public static String reverseString(String s) {
		if (s.isEmpty())
			return s;
		return reverseString(s.substring(1)) + s.charAt(0);
	}

}
