package stringPrograms;

import java.util.Scanner;

public class ReplceChar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string value");
		String s = scan.next();
		System.out.println("enter the oldchar to replace");
		char ch1 = scan.next().charAt(0);
		System.out.println("enter the newchar to replace ");
		char ch2 = scan.next().charAt(0);
		String s1 = s.replace(ch1, ch2);
		System.out.println("before replacement : "+s);
		System.out.println("==========================");
		System.out.println("after replacement : "+s1);
		scan.close();
	}

}
