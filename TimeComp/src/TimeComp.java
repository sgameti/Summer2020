import java.util.Scanner;

public class TimeComp {

	public static void main(String[] args) {
		int Sec = 0;
		int Hr= 0;
		int Min =0 ;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println(" Enter the time in Seconds: ");
		Sec =in.nextInt();
		
		Hr = Sec /3600;
		Min = (Sec%3600) / 60;
		Sec = Sec%60;
		
		System.out.println(" That is "+ Hr +" Hours "+ Min + " minutes and " + Sec + " seconds.");
		
	}

}
