
public class Lab6Ex3 {

	public static void main(String[] args) {
		int N = 6; 
		System.out.println(bar(N));
	}
	static int bar (int N)
	{
		int result= 1;
		for (int i=1; i <N; i*=2)
			result+=2;
		return result;
	}
}
