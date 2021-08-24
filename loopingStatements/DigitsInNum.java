package loopingStatements;

import java.util.Scanner;

public class DigitsInNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		int count = 0;
		while(num>0)
		{
			num = num/10;
			count++;
		}
		System.out.println("the digits in the given number: "+count);
	}

}
