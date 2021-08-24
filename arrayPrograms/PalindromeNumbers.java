package arrayPrograms;

import java.util.Scanner;

public class PalindromeNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = scan.nextInt();
		int[] a = new int[size];
		System.out.println("enter the values");
		for(int i = 0; i<a.length ; i++) {
			a[i] = scan.nextInt();			
		}
		for(int i = 0 ;i<a.length; i++) {
			int pali = a[i];
			int rev = 0;
			while(pali>0) {
				rev = rev*10 + pali%10;
				pali/=10;
			}
			if(a[i]==rev) {
				System.out.println(a[i]+" is a palindrome");
			}
		}
	}

}
