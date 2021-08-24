package demoPackage1;

import java.util.Enumeration;
import java.util.Vector;

public class Program8 {
	public static void main(String[] args) {
		
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(33);
		v1.add(44);
		v1.add(17);
		v1.add(98);
		v1.add(87);
		System.out.println(v1);
		Enumeration<Integer> e1 = v1.elements();
		System.out.println(e1.nextElement());
		System.out.println(v1.get(0));
		System.out.println(e1.hasMoreElements());
		
	} 

}
