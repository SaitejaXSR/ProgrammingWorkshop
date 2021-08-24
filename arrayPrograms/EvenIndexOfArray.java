package arrayPrograms;

import java.util.Scanner;

public class EvenIndexOfArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("enter the values for even indexes");
		for(int i = 0; i<a.length; i++)
			if(i%2==0)
				a[i] = scan.nextInt();
		
		for(int i = 0; i<a.length; i++)
			System.out.println(a[i]);
	}
}
