package practisePrograms;

import java.util.Scanner;

public class RepeatedString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int n = scan.nextInt();
		int aCount = repeatedString(s,n);
		System.out.println(aCount);
		scan.close();
	}
	public static int repeatedString(String s, int n) {
		int q = n/s.length();
		int r = n%s.length();
		int partialString = (r==0)? 0:r;
		int aCount = q*letterCount(s,s.length())+letterCount(s,partialString);
		return aCount;
		
	}
	public static int letterCount(String s , int n) {
		int count= 0;
		for(int i = 0; i<n; i++)
			if(s.charAt(i)=='a')
				count++;
		return count;
	}
	
}
