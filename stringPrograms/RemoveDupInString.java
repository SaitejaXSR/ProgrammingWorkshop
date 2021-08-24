package stringPrograms;

import java.util.Scanner;

public class RemoveDupInString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string value");
		String s = scan.nextLine();
		String s1 = "";
		for(int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(s1.indexOf(ch)==-1)
				s1+=ch;
		}
		System.out.println("before removing duplicates : "+s);
		System.out.println("string without duplicates : "+s1);
		
		scan.close();
	}

}
