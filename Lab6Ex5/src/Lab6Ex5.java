import java.util.*;

public class Lab6Ex5 {

	public static void main(String[] args) {
		int [] l1 = {1, 29, 14, 15, 94};
		int [] l2 = {1, 29, 14, 15, 94};
		
		System.out.println("seletion sort for array: ");
		selectionSort(l1);
		System.out.println("Insertion sort: ");
		insertionSort(l2);
	}

	private static void insertionSort(int[] l2) {
		for (int i =1; i < 5; i++)
		{
			int temp;
			for (int j = i; j > 0; j--)
			{
				if (l2[j-1] > l2[j])
				{
					temp = l2[j];
					l2[i] = l2[j -1];
					l2[j -1] = temp;
				}
			}
			System.out.println(Arrays.toString(l2));
		}
		
	}

	private static void selectionSort(int[] l1) {
		int minNum, minIndex, temp =0;
		for (int i =0; i <5; i++)
		{
			minNum = l1[i];
			minIndex = i;
			for (int j=i; j <5; j++)
			{
				if (l1[j] < minNum)
{ minNum = l1[j];
minIndex = j;
}
}
				if (minNum < l1[i])
				{
					temp = l1[i];
					l1[i] = l1[minIndex];
					l1[minIndex]= temp;
				}
				System.out.println(Arrays.toString(l1));
			}
		}
}