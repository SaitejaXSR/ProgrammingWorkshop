package loopingStatements;

import java.util.Scanner;

public class ProdOf2Num {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value");
		int num = scan.nextInt();
		int product = 1;
		while(num!=0) {
			product*=num%10;
			num/=10;
		}
		System.out.println("the product is : "+product);
		scan.close();
	}

}
