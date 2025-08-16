package rahul;

public class CompareStrings {

    public static void main(String[] args) {

        String str1 = "Rahul";
        String str2 = "Rahul";

        boolean isEqual = true;

        // Step 1: Check length
        if (str1.length() != str2.length()) {
            isEqual = false;
        } else {
            // Step 2: Compare character by character
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    isEqual = false;
                    break;
                }
            }
        }

        if (isEqual) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are NOT equal");
        }
    }
}
