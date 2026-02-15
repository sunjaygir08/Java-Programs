public class LargestElement {
    public static void main(String[] args) {
        int[] data = {10, 3, 16, 1, 27, 98, 5, 112, 65, 8, 13, 123, 190};

        // Assume the first element is the largest
        int largest = data[0];

        // Traverse the array
        for (int i = 1; i < data.length; i++) {
            if (data[i] > largest) {
                largest = data[i];
            }
        }

        // Output the result
        System.out.println("The largest element in the array is: " + largest);
    }
}

