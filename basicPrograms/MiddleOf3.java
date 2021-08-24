package basicPrograms;

import java.util.Scanner;

public class MiddleOf3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 1st value");
		int a = scan.nextInt();
		System.out.println("enter 2nd value");
		int b = scan.nextInt();
		System.out.println("enter 3rd value");
		int c = scan.nextInt();
		
		int d = a>b && a<c || a<b && a>c ? a : b>c && b<a||b<c &&b>a ? b : c;
		System.out.println(d+" is middle");
		scan.close();
	}
}
