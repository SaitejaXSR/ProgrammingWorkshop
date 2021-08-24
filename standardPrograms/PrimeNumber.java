package standardPrograms;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		boolean isPrime = true;
		for(int i = 2; i<num ; i++) {
			if(num%i==0) {
				isPrime = false;
			}
		}
		if(isPrime==true) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is not a prime number");
		}
	}

}
