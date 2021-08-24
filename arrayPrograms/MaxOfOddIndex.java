package arrayPrograms;

import java.util.Scanner;

public class MaxOfOddIndex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("enter the values");
		for (int i = 0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		int max = a[1];
		for(int i = 2; i<a.length; i++) {
			if(i%2==1 && max<a[i])
				max = a[i];
		}
		System.out.println("max element in odd indexes : "+max);
		scan.close();
	}

}
