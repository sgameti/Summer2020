import java.util.*;

public class Lab6Ex4 {

	public static void main(String[] args) {
		int[] numList = { 1, 14, 15, 24, 55, 59, 73, 90, 94, 99 };
		int left = 0;
		int right = numList.length - 1;
		int number = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number in the Array: ");
		number = scan.nextInt();
		scan.close();

		do {
			int middle = (left + right) / 2;
			if (numList[middle] < number) {
				System.out.print(" left Bound: " + left);
				System.out.print(" right Bound: " + right);
				left = middle + 1;
				System.out.println(" Middle " + numList[middle]);

			} else if (numList[middle] > number) {
				System.out.print(" left Bound: " + left);
				System.out.print(" right Bound: " + right);
				right = middle - 1;
				System.out.println(" middle " + numList[middle]);
			} else if (numList[middle] == number) {
				System.out.print(" left Bound: " + left);
				System.out.print(" right Bound: " + right);
				System.out.print(" middle " + numList[middle]);
				break;
			}
		} while (left <= right);
	}
}
