package arrayPrograms;

import java.util.Scanner;

public class SecondHalfOfArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("enter the values");
		for(int i = 0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		if(size%2==1)
			for(int i = a.length/2; i<a.length; i++) {
				System.out.println(a[i]);
			}
		else
			for(int i = a.length/2; i<a.length; i++) {
				System.out.println(a[i]);
			}
		scan.close();
			
	}

}
