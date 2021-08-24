package arrayPrograms;

import java.util.Scanner;

public class ReplaceValueWoIndex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("enter the values : ");
		for(int i= 0; i<a.length; i++) {
			a[i] = scan.nextInt();
		}
		boolean isPresent = false;
		int k = 3;
		while(k>0) {
		System.out.println("enter the present number to replace");
		int num1 = scan.nextInt();
		System.out.println("enter the index number");
		int index = scan.nextInt();
		for(int i = 0; i<a.length; i++) {
			if(a[i]==num1) {
				isPresent = true;
				break;
			}
		}
		if(isPresent == true)
			a[index] = num1;
		else
			System.out.println("the value entered is not present");
		k--;
		System.out.println("you have "+k+" chances left");
		}
		System.out.println("after replacing values : ");
		for(int i = 0;i<a.length; i++) {
			System.out.println(a[i]+" ");
		}
		scan.close();
	}

}
