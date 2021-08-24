package arrayPrograms;

import java.util.Scanner;

public class EvenIndex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = scan.nextInt();
		
		char[] ch = new char[size];
		System.out.println("enter the values");
		for(int i = 0;i<ch.length; i++)
			ch[i] = scan.next().charAt(0);
		
		for(int i = 0; i<ch.length;i++)
			if(i%2==0)
				System.out.println(ch[i]);
	}
}
