package loopingStatements;

import java.util.Scanner;

public class SumOfMtoNNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter m number");
		int m = scan.nextInt();
		System.out.println("enter n number");
		int n = scan.nextInt();
		int sum = 0;
		for(int i = m;i<=n; i++)
		{
			sum+=i;
		}
		System.out.println("sum of the numbers : "+sum);
	}

}
