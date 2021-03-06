import java.lang.Math;
import java.util.Scanner;
import java.text.DecimalFormat;


public class DistCal {

	public static void main(String[] args) {
		int x1, y1, x2,y2;
		double dist;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the X1 coordinate ");
		x1=scan.nextInt();
		
		System.out.println("Enter the Y1 coordinate");
		y1= scan.nextInt();
		
		System.out.println("Enter the X2 coordinate ");
		x2=scan.nextInt();
		
		System.out.println("Enter the Y2 coordinate");
		y2= scan.nextInt();
		
		//making it show ### decimals places
		DecimalFormat fmt= new DecimalFormat("0.###");   
		
		//Math.sqrt, sqroots it
		//Math.pow, takes it the the power after the comma. 
		dist = (float)Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		System.out.println("The distance is "+ fmt.format(dist));
		
	}

}
