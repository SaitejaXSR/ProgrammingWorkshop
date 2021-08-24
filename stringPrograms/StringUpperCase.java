package stringPrograms;

import java.util.Scanner;

public class StringUpperCase {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String s1 = s.toUpperCase();
		System.out.println("before conversion");
		System.out.println("lower case : "+s);
		System.out.println("===========================");
		System.out.println("after conversion");
		System.out.println("upper case : "+s1);
		scan.close();
	}
}
