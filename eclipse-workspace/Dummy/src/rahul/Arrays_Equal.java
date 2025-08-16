package rahul;

public class Arrays_Equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 1, 2 };
		int[] b = { 1, 1, 2 };

		boolean status = true;

		if (a.length == b.length) {

			for (int i = 0; i < a.length; i++) {

				if (a[i] != b[i]) {

					status = false;
				}

			}

		} else {
			status = false;
		}
		if (status == true) {
			System.out.println("equal");
		} else {

			System.out.println("notequal");
		}
	}

}
