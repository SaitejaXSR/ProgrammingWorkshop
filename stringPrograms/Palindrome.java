package stringPrograms;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String s1 = scan.next();
		
		String s2 = "";
		for(int i = 0 ; i<s1.length(); i++)
		{
			s2 = s1.charAt(i) + s2;
			
		}
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println(s1+" is a palindrome.");
		}
		else
		{
			System.out.println(s1+" is not a palindrome.");
		}
		scan.close();
	}
}
