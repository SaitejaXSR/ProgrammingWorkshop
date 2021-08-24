package stringPrograms;

import java.util.Scanner;

public class SummationOfDigitsInStr {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string value");
		String s = scan.next();
		int sum = 0;
		for(int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isDigit(s.charAt(i)))
			{
				String s1 = ""+ch;
				int a = Integer.valueOf(s1);
				sum+=a;
				System.out.print(s.charAt(i)+" ");
			}
		}
		System.out.println("\nsum of digits in the string : "+sum);
		scan.close();
	}

}
