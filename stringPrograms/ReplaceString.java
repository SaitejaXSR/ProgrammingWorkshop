package stringPrograms;

import java.util.Scanner;

public class ReplaceString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string value");
		String s = scan.next();
		System.out.println("enter the oldstring to replace");
		String a = scan.next();
		System.out.println("enter the newstring to replace");
		String b = scan.next();
		String s1 = s.replace(a, b);
		System.out.println("before replacing string: "+s);
		System.out.println("++++++++++===============++++++++++");
		System.out.println("after replacing string: "+s1);
		scan.close();
		
	}

}
