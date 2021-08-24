package stringPrograms;

import java.util.Scanner;

public class CountVowelsInString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String s = scan.nextLine();
		s = s.toLowerCase();
		int count = 0;
		for(int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
			switch(ch) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'o':
			case 'O':
			case 'i':
			case 'I':
			case 'u':
			case 'U': count++; break;
			
			}
		}
		System.out.println("vowel count in the string : "+count);
		scan.close();
			
		
	}

}
