package standardPrograms;

import java.util.Scanner;

public class PerfectNumMtoN {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter m value");
		int m = scan.nextInt();
		System.out.println("enter n value");
		int n = scan.nextInt();
		for(int i = m; i<=n;i++) {
			if(perfectNumber(i)==true) {
				System.out.println(i+"is a perfect number");
			}
		}
	}
	public static boolean perfectNumber(int num) {
		int sum = 0;
		for(int i = 1; i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(sum == num) {
			return true;
		}else {
			return false;
		}
	}

}
