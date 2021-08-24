package loopingStatements;

import java.util.Scanner;

public class ReadCharByNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number b/w 1 and 26");
		int pos = scan.nextInt();
		if(pos>=1&&pos<=26) {
			int count = 0;
			for (char ch = 'A'; ch<='Z'; ch++) {
				count++;
				if (pos == count) {
					System.out.println("character "+ch+","+(char)(ch+32)+" is present in position "+pos);
				}
			}
		}
	}

}
