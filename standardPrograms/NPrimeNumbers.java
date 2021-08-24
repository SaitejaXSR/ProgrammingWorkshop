package standardPrograms;

import java.util.Scanner;

public class NPrimeNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the position of prime number");
		int pos = scan.nextInt();
		int count = 0;
		for(int i = 2; i<i+1; i++) {
			int num = i;
			boolean isPrime = false;
			for(int j=2; j<num;j++){
				if(num%j==0) {
					isPrime =true;
					break;
				}
			}
			if(isPrime == false)
				count++;
			if(count==pos) {
				System.out.println("prime number at position "+pos+" : "+num);
				break;
		}
		
		}
		
		
	}
}