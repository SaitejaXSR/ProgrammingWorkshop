package arrayPrograms;

import java.util.Scanner;

public class MissingElementsInArray {
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
		System.out.println("===AFTER SORTING THE ARRAY===");
		for(int i = 0; i<arr.length; i++)
			System.out.println(arr[i]+" ");
		for(int i = 0 ; i<arr.length-1; i++)
			for(int j = arr[i]+1; j<arr[i+1]; j++)
				System.out.print(j+ " " );
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