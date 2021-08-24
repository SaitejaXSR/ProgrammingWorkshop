package arrayPrograms;

import java.util.Scanner;

public class OddIndexInString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = scan.nextInt();
		
		String[] a = new String[size];
		System.out.println("enter the string values");
		for(int i = 0; i<a.length; i++)
			a[i] = scan.next();
		
		for(int i = 0; i<a.length; i++)
			if(i%2==1)
				System.out.println(a[i]);
	}

}
