package demoPackage1;

import java.util.ArrayList;

public class MainClass1 {

	public static void main(String[] args) {
		ArrayList<Marker> a1 = new ArrayList<Marker>();
		a1.add(new Marker("White"));
		a1.add(new Marker("Red"));
		a1.add(new Marker("Black"));
		System.out.println(a1);

	}

}
