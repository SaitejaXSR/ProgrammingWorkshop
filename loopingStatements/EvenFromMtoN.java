package loopingStatements;

import java.util.Scanner;

public class EvenFromMtoN {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter m number");
		int m = scan.nextInt();
		System.out.println("enter n number");
		int n = scan.nextInt();
		for(int i = m;i<=n; i++)
		{
			if (i%2==0)
			System.out.println(i);
		}
	}

}
