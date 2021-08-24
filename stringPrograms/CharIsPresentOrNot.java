package stringPrograms;

import java.util.Scanner;

public class CharIsPresentOrNot {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string value");;
		String a = scan.next();
		System.out.println("enter the charcter to find in the string");
		char ch = scan.next().charAt(0);
		boolean isPresent = false;
		int index = 0;
		for(int i = 0; i<a.length(); i++)
		{
			if(ch == a.charAt(i))
			{
				isPresent = true;
				index = i;
				break;
			}
			
		}
		if(isPresent == true)
		{
			System.out.println(ch+" is present at index "+index+" in the String");
		}
		else
			System.out.println(ch+ " is not present in the String");
		scan.close();
	}

}
