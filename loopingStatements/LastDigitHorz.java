package loopingStatements;

import java.util.Scanner;

public class LastDigitHorz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		
		while(num>0)
		{
			int d = num%10;
			System.out.print(d+",");
			num = num/10;
		}
	}

}
