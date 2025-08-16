package rahul;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 12, 11, 19, 100, 121, 45, };
		System.out.println("Before sort:" + Arrays.toString(a));

		int n = a.length - 1;

		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < n - 1; j++) {

				if (a[j] > a[j + 1]) {

					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}
			}
		}

		System.out.println("after sort:" + Arrays.toString(a));

	}

}
