package rahul;

import java.util.Scanner;

public class StringReverse {

	public static void main(String arg[]) {
		
		Scanner sc = new Scanner (System.in);
		String t= sc.nextLine();
		int len =t.length();
		
		String rev= "";
		
	for(int i= len-1;i>=0;i--) {
		
		rev=rev+t.charAt(i);
		
	}
	System.out.println(rev);
	}
}
