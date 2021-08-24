package arrayPrograms;

import java.util.Scanner;

public class CountOccurence {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("enter the values");
		for(int i = 0; i<a.length; i++)
			a[i] = scan.nextInt();
		int k = 3;
		while(k>0) {
		System.out.println("enter the element to search");
		int element = scan.nextInt();
		int count = 0;
		for(int i = 0; i<a.length; i++) {
			if(a[i]==element)
				count++;
		}
		System.out.println(element+" is present "+count+" times");			
		k--;
		}
	}

}
