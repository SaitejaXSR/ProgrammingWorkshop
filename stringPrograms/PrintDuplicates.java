package stringPrograms;

import java.util.Scanner;

public class PrintDuplicates {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string value");
		String s = scan.nextLine();
		String s1 = "";
		String s2 = "";
		for(int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(s1.indexOf(ch)==-1)
				s1+=ch;
			else
				s2+=ch+" ";
		}
		System.out.println("before removing duplicates : "+s);
		if(s1.length()!=s.length())
			System.out.println("string without duplicates : "+s1);
		else
			System.out.println("there are no duplicates present");
		if(s2.length()>0)
			System.out.println("duplicates : "+s2);
		
		scan.close();
	}
}
