package rahul;

public class LinerarSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 11, 2, 3, 49 };

		int Search = 11;

		boolean flag = false;
		for (int num : arr) {

			if (num == Search) {

				flag = true;
				break;
			}

		}
		if (flag == true) {

			System.out.println("number found");

		}
		if (flag == false) {

			System.out.println("number not found");

		}
	}
}
