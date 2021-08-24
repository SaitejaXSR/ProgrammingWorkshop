package stringPrograms;

import java.util.Scanner;

public class IndexOfChar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		char ch = scan.next().charAt(0);
		int index = s.indexOf(ch);
		System.out.println(index);
		scan.close();
	}

}
