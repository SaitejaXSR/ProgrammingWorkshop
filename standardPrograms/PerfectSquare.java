package standardPrograms;

import java.util.Scanner;

public class PerfectSquare {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		boolean check = false;
		for(int i = 0; i<num; i++) {
			if (i*i==num) {
				check = true;
				break;
			}
		}
		if(check == true) {
			System.out.println(num+" is a perfect square");
		}else {
			System.out.println(num+" is not a perfect sqaure");
		}
	}

}
