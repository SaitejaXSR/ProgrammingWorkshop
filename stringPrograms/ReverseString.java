package stringPrograms;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String s1 = scan.nextLine();
		
		String s2 = "";
		for(int i = 0 ; i<s1.length(); i++)
		{
			s2 = s1.charAt(i) + s2;
			
		}
		System.out.println("reverse of the given string : "+s2);
		scan.close();
	}

}
