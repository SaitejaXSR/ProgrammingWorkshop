package stringPrograms;

public class Program2 {
	public static void main(String[] args) {
		char[] ch = {'h','e','l','l','o'};
		String s ="";
		
		for(int i = 0 ; i<ch.length; i++) {
			s+=ch[i];
		}
		System.out.println(s);
	}

}
