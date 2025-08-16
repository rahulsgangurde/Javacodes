package rahul;

public class Missing_number {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5, 6}; // Missing number is 3
        int n = arr.length + 1; // Total count if no number was missing

        // Formula sum of first n natural numbers
        int expectedSum = n * (n + 1) / 2;

        // Sum of elements in array
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing Number: " + missingNumber);
    }
}
