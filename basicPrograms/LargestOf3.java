package basicPrograms;

import java.util.Scanner;

public class LargestOf3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 1st number");
		int a = scan.nextInt();
		System.out.println("enter the 2nd number");
		int b = scan.nextInt();
		System.out.println("enter the 3rd number");
		int c = scan.nextInt();
		if (a>b && a>c)
		{
			System.out.println(a+" is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" is greater");
		}
		else
			System.out.println(c+" is greater");
		
		
		
		
	}
}
