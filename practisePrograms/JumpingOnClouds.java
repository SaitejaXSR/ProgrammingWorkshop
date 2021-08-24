package practisePrograms;

import java.util.Scanner;

public class JumpingOnClouds {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the no of clouds");
		int noOfClouds = scan.nextInt();
		int[] clouds = new int[noOfClouds];
		System.out.println("enter 0 for safe cloud and 1 for thunder cloud");
		for(int i = 0; i<clouds.length; i++)
			clouds[i]= scan.nextInt();
		System.out.println("min no of jumps to win : "+noOfJumps(clouds));
		
	}
	public static int noOfJumps(int[] n) {
		int count = 0;
		for(int i = 0; i<n.length-1;i++,count++) {
			if(i+2<n.length && n[i+2]==0)
				i++;			
		}
		return count;
	}

}
