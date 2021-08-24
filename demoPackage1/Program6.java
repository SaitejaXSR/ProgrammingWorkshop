package demoPackage1;
import java.util.ListIterator;
import java.util.ArrayList;
public class Program6 {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(34);
		a1.add(43);
		a1.add(45);
		a1.add(54);
		a1.add(65);
		a1.add(12);
		ListIterator<Integer> l1 = a1.listIterator();
		System.out.println(l1.next());
		System.out.println(l1.next());
		System.out.println(l1.hasNext());
		System.out.println(l1.previous());
		System.out.println(l1.previous());
		System.out.println(l1.hasPrevious());
		l1.remove();
		System.out.println(a1);
		System.out.println(l1.hasPrevious());
		System.out.println(l1.next());
		System.out.println(l1.next());
	}

}
