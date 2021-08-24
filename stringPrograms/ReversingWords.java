package stringPrograms;

import java.util.Scanner;

public class ReversingWords {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String s = scan.nextLine();
		String s1 = "";
		String[] sArr = s.split(" ");
		for (int i = 0; i<sArr.length; i++) {
			String s2 = sArr[i];
			for(int j = s2.length()-1; j>=0; j--) {
				s1+=s2.charAt(j);
			}
			s1+=" ";
		}
		System.out.println("berfore reversing");
		System.out.println(s);
		System.out.println("after reversing");
		System.out.println(s1);
		scan.close();
	}

}
