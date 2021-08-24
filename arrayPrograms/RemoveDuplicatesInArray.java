package arrayPrograms;

public class RemoveDuplicatesInArray {
	public static void main(String[] args) {
		int[] a = {19,39,19,49,19,69,39,19,49,69,39,19};
		int tc = 0;
		
		for(int i = 0; i<a.length; i++) {
			int ed = 0;
			for(int j = i; j>=0; j--) {
				if(a[i]==a[j]) {
					ed++;
				}
			}
			if(ed==1)
				tc++;
		}
		int[] a1 = new int[tc];
		int index = 0; 
		for(int i = 0; i<a.length;i++) {
			int oe = a[i];
			boolean isPresent = false;
			for(int j = 0; j<a1.length; j++) {
				int ie = a1[j];
				if(oe==ie) {
					isPresent = true;
					break;
				}
			}
			if(isPresent==false) {
				a1[index] = oe;
				index++;
			}
		}
		System.out.println("======Array with duplicates=======");
		for(int i : a)
			System.out.print(i+" ");
		System.out.println("\n======Array without duplicates=====");
		for(int j : a1)
			System.out.print(j+" ");
	}
}
