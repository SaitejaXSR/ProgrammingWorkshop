package stringPrograms;

import java.util.Scanner;

public class CountEachVowel {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string");
		String s = scan.nextLine();
		s = s.toLowerCase();
		int countA= 0;
		int countE= 0;
		int countI= 0;
		int countO= 0;
		int countU= 0;
		for(int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch=='a')
				countA++;
			if(ch=='e')
				countE++;
			if(ch=='i')
				countI++;
			if(ch=='o')
				countO++;
			if(ch=='u')
				countU++;
		}
		System.out.println("a : "+countA);
		System.out.println("e : "+countE);
		System.out.println("i : "+countI);
		System.out.println("o : "+countO);
		System.out.println("u : "+countU);
		scan.close();
	}

}
