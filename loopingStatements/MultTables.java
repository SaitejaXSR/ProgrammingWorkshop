package loopingStatements;

import java.util.Scanner;

public class MultTables {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number for multiplication table");
		int num = scan.nextInt();
		
		for(int i = 1; i<=10; i++) {
			int prod = num*i;
			System.out.println(num+" * "+i+" : "+prod );
		}
	}

}
