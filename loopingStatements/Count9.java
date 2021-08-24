package loopingStatements;

import java.util.Scanner;

public class Count9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the m value");
		int m = scan.nextInt();
		System.out.println("enter the n value");
		int n = scan.nextInt();
		
		int count = 0 ;
		int count9 = 0;
		for(int i = m; i<=n; i++)
		{
			int temp = i;
			boolean isPresent = false;
			while(temp>0) 
			{
				if (temp%10==9) 
				{
					count9++;
					isPresent = true;
					
				}
				temp/=10;
			}
			if (isPresent == true) {
				count++;
			}
		}
		System.out.println(count+" numbers have 9 in it");
		System.out.println("total "+count9+" 9's are present in the range");

	}

}
