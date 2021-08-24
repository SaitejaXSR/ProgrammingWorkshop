package demoPackage1;

import java.util.PriorityQueue;

public class Program4 {
	public static void main(String[] args) {
		PriorityQueue<Integer> a1 = new PriorityQueue<Integer>();
		a1.add(20);
		a1.add(15);
		a1.add(25);
		a1.add(30);
		System.out.println(a1.poll());
		System.out.println(a1.poll());
		System.out.println(a1);
		System.out.println(a1.poll());
		System.out.println(a1);
		
	}

}
