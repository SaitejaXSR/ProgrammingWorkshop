package loopingStatements;

import java.util.Scanner;

public class PalindromeNumORNot {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		int a = num;
		int rev = 0;
		while (num>0) {
			rev = rev*10+num%10;
			num/=10;
			
		}
		if (a==rev) {
			System.out.println(a+" is a palidrome number");
		}
		else
			System.out.println(a+" is not a palindrome number");
		scan.close();
	}

}
