package standardPrograms;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the no.of fibonacci series numbers");
		int num = scan.nextInt();
		int n1 = 0;
		int n2 = 1;
		int n3;
		System.out.print(n1+" "+n2);
		for(int i = 2;i<num;i++) {
			n3 = n1+n2;
			n1= n2;
			n2= n3;
			System.out.print(" "+n3);
		}
		
	}
}
