package standardPrograms;

import java.util.Scanner;

public class StrongNumMtoN {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the m value");
		int m = scan.nextInt();
		System.out.println("enter the n value");
		int n = scan.nextInt();
		for( int i = m ; i<=n;i++) {
			if(strongNumber(i)==true) {
				System.out.println(i+" is a strong number");
			}
		}
	}
	public static boolean strongNumber(int num) {
		
		int temp = num;
		int sum = 0;
		while(num>0) {
			int factorial = 1;
			for(int i = 1; i<=num%10; i++) {
				factorial*=i;
			}
			sum+=factorial;
			num/=10;
		}
		if(sum==temp)
			return true;
		else
			return false;
		
	}

}
