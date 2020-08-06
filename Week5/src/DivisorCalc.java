import java.util.Scanner;

public class DivisorCalc {

	public static void main(String[] args) {
		int num1, num2;
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the first number: ");
		num1=sc.nextInt();
		
		System.out.print("Enter the second number: ");
		num2=sc.nextInt();
		
		int greatestComDiv = gcd(num1, num2);
		
		System.out.println("The GCD of " +num1+ " and " +num2+ " is " + greatestComDiv);

	}
	private static int gcd( int num1, int num2) {
		if (num2 == 0) {
			return num1;
		}
		return gcd(num2, num1 % num2);
	}

}
