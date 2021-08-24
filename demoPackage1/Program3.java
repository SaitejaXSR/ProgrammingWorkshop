package demoPackage1;

import java.util.LinkedList;

public class Program3 {
	public static void main(String[] args) {
		LinkedList<Integer> a1 = new LinkedList<Integer>();
		a1.add(20);
		a1.add(15);
		a1.add(25);
		a1.add(30);
		System.out.println(a1.get(0)+" "+a1.get(1)+" "+a1.get(2)+" "+a1.get(3));
	}

}
