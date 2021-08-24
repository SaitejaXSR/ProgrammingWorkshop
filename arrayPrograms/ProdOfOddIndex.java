package arrayPrograms;

import java.util.Scanner;

public class ProdOfOddIndex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = scan.nextInt();
		int[] a = new int[size];
		int prod = 1;
		System.out.println("enter the numbers to array");
		for(int i = 0; i<a.length; i++) {
			a[i]= scan.nextInt();
			if(i%2==1)
				prod*=a[i];
		}
		System.out.println("product of odd index elements : "+prod);
		scan.close();
	}

}
