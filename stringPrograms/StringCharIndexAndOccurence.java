package stringPrograms;

import java.util.Scanner;

public class StringCharIndexAndOccurence {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string value");
		String s = scan.next();
		System.out.println("enter the character to find the index");
		char ch = scan.next().charAt(0);
		System.out.println("enter the occurence of character");
		int n = scan.nextInt();
		int index = s.indexOf(ch, n);
		System.out.print("The "+n+" occurence of char "+ch+" is: "+index);
		scan.close();
		
	}

}
