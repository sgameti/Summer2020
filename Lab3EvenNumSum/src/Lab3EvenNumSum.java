import java.util.Scanner;

public class Lab3EvenNumSum {

	public static void main(String[] args) 
	{
		int num, sum;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number greater than 2");
		num = scan.nextInt();
		if(num<2)
		{
			System.out.println(" I said a number greater than 2 \n try agian");
			System.out.println("Enter a number greater than 2");
			num = scan.nextInt();
		}
		int k = num/2;
		sum = k*(k+1);
		System.out.println( "The sum of all the even numbers is\n" +sum);
	}

}
