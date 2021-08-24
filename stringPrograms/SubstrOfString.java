package stringPrograms;

import java.util.Scanner;

public class SubstrOfString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string value");
		String s = scan.next();
		System.out.println("enter the start index of substring");
		int n = scan.nextInt();
		String s1 = s.substring(n);
		System.out.println("original string : "+s);
		System.out.println("substring : "+s1);
		scan.close();
	}

}
