package loopingStatements;

import java.util.Scanner;

public class Count3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the m value");
		int m = scan.nextInt();
		System.out.println("enter the n value");
		int n = scan.nextInt();
		
		int count = 0 ;
		for(int i = m; i<=n; i++)
		{
			int temp = i;
			while(temp>0) 
			{
				if (temp%10==3) 
				{
					count++;
					break;
					
				}
				temp/=10;
			}
		}
		System.out.println("count of 3 in the range : "+count);
	}

}
