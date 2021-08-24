package arrayPrograms;

import java.util.Scanner;

public class MaxOf2ndHalf {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("enter the values");
		for (int i = 0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		int max= a[a.length/2];
		for(int i = a.length/2+1; i<a.length; i++) {
			if(max<a[i])
				max = a[i];
		}
		System.out.println("max element of 2nd half: "+max);
		scan.close();
	}

}
