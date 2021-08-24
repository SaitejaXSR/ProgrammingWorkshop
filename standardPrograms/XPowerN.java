package standardPrograms;

import java.util.Scanner;

public class XPowerN {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter x");
		int x = scan.nextInt();
		System.out.println("enter n");
		int n = scan.nextInt();
		int num = 1;
		for(int i = 1; i<=n; i++) {
			num*=x;
		}
		System.out.println(x+" power "+n+" is :"+num);
	}

}
