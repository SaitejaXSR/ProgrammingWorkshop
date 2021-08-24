package standardPrograms;

import java.util.Scanner;

public class SpyNumberBwMandN {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the m value");
		int m = scan.nextInt();
		System.out.println("enter the n value");
		int n = scan.nextInt();
		int sum = 0;
		int prod =1;
		for(int i = m; i<=n; i++) {
			if(spy(i)==true) {
				System.out.println(i+" is a spy number");
			}
		}
	}
	public static boolean spy(int num) {
		int sum = 0;
		int prod = 1;
		while(num>0) {
			int temp = num%10;
			sum+=temp;
			prod*=temp;
			num/=10;
		}
		if(sum==prod) {
			return true;
		}else {
			return false;
		}
	}

}
