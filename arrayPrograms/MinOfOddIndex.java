package arrayPrograms;

import java.util.Scanner;

public class MinOfOddIndex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("enter the values");
		for (int i = 0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		int min = a[1];
		for(int i = 2; i<a.length; i++) {
			if(i%2==1 && min>a[i])
				min = a[i];
		}
		System.out.println("min element in odd indexes : "+min);
		scan.close();
	}
}
