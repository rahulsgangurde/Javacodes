package rahul;

import java.util.HashSet;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr= {12,34,21,21,12};
		
		boolean flag=false;
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(hs.add(arr[i])==false) {;
			System.out.println("Duplicate Found: " + arr[i] + " at index:" +i);
			flag=true;
		}
		
	}
		if(flag==false) {
			
			System.out.println("Duplicate not Found");
			}
		}
}
