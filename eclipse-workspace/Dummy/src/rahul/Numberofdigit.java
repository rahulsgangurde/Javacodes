package rahul;

public class Numberofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 123974787;
		int count = 0;

		while (a > 0) {
			a = a / 10;
			count++;
		}
		System.out.println(count);
	}

}
