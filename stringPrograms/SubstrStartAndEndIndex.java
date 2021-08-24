package stringPrograms;

import java.util.Scanner;

public class SubstrStartAndEndIndex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string value");
		String s = scan.next();
		System.out.println("enter the start index of substring");
		int n = scan.nextInt();
		System.out.println("enter the end index of substring");
		int m = scan.nextInt();
		String s1 = s.substring(n,m);
		System.out.println("original string : "+s);
		System.out.println("substring : "+s1);
		scan.close();
	}

}
