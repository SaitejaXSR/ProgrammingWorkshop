package stringPrograms;

public class Program4 {
	public static void main(String[] args) {
		String s = "India";
		char[] ch = new char[s.length()];
		for(int i = 0; i<ch.length; i++)
		{
			ch[i] = s.charAt(i);
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);			
		}
	}

}
