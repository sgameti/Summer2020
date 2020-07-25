package lab3VowelCounter;

import java.util.Scanner;

public class lab3VowelCounter
{

public static boolean isVow(char c)
{
return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u'); 
}

public static boolean isCons(char c)
{
if((c>='a' && c<='z') 
|| (c<='Z' && c>='A'))
{
return !isVow(c);
}
return false;
}

public static void main(String[] args)
{
int num_a=0, num_e = 0, num_i = 0, num_o = 0, num_u = 0;
int nCons = 0;
String str;
Scanner scan = new Scanner(System.in);
System.out.print("Enter a string: ");
str = scan.nextLine();
char c;
for(int i=0; i<str.length(); i++) 
{

if(isVow(str.charAt(i)))
{
	c = str.charAt(i);
	if(c=='a') 
	 num_a++;
	else if(c=='e')
	 num_e++;
	else if(c=='i')
	 num_i++;
	else if(c=='o')
	 num_o++;
	else if(c=='u')
	 num_u++;
}
else if(isCons(str.charAt(i)))
	nCons++;

}

System.out.println("         Result         ");
System.out.println("a: \t\t" + num_a);
System.out.println("e: \t\t" + num_e);
System.out.println("i: \t\t" + num_i);
System.out.println("o: \t\t" + num_o);
System.out.println("u: \t\t" + num_u);
System.out.println("Consonants: \t" + nCons);

}
}
