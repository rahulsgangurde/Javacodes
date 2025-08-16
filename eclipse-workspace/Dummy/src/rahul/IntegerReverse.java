package rahul;


public class IntegerReverse {

	public static void main(String arg[]) {

		int num = 4567;

//		int rev = 0;
//
//		while (num != 0) {
//
//			rev = rev * 10 + num % 10;
//			num = num / 10;
//		}
//
//		System.out.println(rev);
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		System.out.println(sb.reverse());
	

	}

}
