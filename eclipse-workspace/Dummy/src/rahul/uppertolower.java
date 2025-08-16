package rahul;

import java.util.Iterator;

public class uppertolower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer str = new StringBuffer("SHObha");

		for (int i = 0; i < str.length(); i++) {

			Character c = str.charAt(i);

			if (Character.isLowerCase(c)) {

				str.setCharAt(i, Character.toUpperCase(c));

			} else {
				if (Character.isUpperCase(c)) {

					str.setCharAt(i, Character.toLowerCase(c));

				}

				
			}

		}
		System.out.println(str);

	}
}
