package loopingStatements;

import java.util.Scanner;

public class Count8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the m value");
		int m = scan.nextInt();
		System.out.println("enter the n value");
		int n = scan.nextInt();
		
		int count8 = 0 ;
		for(int i = m; i<=n; i++)
		{
			int temp = i;
			while(temp>0) 
			{
				if (temp%10==8) 
				{
					count8++;
					
				}
				temp/=10;
			}
		}
		System.out.println("no of 8's present in the range : "+count8);
	}
}