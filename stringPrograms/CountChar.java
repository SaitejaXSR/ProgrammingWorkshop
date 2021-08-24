package stringPrograms;

import java.util.Scanner;

public class CountChar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string value");
		String str = scan.next();
		str = str.toLowerCase();
		
		char [] ch = new char[str.length()];
		int count = 0;
		for(int i = 0; i<str.length();i++)
		{
			ch[i] = str.charAt(i);
			count++;
		}
		System.out.println("no of characters in the string : "+count);
		scan.close();
	}

}
