package arrayPrograms;

import java.util.Scanner;

public class SumOfIntArr {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		Reading the size of the array from user
		System.out.println("enter the size of the array");
		int size = scan.nextInt();
//		Creating the array of size given above
		int[] a = new int[size];
//		to store the sum of numbers in array;
		int sum = 0;
//		reading the elements for the array from user
		System.out.println("enter the values");
		for(int i = 0 ; i<a.length;i++) {
			a[i]= scan.nextInt();
			sum+=a[i];
		}
//		Printing the summation of numbers in the array.
		System.out.println("sum of numbers in your array : "+sum);
			
		
		
		
	}
}
