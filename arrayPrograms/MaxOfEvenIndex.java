package arrayPrograms;

import java.util.Scanner;

public class MaxOfEvenIndex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("enter the values");
		for (int i = 0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		int max = a[0];
		for(int i = 1; i<a.length; i++) {
			if(i%2==0 && max<a[i])
				max = a[i];
		}
		System.out.println("max element in even indexes : "+max);
		scan.close();
	}

}
