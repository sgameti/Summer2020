import java.util.Scanner;

public class Figures {

	public static void main(String[] args) {
		// Variable Declaration
		int size, choice;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of hte figure (odd number): ");
		size = s.nextInt();
		while (size % 2 == 0) {
			System.out.println("Invlaid figure size \nIt must be an odd number ");
			System.out.println("Re-Enter the size you would like the figure to be: \n Odd number ONLY! ");
			size = s.nextInt();
		}
		do {
			System.out.println("Menu: \n1. Print Box \n2. Print Diamond \n3. Print X \n4. Quit Program ");
			System.out.println("\n Please select an option: ");
			choice = s.nextInt();
			switch (choice) {
			case 1:
				printBox(size);
				break;
			case 2:
				printDiamond(size);
				break;
			case 3:
				printX(size);
				break;
			case 4:
				quit();
				break;
			default:
				System.out.println("Invlaid option");
			}
		} while (choice != 4);
	}

//Box
	static void printBox(int size) {
		int i, j;
		for (i = 1; i <= size; i++) {
			for (j = 1; j <= size; j++) {
				System.out.print("X");
			}
			System.out.print("\n");
		}
	}

	// Diamond
	static void printDiamond (int size)
	{
		int i, j, mid;
		size = size +1;
		mid = (size /2);
		for (i= 1; i <= mid; i++) 
		{
			for (j = 1; j<= (mid - i); j++) 
			{
				System.out.print(" ");
			}
			if ( i == 1 )
			{
				System.out.print("XX");
			} else 
			{ 
				System.out.print("X");
			for (j = 1; j<=2 * i - 3; j++) 
			{
				System.out.print("X");
			}
			System.out.print("\n");
			}
			for (i= mid + 1; i < size; i++) 
			{
				for (j =1; j<=i - mid; j++) 
				{
					System.out.print (" ");
				}
				if (i == size -1 ) 
				{
					System.out.print("XX");
				}else 
				{ 
					System.out.print("X");
					for (j =1; j <=2 *(size - i) - 3; j++)
					{
						System.out.print(" ");
					}
					System.out.print("X");
				}
				System.out.print("\n");
			}
		}
	}
		// X
		static void printX (int size) {
			int i, j;
			for (i = 1; i <= size; i++) {
				for ( j=1; j<= size; j++) {
					if (j == i) {
						System.out.print("X");
					} else if (j == size - (i -1)) {
						System.out.print("X");
					} else {
						System.out.print(" ");
					}
				}
			System.out.println(" ");
		}
		}		

	// Method to quit
	static void quit() {
		System.out.println(" \nGood Bye!");
		System.exit(0);
	}
}
