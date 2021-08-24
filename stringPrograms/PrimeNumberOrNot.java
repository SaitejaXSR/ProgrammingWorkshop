package stringPrograms;

import java.util.Scanner;

public class PrimeNumberOrNot {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int n = scan.nextInt();
		
		boolean isPrime = true;
		for(int i = 2; i<n; i++) {
			if(n%i==0) {
				isPrime=false;
				break;
			}
		}
		if(n>1 && isPrime==true)
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+" is not a prime number");
		scan.close();
	}

}
