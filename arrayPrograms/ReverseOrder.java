package arrayPrograms;

import java.util.Scanner;

public class ReverseOrder {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		Reading the array size
		System.out.println("enter the size of the array");
		int size = scan.nextInt();
//		Creation of Array
		int[] a = new int[size];
//		Read the values
		System.out.println("enter the values");
		for(int i = 0; i<a.length;i++)
		{
			a[i] = scan.nextInt();
		}
		System.out.println("---------------------------");
		System.out.println("the values in reverse order");
		for (int i = a.length-1; i>=0; i--)
		{
			System.out.println(a[i]);
		}
		
	}
}
