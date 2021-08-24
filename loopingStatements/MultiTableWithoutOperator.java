package loopingStatements;

import java.util.Scanner;

public class MultiTableWithoutOperator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number for mult table");
		int n = scan.nextInt();
		int num = 0;
		
		for(int i = 1; i<=10; i++) {
			num+=n;
			System.out.println(n+" x "+i+" = "+num);
		}
	}

}
