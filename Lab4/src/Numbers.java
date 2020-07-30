import java.lang.reflect.Array;

public class Numbers {

	public static void nextLargest(int array[]) {
		int largestNum;
		
		for (int i=0; i<array.length; i++) {
			largestNum = Integer.MAX_VALUE;
			for (int x = 0; x<array.length; x++) {
				if (array[i]<array[x]&& array[x]<largestNum) {
					largestNum = array[x];
				}
			}
			System.out.println(array[i] + ":" +largestNum+ " ");
		}
	}
	public static void main(String[] args) {
		int array[] = {78, 22, 55, 99, 12,14,17,15, 1, 144,37, 23, 47, 88, 3, 19};
		nextLargest(array);

	}

}
