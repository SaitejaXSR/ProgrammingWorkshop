package arrayPrograms;

import java.util.Scanner;

public class SumOfEvenIndex {
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
			if(i%2==0)
				sum+=a[i];
		}
//		Printing the summation of even index numbers in the array.
		System.out.println("sum of numbers in even index your array : "+sum);
	}
	
}
