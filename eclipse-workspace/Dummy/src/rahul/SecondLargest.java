package rahul;

public class SecondLargest {

    public static void main(String[] args) {

        int[] arr = {12, 45, 1, 90, 34, 90};

        // Initialize the largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second largest number: " + secondLargest);
        }
    }
}
