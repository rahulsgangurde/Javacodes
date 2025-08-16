package rahul;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num = 55665675;
		int org= num;
		int rev = 0;

		while (num != 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		
		System.out.println(rev);
		if(rev==org) {
		System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not Palindrome");
		}
	}
}
