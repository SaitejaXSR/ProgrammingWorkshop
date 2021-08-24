package stringPrograms;

import java.util.Scanner;

public class RemoveVowels {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string value");
		String s = scan.nextLine();
		String s2= s.toLowerCase();
		String s1 = "";
		for(int i= 0 ; i<s.length();i++) {
			char ch = s2.charAt(i);
			if(ch !='a'&& ch!='e'&& ch!='i'&& ch!='o'&&ch!='u')
				s1+=ch;
		}
		System.out.println("before removing vowels : "+s);
		System.out.println("================================");
		System.out.println("after removing vowels : "+s1);
		scan.close();
	}

}
