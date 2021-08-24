package stringPrograms;

import java.util.Scanner;

public class LengthOfString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int l= s.length();
		System.out.println(l);
		scan.close();
	}
	
}
