package rahul;

public class SmallestLargestNumber {

    public static void main(String[] args) {

        int[] arr = { 22, 34, 88, 89, 100 };

        int min = arr[0]; // Assume first element is smallest
        int max = arr[0]; // Assume first element is largest

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);
    }
}
