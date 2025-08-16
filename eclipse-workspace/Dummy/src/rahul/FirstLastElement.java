package rahul;

import java.util.ArrayList;

public class FirstLastElement {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");

        if (!list.isEmpty()) {
            String firstElement = list.get(0); // First element
            String lastElement = list.get(list.size() - 1); // Last element

            System.out.println("First Element: " + firstElement);
            System.out.println("Last Element: " + lastElement);
        } else {
            System.out.println("The list is empty.");
        }
    }
}
