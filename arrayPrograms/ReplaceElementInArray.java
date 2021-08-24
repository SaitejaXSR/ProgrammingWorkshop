package arrayPrograms;

import java.util.Scanner;

public class ReplaceElementInArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of tha array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("enter the values");
		for(int i = 0 ; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		int k = 2;
		while(k>0) {
		System.out.println("enter the index number to replace value");
		int index = scan.nextInt();
		System.out.println("enter the new value");
		a[index] = scan.nextInt();
		k--;
		System.out.println("you have "+k+" chances to change another value");
		}
		System.out.println("after replacing values : ");
		for(int i = 0 ; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
