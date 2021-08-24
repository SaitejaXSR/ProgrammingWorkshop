package standardPrograms;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		int sum = 0;
		for(int i = 1; i<num; i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(sum==num) {
			System.out.println(num+" is a perfect number");
		}else {
			System.out.println(num+" is not a perfect number");
		}
	}
}
