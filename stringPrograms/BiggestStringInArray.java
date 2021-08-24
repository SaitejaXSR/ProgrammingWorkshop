package stringPrograms;

public class BiggestStringInArray {
	public static void main(String[] args) {
		String[] s = {"orange","yellow","red","pink","blue"};
		String biggest = s[0];
		for(int i = 0; i<s.length;i++)
			if(s[i].compareTo(biggest)>0)
				biggest = s[i];
		System.out.println("biggest string is : "+biggest);
				
	}
}
