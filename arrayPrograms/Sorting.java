package arrayPrograms;

import java.util.Scanner;

public class Sorting {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size");
		int size = scan.nextInt();
		
		int[] arr = new int[size];
		System.out.println("enter the values");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		arr = sort(arr);
		System.out.println("after sorting the array");
		for (int i =0 ; i<arr.length; i++) {
			System.out.println(arr[i]);
			
		}
//		System.out.println("smallest of array "+arr[0]);
//		System.out.println("largest of array "+arr[arr.length-1]);
//		System.out.println("2nd smallest of array "+arr[1]);
//		System.out.println("2nd largest of array "+arr[arr.length-2]);
//		System.out.println("middle number of array "+arr[arr.length/2]);
		scan.close();
	}
	public static int[] sort(int[] a) 
	{
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1;  j< a.length; j++) 
			{
				if(a[i] > a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

}
