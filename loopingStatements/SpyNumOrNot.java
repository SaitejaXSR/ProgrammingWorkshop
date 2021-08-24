package loopingStatements;

import java.util.Scanner;

public class SpyNumOrNot {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		int n = num;
		int sum = 0;
		int prod = 1;
		while(num>0) {
			int temp = num%10;
			sum +=temp;
			prod *= temp;
			num/=10;
			
		}
		System.out.println(sum);
		System.out.println(prod);
		if (sum==prod) {
			System.out.println(n+ "is a spy number");
		}
		else
			System.out.println(n+ " is not a spy nymber");
		
	}

}
