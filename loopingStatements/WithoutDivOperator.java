package loopingStatements;

import java.util.Scanner;

public class WithoutDivOperator {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the dividend");
		int divd = scan.nextInt();
		System.out.println("enter the divisor");
		int divs = scan.nextInt();
		
		while(divd>=divs) {
			divd-=divs;
			
		}
		System.out.println("remainder is : "+divd);
	}
}
