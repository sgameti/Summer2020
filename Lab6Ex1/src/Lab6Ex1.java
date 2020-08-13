import java.util.*;

public class Lab6Ex1 {
	public static int simpleTime(int n) 
	{
		int simpleTime = 0;
		for (int j = 0; j < n; j++)
			for (int k = 0; k < n; k++)
				for (int l = 0; l < n; l++)
					simpleTime++;
		return simpleTime;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		int n = sc.nextInt();
		System.out.println("Sum is: " + simpleTime(n));
	}
}
// TODO Auto-generated method stub
