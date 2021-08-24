package arrayPrograms;

import java.util.Scanner;

public class AddElementArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("enter the values");
		for(int i = 0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		System.out.println("enter the no of elements to add");
		int newSize = scan.nextInt();
		int [] a1 = new int[size+newSize];
		System.out.println("enter the index no to add");
		int index = scan.nextInt();
		int k = 0;
		for(int i = 0 ; i<a.length; i++) {
			if(index==i) {
				for(int j = 0; j<newSize; j++) {
					System.out.println("enter the new values");
					a1[k] = scan.nextInt();
					k++;
				}
			}
			a1[k] = a[i];
			k++;
		}
		System.out.println("======AFTER ADDING NEW VALUES=======");
		for(int i = 0; i<a1.length; i++)
			System.out.print(a1[i]+" ");
		
		
	}

}
