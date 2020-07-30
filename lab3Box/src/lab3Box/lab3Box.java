package lab3Box;


public class lab3Box

{
	public int size = 0;

	public void printBox()

	{
		for(int i = 0; i < size; i++)

	{
		for(int j = 0; j < size; j++)

	{

		System.out.print("*");

	}

	System.out.println();

	}

	}

	public static void main(String[] args)

	{
		lab3Box myBox = new lab3Box();

	//change the number rows and *

	myBox.size = 10;

	myBox.printBox();

	}

	}
