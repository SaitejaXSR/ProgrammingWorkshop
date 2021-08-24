package standardPrograms;

import java.util.Scanner;

public class PerfectSquaresMtoN {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter m value");
		int m = scan.nextInt();
		System.out.println("enter n value");
		int n = scan.nextInt();
		for(int i = 1; i<=n;i++) {
			if(perfectSquare(i)==true) {
				System.out.println(i+" is a perfect square");
				
			}
		}
	}
	public static boolean perfectSquare(int num) {
		boolean isPerfectSquare = false;
		for(int i = 1; i<num;i++) {
			if(i*i==num) {
				isPerfectSquare = true;
			}
		}
		if(isPerfectSquare==true)
			return true;
		else
			return false;
	}

}
