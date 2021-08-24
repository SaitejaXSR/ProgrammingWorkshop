package loopingStatements;

import java.util.Scanner;

public class QuotWithoutDivOperator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the dividend");
		int divd = scan.nextInt();
		System.out.println("enter the divisor");
		int divs = scan.nextInt();
		
		int quo = 0;
		
		while(divd>=divs) {
			divd-=divs;
			quo++;
			
		}
		System.out.println("quotient is : "+quo);
	}

}
