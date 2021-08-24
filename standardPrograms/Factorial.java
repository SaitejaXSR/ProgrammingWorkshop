package standardPrograms;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number to find factorial");
		int num = scan.nextInt();
		int prod = 1;
		for(int i = num; i>0; i--) {
			prod*=i;
		}
		System.out.println("factorial of given number "+num+"! : "+prod);
	}

}
