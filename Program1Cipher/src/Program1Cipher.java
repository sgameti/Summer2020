import java.util.Random;

import java.util.Scanner;

public class Program1Cipher 
{

	public static void main(String[] args) 
	{
		int[]number=new int[5];
		int plainText=0,key,digit,encode=0,multiplie=0;
		
		Random rand = new Random();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 5 numbers between 0 and 19: ");
		
		for (int i=0; i<5; i++)
		{
			number[i]=input.nextInt();
			
			if(number[i]<0|| number[i]>19)
			{
				System.out.println("Please read directions and try again! ");
				System.exit(0);
			}
			
			plainText=plainText+number[i];
		}
		key = 0 + rand.nextInt((9-0)+1);
		
		System.out.println("Plain text is: "+ plainText);
		
		System.out.println("Key is: "+ key);
		
		while (plainText!=0)
		{
			digit=(plainText%10);
			
			multiplie = 10*multiplie+(digit+key);
			
			plainText=plainText/10;
		}
		while(multiplie!=0)
		{
			digit=(multiplie%10);
			
			encode=10*encode+(digit);
			
			multiplie=multiplie/10;
		}
		System.out.println("Encoded Message: "+encode);

	}
}