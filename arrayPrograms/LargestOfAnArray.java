package arrayPrograms;

import java.util.Scanner;

public class LargestOfAnArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		Reading the size of the array from user
		System.out.println("enter the size of the array");
		int size = scan.nextInt();
//		Creating the array of size given above
		int[] a = new int[size];
		System.out.println("enter the values for the array");
		for(int i = 0; i<a.length; i++)
			a[i] = scan.nextInt();
		
		int largest = a[0];
		
		for (int i = 1; i < a.length; i++)
			if (largest < a[i])
				largest = a[i];
		
		System.out.println("largest element in the array : "+largest);
	}
}
