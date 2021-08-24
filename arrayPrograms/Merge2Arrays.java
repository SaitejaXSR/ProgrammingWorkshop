package arrayPrograms;

public class Merge2Arrays {
	public static void main(String[] args) {
		
		int[] first = {1,2,3,4,5};
		int[] second = {6,7,8,9};
		int[] third = new int[first.length + second.length];
		System.out.println("first array");
		for(int i = 0 ; i<first.length; i++)
			System.out.print(first[i]+" ");
		System.out.println("\nsecond array");
		for(int i = 0 ; i<second.length; i++)
			System.out.print(second[i]+" ");
		
		int count = 0;
		for (int i = 0; i<first.length; i++)
		{
			third[count] = first[i];
			count++;
		}
		for(int i = 0 ; i<second.length; i++)
		{
			third[count] = second[i];
			count++;
		}
		System.out.println("\nthird array");
		for(int i = 0 ; i<third.length; i++) {
			System.out.print(third[i]+" ");
		}
		
		
	}
}
