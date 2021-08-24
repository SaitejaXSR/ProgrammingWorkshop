package demoPackage1;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Program5 {
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> h1 = new LinkedHashSet<Integer>();
		h1.add(30);
		h1.add(40);
		h1.add(50);
		h1.add(90);
		Iterator<Integer> i1 = h1.iterator();
		System.out.println(i1.next());
		System.out.println(i1.next());
		i1.remove();
		System.out.println(h1);
		System.out.println(i1.hasNext());
		System.out.println(i1.next());
		System.out.println(i1.next());
		System.out.println(i1.hasNext());
	}

}
