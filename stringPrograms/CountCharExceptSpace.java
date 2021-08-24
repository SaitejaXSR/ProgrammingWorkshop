package stringPrograms;

import java.util.Scanner;

public class CountCharExceptSpace {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string value");
		String s = scan.nextLine();
		int count = 0;
		for(int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch!=' ')
				count++;
		}
		System.out.println("character present in the string : "+count);
		scan.close();
	}

}
