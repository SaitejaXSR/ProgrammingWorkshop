package arrayPrograms;

import java.util.Scanner;

public class SmallestOfArray {
	public static int small(int a[]) {
		int smallest = a[0];
		for (int i = 0; i<a.length; i++)
		if(smallest > a[i])
			smallest = a[i];
		return smallest;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = scan.nextInt();
		
		int [] arr = new int[size];
		System.out.println("enter the values to the array");
		for(int i = 0; i<arr.length; i++)
			arr[i]= scan.nextInt();
		int smallest = small(arr);
		System.out.println("the smallest of the array : "+smallest);
		scan.close();
	}

}
