package stringPrograms;

import java.util.Scanner;

public class LengthOfString1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string value");
		String s = scan.nextLine();
		String s1= "";
		for(int i = 0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(ch!=' ')
				s1+=ch;
		}
		System.out.println("length of the string : "+s1.length());
		scan.close();
		
	}

}
