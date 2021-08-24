package loopingStatements;

import java.util.Scanner;

public class ReverseOrder {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value");
		int num = scan.nextInt();
		
		int rev = 0 ;
		while(num>0) {
			rev = rev *10 + num%10;
			num/=10;
			
		}
		System.out.println("reverse order of the given number : "+rev);
	}

}
