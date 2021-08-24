package practisePrograms;

import java.util.Scanner;

public class UtopianTree {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of cycles");
		int t = scan.nextInt();
			for(int i = 0; i<t; i++) {
				System.out.println("height of tree in which cycle");
				int cycle = scan.nextInt();
				System.out.println(utopianTree(cycle));
			}
			scan.close();		
	}
	public static int utopianTree(int n) {
		return (1<< ((n>>1) +1)) -1 << n%2;
	}

}
