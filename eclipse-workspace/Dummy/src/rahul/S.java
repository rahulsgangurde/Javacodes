package rahul;

public class S {

    public static void main(String[] args) {

        String st = "Rahul";
        st=st.toLowerCase();
        char[] ch = st.toCharArray();
        char t;

        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = 0; j < ch.length - i - 1; j++) {
                if (ch[j] > ch[j + 1]) {
                    t = ch[j];
                    ch[j] = ch[j + 1];
                    ch[j + 1] = t;
                }
            }
        }

        System.out.println(new String(ch));
    }
}
