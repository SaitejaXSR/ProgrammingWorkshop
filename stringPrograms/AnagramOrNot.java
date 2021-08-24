package stringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramOrNot {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the 1st string");
		String s1 = scan.next();
		System.out.println("enter the 2nd string");
		String s2 = scan.next();
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		if(s1.length()==s2.length()) {
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
//			for(int i = 0; i<c1.length;i++)
//				if(c1[i]==c2[i])
//					isAnagram = true;
			boolean isAnagram = Arrays.equals(c1, c2);
			if(isAnagram ==true)
				System.out.println(s1+" and "+s2+" are anagram");
			else
				System.out.println("the given strings are not an anagram");
		}
		else
			System.out.println("the given strings are not an anagram");
		scan.close();
	}

}
