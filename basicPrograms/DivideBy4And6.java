package basicPrograms;

import java.util.Scanner;

public class DivideBy4And6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the value");
		int a = scan.nextInt();
		
		System.out.println(a%4==0 && a%6==0? a+" is divisible by 4 and 6":a+" is not divisible by 4 and 6");

	}

}
