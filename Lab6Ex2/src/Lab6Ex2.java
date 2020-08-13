
public class Lab6Ex2 {

	public static void main(String[] args) {
		int N = 3; 
		System.out.println(foo(N));
	}
	static int foo (int N)
	{
		int result = 0; 
		for (int i =0; i<N; i++)
		result++;
		for (int j=0; j<100000; j++)
			result+=j; 
		return result;
		
	}

}
