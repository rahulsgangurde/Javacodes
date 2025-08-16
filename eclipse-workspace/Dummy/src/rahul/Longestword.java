package rahul;

public class Longestword {

    public static void main(String[] args) {
        String str = "My Name is inshaallah";

        String word = "";
        String longest = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                word = word + ch;
            } else {
                if (word.length() > longest.length()) {
                    longest = word;
                }
                word = "";
            }
        }

        // Final check for last word
        if (word.length() > longest.length()) {
            longest = word;
        }

        System.out.println(longest);
    }
}
