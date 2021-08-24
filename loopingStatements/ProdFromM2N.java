package loopingStatements;

import java.util.Scanner;

public class ProdFromM2N {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the m value");
		int m = scan.nextInt();
		System.out.println("enter the n value");
		int n = scan.nextInt();
		int prod = 1;
		for (int i = m ; i<=n ;i++)
		{
			prod *= i;
		}
		System.out.println("product of numbers from m to n: "+prod);
	}

}
