package loopingStatements;

import java.util.Scanner;

public class SumEvenOrOdd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		
		int sum = 0;
		while(num>0) {
			sum+=num%10;
			num/=10;
			
		}
		System.out.println("sum of digits "+sum);
		if (sum%2==0) {
			System.out.println("the summation of given number is even");
		}
		else
			System.out.println("the summation of given number is odd");
	}
}
