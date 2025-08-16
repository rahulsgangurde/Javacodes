package rahul;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String t = sc.nextLine();

        String org = t;  // Store original string
        String rev = "";

        int len = t.length();

        for (int i = len - 1; i >= 0; i--) {
            rev = rev + t.charAt(i);
        }

        System.out.println("Reversed String: " + rev);

        if (org.equals(rev)) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        sc.close();
    }
}
