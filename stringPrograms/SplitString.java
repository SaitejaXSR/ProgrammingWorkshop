package stringPrograms;

public class SplitString {
	public static void main(String[] args) {
		String s = "I love my mother and mother land";
		String[] s1 = s.split(" ");
		System.out.println(s);
		for(int i = s1.length-1 ; i>=0 ; i--)
			System.out.println(s1[i]);
	}
}