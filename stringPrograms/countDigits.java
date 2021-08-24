package stringPrograms;

import java.util.Scanner;

public class countDigits {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string value");
		String s = scan.next();
		
		int count = 0;
		for(int i = 0 ; i<s.length();i++)
		{
			if(Character.isDigit(s.charAt(i))) {
				count++;
				System.out.print(s.charAt(i)+" ");
			}
				
		}
		System.out.print("\nno of digits in the string : "+count);
		scan.close();
	}

}
