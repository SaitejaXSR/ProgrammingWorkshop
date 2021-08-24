package arrayPrograms;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("enter the values");
		for(int i = 0; i<a.length;i++) {
			a[i] = scan.nextInt();
		}
		for(int i = 0; i<a.length; i++) {
			int temp = a[i];
			boolean isPrime = true;
			for(int j = 2; j<temp; j++) {
				if(temp%j==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime == true) {
				System.out.println(temp+" is a prime number");
			}
		
		}
	}
}
